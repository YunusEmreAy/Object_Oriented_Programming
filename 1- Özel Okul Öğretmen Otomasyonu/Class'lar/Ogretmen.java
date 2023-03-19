package paket;

public class Ogretmen {
	public String Ad;
	public String Soyad;
	public int Yas;
	public String Brans;
	
	private static int OgretmenSayisi = 0;
	
	
	public Ogretmen(String ad, String soyad, int yas) {
		super();
		Ad = ad;
		Soyad = soyad;
		Yas = yas;
		OgretmenSayisi++;
	}


	public void BilgileriYazdır()
	{
		System.out.println("Ad: "+Ad);
		System.out.println("Soyad: "+Soyad);
		System.out.println("Yas: "+Yas);
		System.out.println("Brans: "+Brans);
	}
	
	
	public static void OgretmenSayisiVer()
	{
		System.out.println("Okuldaki tum ogretmenlerin sayisi: "+OgretmenSayisi);
	}
	
	

}
