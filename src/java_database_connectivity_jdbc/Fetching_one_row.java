package java_database_connectivity_jdbc;
/*HERE WE WILL TRY TO FETCH ONE ROW OF DATA FROM OUR DATABASE*/

/*needed imports*/
import java.sql.*;

/*main class*/
public class Fetching_one_row {

	/*main method*/
	public static void main(String[] args) throws Exception{

		/*initializing some variables*/
		String url = "jdbc:mysql://localhost:3306/abc?allowPublicKeyRetrieval=true&useSSL=false";
		String userName = "root";
		String passWord = "root";
		
		/*setting a query*/
		String query = "select name from student where id=1";
		
		/*load and registering a driver*/
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		/*establishing a connection*/
		Connection con = DriverManager.getConnection(url, userName, passWord);
		
		/*making a statement*/
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		/*if there we have something*/
		rs.next();
		
		/*lets give this query to a string so that we can display it*/
		String string = rs.getString("name");
		
		/*displaying the output*/
		System.out.println(string);
		
		/*here lets close the connection and statement*/
		con.close();
		st.close();
		
	}

}
