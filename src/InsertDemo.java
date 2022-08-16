import java.sql.*;
public class InsertDemo {

	public static void main(String[] args) {
		try {
		
		//loading and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establishing connection
		String url="jdbc:mysql://localhost:3306/school";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		
		
		
		//query
		String query="create table teacher (tId int(20) not null primary key auto_increment,tName varchar(50) not null ,tCity varchar(400) not null)";
		
		//create statement
				Statement st=con.createStatement();
	 //execute query
				st.executeUpdate(query);
				System.out.println("Table created successfully!");
				st.close();
				con.close();
		}
		catch(Exception e) {}

	}

}
