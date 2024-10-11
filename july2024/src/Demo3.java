//program for accessing individual student details 

import java.sql.Connection;
//import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//import java.util.Scanner;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
//import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) throws Exception {
		    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		    System.out.println("Driver loaded successfully");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","Kruthik2002@");
		    System.out.println("Connection established");
		    String s = "select * from students where student_id=?";
		    PreparedStatement pstmt = con.prepareStatement(s);
		    System.out.println("Enter the id");
		    Scanner sc = new Scanner(System.in);
		    int id = sc.nextInt();
		    pstmt.setInt(1,id);
		    ResultSet res = pstmt.executeQuery();
		    if(res.next()) {
		    id=res.getInt(1);
		    String name = res.getString(2);
		    int marks1 = res.getInt(3);
		    int marks2 = res.getInt(4);
		    int marks3 = res.getInt(5);
		    System.out.println(id+" "+name+" "+marks1+" "+marks2+" "+marks3);
		}

		
	}
}

