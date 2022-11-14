package jdbcconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class auto_generated_value_retrieve {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Tushar@1231");
			String s="insert into dada2(name,salary)values(?,?)";
		    //Statement st=con.createStatement();
		    PreparedStatement stmt=con.prepareStatement(s,Statement.RETURN_GENERATED_KEYS);
		    stmt.setString(1, "romi");
		    stmt.setInt(2, 13000);
		    stmt.executeUpdate();
		    ResultSet rs=stmt.getGeneratedKeys();
		    if(rs.next()) {
		    	System.out.println("Your id is:"+rs.getInt(1));
		    }
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
