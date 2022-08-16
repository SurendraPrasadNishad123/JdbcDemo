
import java.sql.*;
import java.io.*;
public class InsertDataDynamicInput {

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
			String query="insert into student (name, percentage, address) values(?,?,?)";
			//create PreparedStatement
					PreparedStatement st=con.prepareStatement(query);
			//taking input from console through buffered reader
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					
					System.out.println("Enter Student Name?");
					String name=br.readLine();
					
					System.out.println("Enter Student Percentage?");
					String per=br.readLine();
					int percentage=Integer.parseInt(per);
					//int percentage=Integer.valueOf(per);
					
					System.out.println("Enter Student address?");
					String address=br.readLine();
					
					//set values to the query
					st.setString(1,name);
					st.setInt(2, percentage);
					st.setString(3,address);
					
		 //execute query
					st.executeUpdate();
					System.out.println("Data inserted successfully!");
		//connection close
					st.close();
					con.close();
			}
		catch(Exception e) {
		e.printStackTrace();
		}

	}

}
