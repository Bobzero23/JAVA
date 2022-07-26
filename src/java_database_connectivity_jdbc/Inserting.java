package java_database_connectivity_jdbc;
/*HERE WE WILL SEE HOW TO INSERT A ROW IN THE DATABASE*/

/*needed imports*/
import java.sql.*;

/*main class*/
public class Inserting {

	/*main method*/
	public static void main(String[] args) throws Exception {

		/*things I will use later*/
		String url = "jdbc:mysql://localhost:3306/abc?useSSL=false";
		String userName = "root";
		String passWord = "root";
		String query = "insert into student values (8, 'Fate')";
		
		
		/*loading and registering a driver*/
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		/*establishing a connection*/
		Connection con = DriverManager.getConnection(url, userName, passWord);
		
		/*creating a statement*/
		Statement st = con.createStatement();
		
		/*executing a query*/ /*this methodis boolean*/
		int count = st.executeUpdate(query);
		
		/*dipslaying the output*/
		System.out.println(count + " row/s effected");
		
	}

}
