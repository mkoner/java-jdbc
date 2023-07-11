package mkoner.jdbc;
import java.sql.*;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "P@ss12345";
		
		String query = "SELECT name FROM users where id=1";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("name");
		System.out.println(name);
		
			
	}

}
