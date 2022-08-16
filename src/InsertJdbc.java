import java.sql.*;


public class InsertJdbc {

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
			//set values to the query
					st.setString(1, "Ravindra");
					st.setInt(2, 54);
					st.setString(3, "Bhairahawa");
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
