package paket;

public class İşçi extends Çalışan implements Maaş {

	public String Görev;

	public İşçi(String ad, String soyad, int yas, int çs) {
		super(ad, soyad, yas, çs);
		Görev = "İşçi";
	}

	@Override
	public double MaasHesapla() {
		// TODO Auto-generated method stub
		return this.ZamOranıHesapla()+3000;
	}

	@Override
	public Double ZamOranıHesapla() {
		
		return (this.çs*100.0)+((this.yas*2)/3.0);
	}
	
	
	
	
	

}
