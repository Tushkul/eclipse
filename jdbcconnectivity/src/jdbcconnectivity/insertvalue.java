package jdbcconnectivity;
import java.sql.*;
public class insertvalue {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.jc.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tushar","root","Tushar@1231"); 
		Statement st=con.createStatement();
		
		}
		catch(Exception e) {
			
		}
	}

}
