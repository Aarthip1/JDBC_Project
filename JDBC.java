package javaapplication5;
import java.sql.*;

public class JavaApplication5
{
	public static void main(String args[])
	{
		try
		{       
                    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost: 3306/alumni_management_system", "root","Aarthi@23");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Alumni");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
		}catch (Exception e) {}
	}
}

