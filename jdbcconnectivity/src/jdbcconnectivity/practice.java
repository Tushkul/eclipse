package jdbcconnectivity;
import java.sql.*;
import java.util.Scanner;
import java.io.*;
//adding foreign key using database........
public class practice {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
try {
//	System.out.println("Enter eid of employ.");
//	int eid=sc.nextInt();
//	//int id=eid;
//	System.out.println("enter name of employ;");
//	String name=sc.next();
//	System.out.println("enter surname of employ.");
//	String surname=sc.next();
//	System.out.println("enter salary of employ.");
//	long salary=sc.nextLong();
//	System.out.println("Enter foreign key from other table.");
//	int fk=sc.nextInt();
	System.out.println("enter eid for result:");
	int id=sc.nextInt();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Tushar@1231");

String s="select * from employ where eid="+id;
    Statement st=con.createStatement();

ResultSet rs=st.executeQuery(s);

//PreparedStatement ps=con.prepareStatement(s);
while(rs.next()) {
	System.out.println("your id ="+rs.getInt(1));
	//System.out.println("hello");
}
//ps.executeUpdate();
    //    String s="insert into employ(eid,name,surname,salary,fk) values(?,?,?,?,?)";
//System.out.println(rs.getString(1)+"");

    //    PreparedStatement ps=con.prepareStatement(s);
//    ps.setInt(1,eid);
//    ps.setString(2,name);
//    ps.setString(3,surname);
//    ps.setLong(4, salary);
//    ps.setInt(5, fk);
//    ps.executeUpdate();
    con.close();
    System.out.println("records inserted successfully....");
    } 
catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
}
	}

}
