package MongoClass.MongoClass;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DemoFindMongo {

	public static void main(String[] args) {
		
		 MongoClient client = new MongoClient("127.0.0.1", 27017);
		 MongoDatabase db = client.getDatabase("worlddb");
		 MongoCollection collection = db.getCollection("admins");

		 FindIterable<Document> iter = collection.find();
		 
		 Block printBlock = new Block<Document>() {
			 public void apply(Document arg0) {
			 System.out.println(""+arg0.toJson());
			 }
			 
		 };
		 iter.forEach(printBlock);
	}

}
