package h07_MongoDB;

import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoException;

public class MongoDB {
	public static void main(String[] args) {
		mongoDBDataSaving();
	}
	
	public static void mongoDBDataSaving() {
		try (MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"))) {
			MongoDatabase db = mongoClient.getDatabase("kisiler");
			MongoCollection<Document> ogrCollection = db.getCollection("ogrenciler");
			List<H1_Ogrenci> ogrList = new ArrayList<>();
			H1_Ogrenci ogr1 = new H1_Ogrenci(12, "Hakki", 100);
			H1_Ogrenci ogr2 = new H1_Ogrenci(13, "Ozkan", 99);
			H1_Ogrenci ogr3 = new H1_Ogrenci(14, "Murat Hoca", 98);
			ogrList.add(ogr1);
			ogrList.add(ogr2);
			ogrList.add(ogr3);
			
			List<Document> documentList = new ArrayList<>();
			for(H1_Ogrenci ogr : ogrList) {
				Document doc = new Document();
				doc.append("ogr_no", ogr.getOgrId());
				doc.append("ogr_ad", ogr.getOgrAd());
				doc.append("ogr_not", ogr.getOgrNot());
				documentList.add(doc);
			}
			ogrCollection.insertMany(documentList);
System.out.println(ogrCollection.find());		
		}catch (MongoException e) {
			e.printStackTrace();
		}
	}	

}
