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
	
	private Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection(url,uname,pass);
		
		return con;
	}
	
	
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
	
	

	
	public int deletePurches(int pid) throws ClassNotFoundException, SQLException
	{
		String sql="delete FROM purches where pId=?";
		PreparedStatement ps=getConnection().prepareStatement(sql);
	    ps.setInt(1, pid);
	
		int a=ps.executeUpdate();
	
		return a;
	}
	
	public Purches updatePurches(int pid) throws ClassNotFoundException, SQLException
	{
		String sql="SELECT * FROM purches where pId=?";
		PreparedStatement ps=getConnection().prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	    ps.setInt(1, pid);
	
		ResultSet a=ps.executeQuery();
		
		a.absolute(1);
		
		Purches p = new Purches();
		
		p.setpId(a.getInt(1));
		p.setpName(a.getString(2));
		p.setuName(a.getString(3));
		p.setStatus(a.getString(4));
		p.setDate(a.getString(5));
	
		return p;
	}
	
	public int updatePurchesData(int pId, String pName, String uName, String status, String date) throws ClassNotFoundException, SQLException
	{
		String sql="UPDATE purches SET pName=?, uName=?, status=?, date=? WHERE pId=?";
		PreparedStatement ps=getConnection().prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	    ps.setInt(5, pId);
	    ps.setString(1,pName);
	    ps.setString(2,uName);
	    ps.setString(3,status);
	    ps.setString(4,date);
	
		int a=ps.executeUpdate();
	
		return a;
	}

}
