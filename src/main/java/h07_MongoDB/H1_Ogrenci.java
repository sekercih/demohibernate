package h07_MongoDB;


import h03_OnetoOneJoins.H2_Gunluk;

 public class H1_Ogrenci {

	private int ogrId;

	private String ogrAd;
	private int ogrNot;

	private H2_Gunluk gunluk;
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
	public H2_Gunluk getGunluk() {
		return gunluk;
	}
	public void setGunluk(H2_Gunluk gunluk) {
		this.gunluk = gunluk;
	}
	@Override
	public String toString() {
		return "Ogrenci : ogrId=" + ogrId + ", ogrAd=" + ogrAd + ", ogrNot=" + ogrNot + ", gunluk=" + gunluk;
	}
}