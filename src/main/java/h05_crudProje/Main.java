package h05_crudProje;

public class Main {

	public static void main(String[] args) {
		CrudMetotlar metot=new CrudMetotlar();
		
		metot.sessionFactoryOlustur();
		
//		
//		metot.personelEkle("Ahmet", "Kaya", 5000);
//		metot.personelEkle("Can", "Tana", 6000);
//		metot.personelEkle("Alper", "Katar", 7000);
		
		
		metot.idIlePersonelSil(22L);
		metot.idIlePersonelSil(2L);
		metot.tumPersoneliListele();

	}

}
