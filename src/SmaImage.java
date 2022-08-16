import java.sql.*;
import java.io.*;
public class SmaImage {

	public static void main(String[] args) {
		
try 
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String url="jdbc:mysql://localhost:3306/school";
	String username="root";
	String password="root";
	Connection con=DriverManager.getConnection(url,username,password);
	
	String query="insert into images (pic) values(?)";
	
	PreparedStatement st=con.prepareStatement(query);
	
	FileInputStream fs=new FileInputStream("C:\\Users\\LENOVO\\Pictures\\m1.png");
	st.setBinaryStream(1,fs,fs.available());
	
	st.executeUpdate();
	System.out.println("Data inserted successfully");
	}
catch(Exception e) 
{
	System.out.println("Error!!!");
	
	}
	
	}

}
