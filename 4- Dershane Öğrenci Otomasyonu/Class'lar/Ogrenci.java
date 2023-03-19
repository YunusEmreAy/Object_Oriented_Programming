// Yunus Emre Ay / 21100011016
package Paket;

import java.util.ArrayList;

public class Ogrenci {
	private int ogrID;
	private String AdSoyad;
	private int ogrYas;
	public ArrayList<Ders> alinanDersler=new ArrayList<Ders>() ;
	
	
	public Ogrenci(int ogrID, String adSoyad, int ogrYas) {
		super();
		this.ogrID = ogrID;
		AdSoyad = adSoyad;
		this.ogrYas = ogrYas;
		
	}


	public int getOgrID() {
		return ogrID;
	}


	public void setOgrID(int ogrID) {
		this.ogrID = ogrID;
	}


	public String getAdSoyad() {
		return AdSoyad;
	}


	public void setAdSoyad(String adSoyad) {
		AdSoyad = adSoyad;
	}


	public int getOgrYas() {
		return ogrYas;
	}


	public void setOgrYas(int ogrYas) {
		this.ogrYas = ogrYas;
	}
	
	
	
}
