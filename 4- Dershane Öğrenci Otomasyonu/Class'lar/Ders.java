// Yunus Emre Ay / 21100011016
package Paket;

public class Ders {
	private int dersID;
	private String dersAd;
	
	private static int syc=990;

	public Ders(String dersAd) {
		super();
		syc+=10;
		dersID=syc;
		this.dersAd = dersAd;
	}

	public static int getSyc() {
		return syc;
	}

	public static void setSyc(int syc) {
		Ders.syc = syc;
	}

	public int getDersID() {
		return dersID;
	}

	public void setDersID(int dersID) {
		this.dersID = dersID;
	}

	public String getDersAd() {
		return dersAd;
	}

	public void setDersAd(String dersAd) {
		this.dersAd = dersAd;
	}
	
	
	
	
}
