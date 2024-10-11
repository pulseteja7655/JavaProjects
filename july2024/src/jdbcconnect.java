import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbcconnect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
  DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
  System.out.println("driver loaded successfully");
  
  connection con=(connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024"
  		+ " "," root"," root");
  System.out.println("connection established");
  String s="select * from student";
  Statement stmt=con.createStatement();
  ResultSet res=stmt.executeQuery(s);
  ResultSetMetaData rsmd=res.getMetaData();
  for(int i=1;i<=getcolumnCount()-1;i++) {
	  System.out.println(rsmd.getColumnName(i));
	  System.out.println(rsmd.getColumnTypeName(i));
  }
	}

	private static int getcolumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
