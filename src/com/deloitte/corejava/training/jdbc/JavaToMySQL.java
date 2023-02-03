package com.deloitte.corejava.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class JavaToMySQL {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		try {
			// 1. register the driver class
		//	Class.forName("com.mysql.jdbc.Driver");
			// 2. create connection object
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			/*
			 * DatabaseMetaData dbmd = connection.getMetaData();
			 * 
			 * System.out.println(dbmd.getDatabaseMajorVersion());
			 * System.out.println(dbmd.getDatabaseProductName());
			 * System.out.println(dbmd.getDriverName()); System.out.println(dbmd.getURL());
			 */
			// 3. create statement object
			connection.setAutoCommit(false);
			
			CallableStatement callableStmt = connection.prepareCall("call INSERTR(?,?,?)");
			callableStmt.setInt(1,110);
			callableStmt.setString(2, "Modi");
			callableStmt.setInt(3, 80000);
			
			callableStmt.execute();
			System.out.println("procedure is called successfully..");
			
			/*
			 * ResultSetMetaData rsmd = rs.getMetaData();
			 * 
			 * System.out.println(rsmd.getColumnCount());
			 * System.out.println(rsmd.getColumnName(1));
			 * System.out.println(rsmd.getColumnTypeName(1));
			 */
			
			
			/*
			 * int id=101; PreparedStatement pstmt =
			 * connection.prepareStatement("insert into emp values (?,?,?)");
			 * pstmt.setInt(1, 105); pstmt.setString(2,"Patel"); pstmt.setInt(3, 50000);
			 * pstmt.addBatch(); pstmt.setInt(1, 106); pstmt.setString(2,"Pathan");
			 * pstmt.setInt(3, 60000); pstmt.addBatch(); pstmt.setInt(1, 107);
			 * pstmt.setString(2,"Boomra"); pstmt.setInt(3, 70000); pstmt.addBatch();
			 * 
			 * int[] executeBatch = pstmt.executeBatch();
			 * 
			 * System.out.println(executeBatch.length+" (s) are inserted");
			 */
			connection.commit();
			
			

		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			connection.close();
		}

	}

}
