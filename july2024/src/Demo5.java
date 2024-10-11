//updating a data in the table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
//import java.util.Scanner;
public class Demo5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stu


DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
System.out.println("driver loaded sucessfully");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprogram","root", "root");
System.out.println("connection established");

String s="update student set name=? where id=?";
PreparedStatement pstmt=con.prepareStatement(s);
Scanner scan=new Scanner(System.in);
System.out.println("enter the name");
String name=scan.next();
System.out.println("enter the id");
int id=scan.nextInt();

pstmt.setString(1, name);
pstmt.setInt(2, id);
int rows=pstmt.executeUpdate();
System.out.println(rows);
	}

}
