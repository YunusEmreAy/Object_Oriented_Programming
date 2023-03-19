package paket;

public class Proje {
	private int depNo;
	private int projeID;
	private String projeAd;
	private int projeSure;
	private int projeMaliyet;
	
	private static int syc=0;

	public Proje(int depNo, String projeAd, int projeSure, int projeMaliyet) {
		super();
		this.depNo = depNo;
		this.projeID = ++syc;
		this.projeAd = projeAd;
		this.projeSure = projeSure;
		this.projeMaliyet = projeMaliyet;
	}

	public int getDepNo() {
		return depNo;
	}

	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}

	public String getProjeAd() {
		return projeAd;
	}

	public void setProjeAd(String projeAd) {
		this.projeAd = projeAd;
	}

	public int getProjeSure() {
		return projeSure;
	}

	public void setProjeSure(int projeSure) {
		this.projeSure = projeSure;
	}

	public int getProjeMaliyet() {
		return projeMaliyet;
	}

	public void setProjeMaliyet(int projeMaliyet) {
		this.projeMaliyet = projeMaliyet;
	}

	public int getProjeID() {
		return projeID;
	}

}
