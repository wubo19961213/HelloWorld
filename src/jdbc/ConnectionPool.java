package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	List <Connection> cs = new ArrayList();
	int size;
	public  ConnectionPool(int size) {
		this.size = size;
		this.init();
	}
	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			for(int i = 0;i<size;i++)
			{
				Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?"
						+ "characterEncoding=utf-8","root","root");
				cs.add(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public synchronized Connection getConnection()
	{
		while(cs.isEmpty())
		{
			try {
				this.wait();
				System.out.println("ит╣хр╩об");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		Connection c = cs.remove(0);
		return c;
	}
	public synchronized void returnConnection(Connection c)
	{
		cs.add(c);
		this.notifyAll();
	}
}
