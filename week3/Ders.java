package net.codejava;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ders {
	private Long id;
	private String dersadi;
	private String derskodu;
	private String dershocasi;
	private String aa;
	
	protected Ders() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDersadi() {
		return dersadi;
	}
	public void setDersadi(String dersadi) {
		this.dersadi = dersadi;
	}
	public String getDerskodu() {
		return derskodu;
	}
	public void setDerskodu(String derskodu) {
		this.derskodu = derskodu;
	}
	public String getDershocasi() {
		return dershocasi;
	}
	public void setDershocasi(String dershocasi) {
		this.dershocasi = dershocasi;
	}
	
	public String getAa() {
		return aa;
	}
	public void setAa(String aa) {
		this.aa = aa;
	}
	

	
}
