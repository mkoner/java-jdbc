package mkoner.jdbc;
import java.sql.*;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "P@ss12345";
		
		String query = "SELECT name FROM users where id=1";
		String query1 = "SELECT * FROM users";
		String query2 = "insert into users values(3, 'Ibrahim')";
		//String query2 = "delete from users where id=3";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		
		/*
		 //query
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("name");
		System.out.println(name);
		*/
		
		/*
		 //query1
		ResultSet rs = st.executeQuery(query1);
		String userData = "";
		while(rs.next()) {
			userData = rs.getInt(1) + ": " + rs.getString(2);
			System.out.println(userData);
		}
		*/
		
		int affectedRows = st.executeUpdate(query2);
		System.out.println(affectedRows + "row(s) affected");
		
	}

}
