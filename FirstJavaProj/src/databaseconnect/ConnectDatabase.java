package databaseconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDatabase {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from mytable2");
			
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t");
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
