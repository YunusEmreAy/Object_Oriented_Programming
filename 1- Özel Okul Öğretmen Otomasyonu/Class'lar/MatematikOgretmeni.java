package paket;

public class MatematikOgretmeni extends Ogretmen {
	
	private int id;
	public int gs;  //öğretmenin görev süresi, yil
	public Double tp; //öğretmenin tecrübe puanı 
	
	private static int syc=0;

	public MatematikOgretmeni(String ad, String soyad, int yas, int gs) {
		super(ad, soyad, yas);
		this.gs = gs;
		this.id=++syc;
		this.tp = gs*0.4;
		this.Brans="Matematik";
	}

	@Override
	public void BilgileriYazdır() {
		super.BilgileriYazdır();
		System.out.println("id: "+id);
		System.out.println("tp: "+tp);
		System.out.println("Matematik Ogretmeni");
	}
	
	

	
	
}
