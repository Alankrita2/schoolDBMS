package mongo_daob;

import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;

public class Demo {

	public static void main(String[] args) {
		MongoDAOB mongo_daob = new MongoDAOB();
		
		DB db;
		try {
			db = MongoConnect.getDB();
			
			List<DBObject> ls = mongo_daob.readData(db, "inventory");
			ls.forEach(System.out::println);
			
			mongo_daob.insertData(db, "inventory", new String[][] {{"_id", "colgate300"},{"status","B"},{"qty", "100"}});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Message : " + e.getMessage());
		}
		
	}
}
