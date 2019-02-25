/**
 * 
 */

/**
 * @author devillord17
 *
 */
import java.sql.*;
public class JDBC_Connection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try 
		{
			//1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Aditya@17"); //JDBC conection_url//Student is DB name, user name,password
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQL query
			ResultSet myRes = myStmt.executeQuery("select * from STUtable1"); //STUtable1 is a table under DB Student 
			//4. Process the result set
			while(myRes.next()) {
				System.out.println(myRes.getInt("usn")+" and "+myRes.getString("name")); //To print the selected results on the screen
			
			}
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
