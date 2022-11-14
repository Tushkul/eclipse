package jdbcconnectivity;

import java.sql.*; 
public class jdbcpro {  	
	public static void main(String[] args)  
	{ 		try  		{ 		
	
		//driver connectivity basic info 		
		Class.forName("com.mysql.cj.jdbc.Driver"); 		
		//connection creation and idenify the user and database 	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tushar","root","Tushar@1231"); 
		//creating the statement 		
		Statement st=con.createStatement(); 		
		//executing the statement and call the sql query 		
		ResultSet rset=st.executeQuery("select * from employ where eno=1");
		

	//after getting connection the table record we want to call one by one  	
	while(rset.next()) 			
		System.out.println(rset.getString(1)+"   "+rset.getString(2)+"   "+rset.getString(3)); 	
	//finally we are ready to close the jdbc connection 	
	con.close(); 		} 	
//if the connection is is there our compiler jump to the catch block 	
catch(Exception e) 		
{ 			System.out.println(e); 		} 
}
	
}                    

