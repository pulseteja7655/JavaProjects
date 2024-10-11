//deleting data 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("driver loaded sucessfully");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprogram","root", "root");
		System.out.println("connection established");

		String s="delete from student where id=?";
		PreparedStatement pstmt=con.prepareStatement(s);
		System.out.println("enter id");
		int id=scan.nextInt();
		pstmt.setInt(1, id);
		int rows=pstmt.executeUpdate();
		System.out.println(rows);
	}

}
