package h01_anotasyonlar;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class H201_Save {

	public static void main(String[] args) {
		// Tabloya eklenecek verileri (record, kayit) olusturmamız gerekiyor.
				H1_Ogrenci ogrenci1 = new H1_Ogrenci(103, "Sanan Ban", 99);
				H1_Ogrenci ogrenci2 = new H1_Ogrenci(104, "Mehmet Yilmaz", 90);
				// Veritabani baglanti ayarlarini Hibernate'e gostermeliyiz.
				Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Ogrenci.class);
				// con objesinden bir oturum grubu oluşturduk.
				SessionFactory sf = con.buildSessionFactory();
				// Oturum grubundan bir oturumu başlattık.
				Session session = sf.openSession();
				// Acilan session icerisinde islemlere baslayabilmek icin Transaction aciyoruz.
				Transaction tx = session.beginTransaction();
				// Veritabanina kayitlarin eklenmesi
				session.save(ogrenci1);
				session.save(ogrenci2);
				// İslemlerin veritabanina aktarilmasi
				tx.commit();
				// Oturumlarin kapatilmasi
				sf.close();
				session.close();

	}

}
