package java_database_connectivity_jdbc;
/*HERE WE WILL FOLLOW THOSE 7 STEPS WE WROTE IN NOTES*/

/*required imports*/
import java.sql.*;

/*main class*/
public class Jdbc_demo {

	/*main method*/ /*forName must have exception handling*/
	public static void main(String[] args) throws Exception {
	
		/*declaring variables*/
		/*hapa unaspecify kuwa unawork na jdbc pia dbms ni mysql
		 * then unaandika portnumber yako then jina la database*/
		String url = "jdbc:mysql://localhost:3306/abc?useSSL=false";
		String userName = "root";
		String passWord = "root";
		String query = "select * from student";
		String userData = "";
		
		/*load and registerin the driver*/
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		/*Connection is an interface doesnt have class work with it 
		 * but it has method called getConneciotn which form class called driverManager*/
		Connection con = DriverManager.getConnection(url, userName, passWord);
		
		/*creating a statement object*/
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		/*use this to bring more than one data*/
		while(rs.next()) {
			/*here we put some column*/
			userData = rs.getInt(1) + " : " + rs.getString(2);
			/*here we display the output*/
			System.out.println(userData);

		}
		/*closing the connection and statement*/
		con.close();
		st.close();
		
	}

}
