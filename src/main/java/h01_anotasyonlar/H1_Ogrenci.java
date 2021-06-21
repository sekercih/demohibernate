package h01_anotasyonlar;
//================================================================
//HIBERNATE ICIN TABLO TANIMLAMASININ YAPILMASI 
//POJO: Plain Old Java Object									
//1) Private degiskenler tanimlanir.
//2) constructor olusturulur.
//3) Getter ve Setter metotlar tanimlanir.
//4) toString() metodu ile nesne yazdirilabilir hale getirilir.
//================================================================

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
Bir Class Hibernate ile tablo olusturmada kullanilacaksa degiskenlerin
"final" veya "static" tanimlanMAMAsi gerekir. 
*/
//- @Entity anotasyonu bu class'ın bir tabloya donusturulmesi
//gerektigini Hibernate'e gosterir. Her bir degisken bir sutun olacaktir.
//- @Table annotasyonu tablo adinin degistirlmesini saglar.
//- @Id anotasyonu tablo icerisinde primary key olusturur.
//- @Transient anotasyonu bir degiskenin (sutun) tabloda yer almayacagini gosterir.

@Entity
@Table(name="ogrenci_tablosu")

public class H1_Ogrenci {
	@Id
	private int ogrId;
	
	@Column(name="ogr_Ad")
	private String ogrAd;
	
	@Column(name="ogr_Not")
	private int ogrNot;
	
	
	public H1_Ogrenci() {
		
	}
	public H1_Ogrenci(int ogrId, String ogrAd, int ogrNot) {
		
		this.ogrId = ogrId;
		this.ogrAd = ogrAd;
		this.ogrNot = ogrNot;
	}
	public int getOgrId() {
		return ogrId;
	}
	public void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}
	public String getOgrAd() {
		return ogrAd;
	}
	public void setOgrAd(String ogrAd) {
		this.ogrAd = ogrAd;
	}
	public int getOgrNot() {
		return ogrNot;
	}
	public void setOgrNot(int ogrNot) {
		this.ogrNot = ogrNot;
	}
	@Override
	public String toString() {
		return "Ogrenci Id=" + ogrId + ", Ad=" + ogrAd + ", Not=" + ogrNot + "]";
	}
	
	
}
