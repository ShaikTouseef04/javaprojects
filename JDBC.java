package xyz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC{

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb","root","3343");
			String insertSQL = "REPLACE INTO students VALUES (?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertSQL);
			
			Object[][] students = {
					{1, "Touseef"},
					{2, "Saif"},
					{3, "Safan"},
					{4, "Khalid"},
					{5, "Abdul Rab"},
					{6, "Mohammed"}
					};
			for (Object[] student : students) {
				pstmt.setInt(1, (int) student[0]);
				pstmt.setString(2, (String) student[1]);
				pstmt.executeUpdate();
			}
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM students");
			
			System.out.println("Student List:");
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
			con.close();
		}
			catch(Exception e) {
				e.printStackTrace();
			}
}
}