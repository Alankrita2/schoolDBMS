package daob;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    public static Connection connection = null;
    
    public static Connection getConnection() throws Exception {
    	if(connection == null) {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/school", "user", "Mysql@21");
    }
    	
    	return connection;
    	
    }
    
}
