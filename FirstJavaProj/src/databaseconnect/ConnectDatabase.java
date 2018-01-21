package databaseconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDatabase {

	public static void main(String[] args) {
		try{
			//Registering the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from mytable2");
			
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t"+rs.getString("location")+"\t"+rs.getLong(3));
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
