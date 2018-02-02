package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestJDBC {
	public static void execute(String sql)
	{
		Statement s = null;
		Connection c = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/biubiu?characterEncoding=UTF-8",
                            "root", "root");
			System.out.println("数据库程序加载成功！");
			s = c.createStatement();
			ResultSet rs = s.executeQuery(sql);
			while(rs.next())
			{
				String name = rs.getString("user_name");
				String password = rs.getString("user_password");
				String email = rs.getString("user_email");
				String gendar = rs.getString("user_gender");
				Date birthday = rs.getDate("user_birthday");
				System.out.printf("用户名为：%s,密码：%s,邮箱：%s,性别：%s,生日为：%tF%n",name,password
						,email,gendar,birthday);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(s != null)
			{
				try {
					s.close();
				} catch (SQLException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if(c != null)
			{
				try {
					c.close();
				} catch (SQLException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
	public static void list(int start, int count)
	{
		
		String sql = "select * from user limit "+start+count;
		TestJDBC.execute(sql);
	}
	public static void inserList(int start, int count)
	{
		
		String sql = "select * from user limit "+start+count;
		TestJDBC.execute(sql);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TestJDBC.list(2, 1);
		try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		
        String sql = "insert into user values(?,?,?,?,?,?,null,?)";
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/biubiu?characterEncoding=UTF-8","root", "root");
            // 根据sql语句创建PreparedStatement
            PreparedStatement ps = c.prepareStatement(sql);
        ) {

        	SimpleDateFormat sDF = new SimpleDateFormat("yyyy-MM-dd");
        	Date date_1;
			date_1 = sDF.parse("2018-1-1");
			ps.setString(1, "13061282789");
            ps.setString(2, "提莫");
            ps.setString(3,"123" );
            ps.setString(4,"2548364615@qq.com");
            ps.setString(5, "保密");
            ps.setDate(6, new java.sql.Date(date_1.getTime()));
            ps.setInt(7, 6);
            // 执行
            ps.execute();
        	
  
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
