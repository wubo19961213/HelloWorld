package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import charactor.Hero;

public class HeroDAO implements Dao{
	public HeroDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", "root",
                "root");
    }
	public int getTotal() {
        int total = 0;
        try (Connection c = getConnection(); Statement s = c.createStatement();) {
  
            String sql = "select count(*) from hero";
  
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                total = rs.getInt(1);
            }
  
            System.out.println("total:" + total);
  
        } catch (SQLException e) {
  
            e.printStackTrace();
        }
        return total;
    }
	@Override
	public void add(Hero hero) {
		// TODO Auto-generated method stub
		String sql = "insert into hero value(null,?,?,?)";
		try(Connection c = this.getConnection();PreparedStatement ps = c.prepareStatement(sql))
		{
			ps.setString(1, hero.name);
			ps.setFloat(2,hero.hp);
			ps.setInt(3, hero.damage);
			ps.execute();
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void update(Hero hero) {
		// TODO Auto-generated method stub
		String sql = "update hero set name = ?,hp = ?,damage = ?where id = ?";
		try(Connection c = this.getConnection();PreparedStatement ps = c.prepareStatement(sql)) {
			ps.setString(1, hero.name);
			ps.setFloat(2, hero.hp);
			ps.setInt(3, hero.damage);
			ps.setInt(4, hero.id);
			ps.execute();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql = "delete hero where id = ?";
		try (Connection c = this.getConnection();PreparedStatement ps =c.prepareStatement(sql)){
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public Hero get(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from hero where id = ?";
		try(Connection c = this.getConnection(); PreparedStatement ps =c.prepareStatement(sql)){
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				Hero h = new Hero("");
				h.name = rs.getString(2);
				h.hp = rs.getFloat(3);
				h.damage = rs.getInt(4);
				h.id = rs.getInt(1);
				return h;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Hero> list() {
		// TODO Auto-generated method stub
		return this.list(0,Short.MAX_VALUE);
	}

	@Override
	public List<Hero> list(int start, int count) {
		// TODO Auto-generated method stub
		List<Hero> heros = new ArrayList();
		String sql = "select * from hero order by id desc limit ?,?";
		try(Connection c = this.getConnection();PreparedStatement ps = c.prepareStatement(sql);)
		{
			ps.setInt(1, start);
			ps.setInt(2, count);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Hero hero = new Hero("");
				hero.name = rs.getString("name");
				hero.id	= rs.getInt("int");
				hero.hp	= rs.getFloat(3);
				hero.damage	= rs.getInt(4);
				heros.add(hero);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return heros;
	}

}
