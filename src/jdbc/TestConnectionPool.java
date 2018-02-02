package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import charactor.Hero;

public class TestConnectionPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionPool cp = new ConnectionPool(3);
		for(int i=0;i<10;i++)
		{
			Hero h = new Hero("");
			//h.id = i;
			h.name = "WorkingThread"+i;
			h.hp = i;
			h.damage = i+100;
			new WorkingThread("WorkingThread"+i,cp,h).start();
		}
	}
}
class WorkingThread extends Thread {
    private ConnectionPool cp;
    private Hero h;
    public WorkingThread(String name, ConnectionPool cp,Hero h) {
        super(name);
        this.cp = cp;
        this.h = h;
    }
    public void run() {
    	Connection c = cp.getConnection();
    	System.out.println(this.getName()+":\t获取一个数据库连接，并开始工作");
    	String sql = "insert into hero value(null,?,?,?)";
    	try (PreparedStatement ps = c.prepareStatement(sql)){
			Thread.sleep(1000);
			//ps.setInt(1,h.id);
			ps.setString(1,h.name);
			ps.setFloat(2,h.hp);
			ps.setInt(3,h.damage);
			ps.execute();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	cp.returnConnection(c);
    }
    
}
