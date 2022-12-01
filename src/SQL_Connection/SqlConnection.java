package SQL_Connection;
import java.sql.*;
public class SqlConnection {
	public static Connection getCon()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","0000");
			return con;
		}
		catch(Exception e)
		{
			return null;
		}
	}
}