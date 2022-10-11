package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PurchesDao {
	
	private String url="jdbc:mysql://localhost:3306/ecomerce";
	private String uname="root";
	private String pass="abc123";
	private Connection con;
	
	
	public java.util.List<Purches> getAllpurches() throws ClassNotFoundException, SQLException
	{
		String sql="SELECT * FROM purches";
		PreparedStatement ps=getConnection().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		java.util.List<Purches> ul=new ArrayList<Purches>();
		
		
		while(rs.next())
		{
			Purches p =new Purches();
			p.setpId(rs.getInt(1));
			p.setpName(rs.getString(2));
			p.setuName(rs.getString(3));
			p.setStatus(rs.getString(4));
			p.setDate(rs.getString(5));

			
			ul.add(p);
		}
		

		return ul;
	}
	
	
private Connection getConnection() throws ClassNotFoundException, SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	con=DriverManager.getConnection(url,uname,pass);
	
	return con;
}
	
	public int deletePurches(int pid) throws ClassNotFoundException, SQLException
	{
		String sql="delete FROM purches where pId=?";
		PreparedStatement ps=getConnection().prepareStatement(sql);
	    ps.setInt(1, pid);
	
		int a=ps.executeUpdate();
	
		return a;
	}

}
