package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class UserDao {
	
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

public int save(User u) throws ClassNotFoundException, SQLException
{
	con = getConnection();
	String sql = "insert into adminuser(fname, lname, email, mob, salername, pass) values(?,?,?,?,?,?)";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1,u.getFname());
	ps.setString(2,u.getLname());
	ps.setString(3,u.getEmail());
	ps.setString(4,u.getMob());
	ps.setString(5,u.getTerms());
	ps.setString(6,u.getPass());
	
	int a = ps.executeUpdate();	
//	PreparedStatement ps = getConnection().prepareStatement(arg0);
//	return ps.executeUpdate();
	return a;
}

public boolean checkEmail(String email) throws ClassNotFoundException, SQLException
{
	con = getConnection();
	String sql = "SELECT * FROM adminuser WHERE email =?";
	PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	
	ps.setString(1,email);
	
	
	ResultSet rs = ps.executeQuery();
	boolean a = rs.absolute(1);
//	PreparedStatement ps = getConnection().prepareStatement(arg0);
//	return ps.executeUpdate();
	return a;
}

public boolean checkUser(String email,String pass) throws ClassNotFoundException, SQLException
{
	String sql="SELECT * FROM adminuser WHERE email=? and pass=?";
	PreparedStatement ps=getConnection().prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

	ps.setString(1,email);
	ps.setString(2,pass);
	
	ResultSet rs=ps.executeQuery();
	boolean a=rs.absolute(1);
	return a;
}

public int countUser() throws ClassNotFoundException, SQLException
{
	con = getConnection();
	String sql = "SELECT COUNT(*) FROM user";
	PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	
	
	
	
	ResultSet rs = ps.executeQuery();
	rs.next();
	int a = rs.getInt(1);
//	PreparedStatement ps = getConnection().prepareStatement(arg0);
//	return ps.executeUpdate();
	return a;
}

public int countProduct() throws ClassNotFoundException, SQLException
{
	con = getConnection();
	String sql = "SELECT COUNT(*) FROM product";
	PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	
	
	
	
	ResultSet rs = ps.executeQuery();
	rs.next();
	int a = rs.getInt(1);
//	PreparedStatement ps = getConnection().prepareStatement(arg0);
//	return ps.executeUpdate();
	return a;
}

public int countPurches() throws ClassNotFoundException, SQLException
{
	con = getConnection();
	String sql = "SELECT COUNT(*) FROM purches";
	PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	
	
	
	
	ResultSet rs = ps.executeQuery();
	rs.next();
	int a = rs.getInt(1);
//	PreparedStatement ps = getConnection().prepareStatement(arg0);
//	return ps.executeUpdate();
	return a;
}

public int countOrder() throws ClassNotFoundException, SQLException
{
	con = getConnection();
	String sql = "SELECT COUNT(*) FROM orders";
	PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	
	
	
	
	ResultSet rs = ps.executeQuery();
	rs.next();
	int a = rs.getInt(1);
//	PreparedStatement ps = getConnection().prepareStatement(arg0);
//	return ps.executeUpdate();
	return a;
}

}
