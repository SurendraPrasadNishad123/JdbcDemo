import java.sql.*;

public class SelectJdbc {

	public static void main(String[] args) {
		try 
		{
			Connection conn=ConnectionProvider.getConnection();
			String query="select * from student";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
			st.close();
			conn.close();
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}

	}

}
