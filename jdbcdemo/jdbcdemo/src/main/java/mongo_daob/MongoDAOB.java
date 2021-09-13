package mongo_daob;


import java.util.List;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

public class MongoDAOB {

	public List<DBObject> readData(DB db, String collectionName){
		DBCollection dbCollection = db.getCollection(collectionName);
		DBObject query = BasicDBObjectBuilder.start().get();
		DBCursor cursor = dbCollection.find(query);
		return cursor.toArray();
	}
	
	public void insertData(DB db, String collectionName, String[][] data)throws Exception {
		DBCollection dbCollection = db.getCollection(collectionName);
		
		BasicDBObjectBuilder dbBuilder = BasicDBObjectBuilder.start();
		
		for(int i=0;i<data.length;++i) {
			dbBuilder.append(data[i][0], data[i][1]);
		}
		WriteResult rs = dbCollection.insert(dbBuilder.get());
		System.out.println(rs);
	}
}
