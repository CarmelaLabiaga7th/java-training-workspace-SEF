package sef.module13.sample;

import java.sql.*;

public class ConnectionSample {

	//	This source code tries to establish a connection to a MySQL server
	//	and displays a message concerning the error if connection fails
	public static void main(String[] args) {

		try {
			//String url = "jdbc:mysql://localhost/activity";
		    String url = "\"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(HOST=localhost)(PORT=1521)(PROTOCOL=tcp))(CONNECT_DATA=(SERVICE_NAME=XEPDB1)))\\r\\n\", \"hr\", \"hr\"";
			//String user = "root";
			//String pass = "abcd1234";
			String user = "hr";
            String pass = "hr";
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established! \n");
			
			//cn.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
