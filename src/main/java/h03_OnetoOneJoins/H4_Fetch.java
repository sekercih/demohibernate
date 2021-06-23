package h03_OnetoOneJoins;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H4_Fetch {
	public static void main(String[] args) {

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H1_Ogrenci.class)
				.addAnnotatedClass(H2_Gunluk.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		H1_Ogrenci ogr = session.get(H1_Ogrenci.class, 101);

		H2_Gunluk gunluk = new H2_Gunluk();

		gunluk = session.get(H2_Gunluk.class, 12);

		System.out.println(gunluk);

		System.out.println(ogr);
		
		String sql1="Select o.ogr_id,g.yazilar,o.ogrNot "
				+ "From ogrenciler o INNER JOIN gunlukler g"
				+ " ON o.ogr_id=g.ogr_id";
		List<Object[]> sonucListesi= session.createSQLQuery(sql1).getResultList();		
		for (Object[] objects : sonucListesi) {
			System.out.println(Arrays.toString(objects)+"444444");
		}

		tx.commit();
		session.close();
		sf.close();
	}

}
