package mkoner.jdbc;

import java.sql.*;


public class Dao {
	
	Connection con = null;
	
	public void connect() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "P@ss12345";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, user, password);
	}
	
	public void closeConnection() throws SQLException {
		con.close();
	}
	
	public User getUser(int userId) throws SQLException {
		String query = "select * from users where id=" + userId;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		int id = rs.getInt(1);
		String name = rs.getString(2);
		//st.close();
		return new User(id, name);
	}
	
	public int addUser(User user) throws SQLException {
		String query = "insert into users values(?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, user.getUserId());
		ps.setString(2, user.getName());
		//ps.close();
		return ps.executeUpdate();
	}

}
