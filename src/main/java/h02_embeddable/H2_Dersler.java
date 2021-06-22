package h02_embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class H2_Dersler {
	private String secmeliDersler;
	private String zorunluDersler;
	
	public String getSecmeliDersler() {
		return secmeliDersler;
	}
	public void setSecmeliDersler(String secmeliDersler) {
		this.secmeliDersler = secmeliDersler;
	}
	public String getZorunluDersler() {
		return zorunluDersler;
	}
	public void setZorunluDersler(String zorunluDersler) {
		this.zorunluDersler = zorunluDersler;
	}
	public H2_Dersler(String secmeliDersler, String zorunluDersler) {
		super();
		this.secmeliDersler = secmeliDersler;
		this.zorunluDersler = zorunluDersler;
	}
	@Override
	public String toString() {
		return "Dersler secmeliDersler=" + secmeliDersler + ", zorunluDersler=" + zorunluDersler ;
	}
	public H2_Dersler() {
		
	}

}
