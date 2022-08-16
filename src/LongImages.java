import java.sql.*;

import javax.swing.JFileChooser;

import java.io.*;
public class LongImages {

	public static void main(String[] args) {
		try 
		{
			Connection conn=ConnectionProvider.getConnection();
			
			String query="insert into images (pic) values(?)";
			
			PreparedStatement st=conn.prepareStatement(query);
			
			JFileChooser jfc=new JFileChooser();
			jfc.showOpenDialog(null);
			File file=jfc.getSelectedFile();
			
			FileInputStream fs=new FileInputStream(file);
			st.setBinaryStream(1,fs,fs.available());
			
			st.executeUpdate();
			System.out.println("Data inserted successfully");
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}

	}

}
