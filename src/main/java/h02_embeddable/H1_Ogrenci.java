package h02_embeddable;
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
import javax.persistence.Transient;



@Entity
@Table(name="ogrenciler")

public class H1_Ogrenci {
	@Id
	private int ogrId;
	
	@Column(name="ogr_Ad")
	private String ogrAd;
	
	@Transient
	private int ogrNot;
	
	
	private H2_Dersler dersler;


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


	public H2_Dersler getDersler() {
		return dersler;
	}


	public void setDersler(H2_Dersler dersler) {
		this.dersler = dersler;
	}


	@Override
	public String toString() {
		return "H1_Ogrenci ogrId=" + ogrId + ", ogrAd=" + ogrAd + ", ogrNot=" + ogrNot + ", dersler=" + dersler ;
	}


	public H1_Ogrenci() {
		
	}


	public H1_Ogrenci(int ogrId, String ogrAd, int ogrNot, H2_Dersler dersler) {
		super();
		this.ogrId = ogrId;
		this.ogrAd = ogrAd;
		this.ogrNot = ogrNot;
		this.dersler = dersler;
	}
	
	
	
}