import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	    System.out.println("Driver loaded successfully");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","Kruthik2002@");
	    System.out.println("Connection established");
	    String s = "select * from students where student_id=?";
	    PreparedStatement pstmt = con.prepareStatement(s);
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the id");
	    int id=sc.nextInt();
	    System.out.println("enter the name:");
	    
	    String name=sc.next();
	    System.out.println("enter the marks1");
	    int marks1=sc.nextInt();
        System.out.println("enter the marks2");
	    int marks2=sc.nextInt();
        System.out.println("enter the marks3");
	    int marks3=sc.nextInt();
	    pstmt.setInt(1,id);
	    pstmt.setString(2,name);
	    pstmt.setInt(3,marks1);
	    pstmt.setInt(4,marks2);
	    pstmt.setInt(5,marks3);
	    int rows=pstmt.executeUpdate();
	    System.out.println(rows);
	}

}
