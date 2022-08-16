import java.sql.*;
public class Test {
 public static void main(String args[]) {
	 try {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
	 if(con.isClosed()) 
	 {
		 System.out.print("Connection is closed");
	 }
	 else 
	 {
		 System.out.print("Connection is opened"); 
	 }
	 
	 Statement st=con.createStatement();
	 st.executeQuery("insert into student (name, percentage,address) values('Amit',53,'Bhairahawa')");
	
	 }
	 catch(Exception e) {
		 System.out.print(e.getStackTrace());
	 }
 }
}
