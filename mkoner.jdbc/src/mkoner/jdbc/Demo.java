package mkoner.jdbc;
import java.sql.*;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
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
		*/
		
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
		
		/*
		 //quuery2
		int affectedRows = st.executeUpdate(query2);
		System.out.println(affectedRows + "row(s) affected");
		*/
		
		/*
		int userId = 6;
		String username = "Aisha";
		String query3 = "insert into users values(" + userId + ", '" + username + "')" ;
		int affectedRows = st.executeUpdate(query3);
		System.out.println(affectedRows + "row(s) affected");
		*/
		
		/*
		int userId = 7;
		String username = "Jane";
		String query4 = "insert into users values(?,?)" ;
		PreparedStatement ps = con.prepareStatement(query4);
		ps.setInt(1, userId);
		ps.setString(2, username);
		int affectedRows = ps.executeUpdate();
		System.out.println(affectedRows + "row(s) affected");
		
		*/
		
		Dao dao = new Dao();
		dao.connect();
		//dao.getUser(1);
		System.out.println(dao.getUser(1));
		
		User user = new User(8, "Fatima");
		dao.connect();
		System.out.println(dao.addUser(user) + "row(s) affected");
		
		dao.closeConnection();
		
		
	}

}
