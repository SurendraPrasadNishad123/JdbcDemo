import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class UpdateStudent {

	public static void main(String[] args) {
		
		try 
		{
			Connection conn=ConnectionProvider.getConnection();
			
			String query="update student set name=?, percentage=?,address=? where roll_number=?";
			
			PreparedStatement st=conn.prepareStatement(query);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter new name:");
			String name=br.readLine();
			
			System.out.println("Enter new Percentage:");
			String per=br.readLine();
			int percentage=Integer.parseInt(per);
			
			System.out.println("Enter new address:");
			String address=br.readLine();
			
			System.out.println("Enter Roll number, where you want to modify ");
			String roll=br.readLine();
			int roll_number=Integer.parseInt(roll);
			 
			
			st.setString(1, name);
			st.setInt(2, percentage);
			st.setString(3, address);
			st.setInt(4, roll_number);
			
			st.executeUpdate();
			System.out.println("Data updated successfully!");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}

	}

}
