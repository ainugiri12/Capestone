package orjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * register the driver class
		 */
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl ","c##scott","tiger");
		
//		Statement stmt =con.createStatement();
		PreparedStatement stmt1 = con.prepareStatement("insert into emp6 values(?,?,?)");
		stmt1.setInt(1, 201);
		stmt1.setString(2, "GIRIPRASAD");
		stmt1.setString(3, "git@atos.net");
//		stmt1.setInt(4, 12);
		int noofrec = stmt1.executeUpdate();
		System.out.println("No of tuples inserted "+noofrec);
		
//		ResultSet rs = stmt.executeQuery("SELECT * FROM CLASSES");
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
//		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //url
	}
}
