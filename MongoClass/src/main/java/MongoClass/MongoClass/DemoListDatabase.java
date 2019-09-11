package MongoClass.MongoClass;

import org.bson.Document;

import com.mongodb.*;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class DemoListDatabase {


	public static void main(String[] args) {
	//Step1 - Connection
	MongoClient client = new MongoClient("127.0.0.1", 27017);
	
	//Step2 = List Database
	MongoIterable<String> mIter = client.listDatabaseNames();
	
	mIter.forEach(new Block<String>() {
		
	public void apply(String dbName) {
		
		System.out.println(""+dbName);
	}

	});
	
	//List all the contents of the collection
	MongoDatabase db = client.getDatabase("worlddb");
	MongoCollection collection = db.getCollection("users");
	MongoIterable<Document> iter_collection = collection.find(); //Creating the iterator to loopin through documents
	
	iter_collection.forEach(new Block<Document>() {
		
	public void apply(Document doc_contect) {
		
		System.out.println(""+doc_contect.toJson());
	}

	});
	
	//Create a new collection 
	db.createCollection("admins");
	
	client.close();
	}
}
