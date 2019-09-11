package MongoClass.MongoClass;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DemoDelete {

	public static void main(String[] args) {

		MongoClient client = new MongoClient("127.0.0.1", 27017);
		
		//Get Database from MongoDB
		MongoDatabase db = client.getDatabase("worlddb");
		//Get Collection from MongoDB
		MongoCollection collection = db.getCollection("admins");
		
		Document del_doc = new Document("username","adarshadmin");
	
		del_doc.remove(del_doc);
		collection.deleteOne(del_doc);
		
		client.close();
		System.out.println("User has succefully Deleted");
		

	}

}
