package ConnectionDB;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;

import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Iterator;


public class MongoConnection {

   public void establishConnection(){
        MongoClient mongo = new MongoClient( "localhost" , 27017 );

        // Creating Credentials
        MongoCredential credential = null;

        credential = MongoCredential.createCredential("myUserAdmin", "tryApp1", "1234".toCharArray());
        if(credential != null)
            System.out.println("Connected to the database successfully for"+credential.getUserName());

        // Accessing the database
        MongoDatabase database = mongo.getDatabase("tryApp1");

        MongoCollection<Document> collection = database.getCollection("Users");

        FindIterable<Document> iterDoc = collection.find();
        int i = 1;

       // Getting the iterator
        Iterator it = iterDoc.iterator();

        while (it.hasNext()) {
           System.out.println(it.next());
           i++;
        }

    }

}

