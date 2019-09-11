package MongoClass.MongoClass;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DemoInserts {
 public static void main(String []args) {
	 
	 MongoClient client = new MongoClient("127.0.0.1", 27017);
	 MongoDatabase db = client.getDatabase("worlddb");
	 MongoCollection collection = db.getCollection("admins");
	 
	 List<Document> list_doc = new ArrayList<Document>();
	 Document doc1= new Document().append("username", "adarshadmin").append("pasword","hokage@121");
	 Document doc2 = new Document().append("username","Shubham.Admin").append("Pasword","neymar@11");
	 Document doc3 = new Document().append("username","Chetan.Admin").append("Password","Cloudguy#121");
	 Document doc4 = new Document().append("username","Shaktiman").append("Password","Pritivi@2007");
	 
	 list_doc.add(doc1);
	 list_doc.add(doc2);
	 list_doc.add(doc3);
	 list_doc.add(doc4);
	 
	 collection.insertMany(list_doc);
	 
	 client.close();
 }
}
