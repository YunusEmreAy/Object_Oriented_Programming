package paket;

public abstract class Çalışan {
	public int id;
	public String ad;
	public String soyad;
	public int yas;
	public int çs;
	private static int syc=998;
	
	
	public Çalışan(String ad, String soyad, int yas, int çs) {
		super();
		syc +=2;
		this.id=syc;
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.çs = çs;
	}


	public abstract Double ZamOranıHesapla();

}
