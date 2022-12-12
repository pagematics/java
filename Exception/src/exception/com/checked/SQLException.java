package exception.com.checked;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.lang.Exception;

public class SQLException {
   static final String DB_URL = "jdbc:mysql://localhost/MYFILE";
   static final String USER = "guest";
   static final String PASS = "guest123";
   static final String QUERY = "{call getEmpName (?, ?)}";

   public static void main(String[] args) {
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         CallableStatement statement = conn.prepareCall(QUERY);) 
      {		      
    	  statement.setInt(1, 1);  // This would set ID
    	  statement.registerOutParameter(2, java.sql.Types.VARCHAR);
          System.out.println("Executing stored procedure..." );
          statement.execute();
          String emName = statement.getString(2);
          System.out.println("Emp Name with ID: 1 is " + emName);
      } 
      catch (Exception e) 
      {
    	  System.out.println(e);
      } 
}

public void printStackTrace()
{
	// TODO Auto-generated method stub
}
}