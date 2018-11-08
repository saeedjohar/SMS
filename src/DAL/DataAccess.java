package DAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataAccess {

		Connection con = null;
		Statement st = null;
	 	ResultSet rs=null;
		
		String url ="jdbc:mysql://localhost:3340/sms?useSSL=false&?"
				+ "useUnicode=true&useJDBCCompliantTimezoneShift=true"
				+ "&useLegacyDatetimeCode=false&serverTimezone=UTC";	
		
		public DataAccess() throws Exception
		{
			con = DriverManager.getConnection(url, "root", "mysql");
			st = con.createStatement();
		}
		
		public ResultSet ExecuteQuery(String sql) throws Exception
		{	
			return st.executeQuery(sql);
		}
		
		public int ExecuteUpdate(String sql) throws Exception
		{
			return st.executeUpdate(sql);
		}
		
		
		
}
