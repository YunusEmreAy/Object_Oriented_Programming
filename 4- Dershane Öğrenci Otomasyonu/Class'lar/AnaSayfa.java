// Yunus Emre Ay / 21100011016
package Paket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {
	
	
	public static void DersEkle(ArrayList<Ders> Dersler)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Eklemek İstediğiniz Dersin Adını Giriniz -->");
		String string=input.next();
		
		Dersler.add(new Ders(string));
	}
	
	public static void DersListele(ArrayList<Ders> Dersler)
	{
		for(Ders e:Dersler)
		{
			System.out.println(e.getDersID()+"   "+e.getDersAd());
		}
	}
	
	public static void DersAra(ArrayList<Ders> Dersler)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Aramak İstediğiniz Dersin Adını Giriniz -->");
		String string=input.next();
		
		for(Ders e:Dersler)
		{
			if(string.equals(e.getDersAd()))
			{
				System.out.println(e.getDersID()+"   "+e.getDersAd());
			}
			
		}
	}
	
	public static void DersSil(ArrayList<Ogrenci> Ogrenciler ,ArrayList<Ders> Dersler)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Silmek İstediğiniz Dersin Adını Giriniz -->");
		String string=input.next();
		
		int kontrol=0;
		for(Ogrenci o:Ogrenciler)
		{
			for(Ders d:o.alinanDersler)
			{
				if(string.equals(d.getDersAd()))
				{
					kontrol=1;
					break;
				}
			}
			if(kontrol==1)
				break;
		}
		
		if(kontrol==1)
		{
			System.out.println("Dersi Alan Öğrenciler Olduğu İçin Ders Silinemedi!");
		}
		else
		{
			for(int x=0;x<Dersler.size();x++)
			{
				if(string.equals(Dersler.get(x).getDersAd()))
				{
					Dersler.remove(x);
				}
			}
			
			System.out.println("Silme İşlemi Gerçekleştirildi.");
		}
	}
	
	public static void OgrenciEkle(ArrayList<Ogrenci> Ogrenciler ,ArrayList<Ders> Dersler)
	{
		Scanner input=new Scanner(System.in);
		
		int kontrol=0;
		
		int ogrID, ogrYas;
		String Ad, Soyad, dersAd;
		
		while(true)
		{
			System.out.print("Oğrenci ID Numarasını Giriniz -->");
			ogrID=input.nextInt();
			
			for(Ogrenci o:Ogrenciler)
			{
				if(ogrID == o.getOgrID())
				{
					kontrol=1;
					break;
				}
			}
			if(kontrol==0)
			{
				break;
			}
			System.out.println("Lutfen Farklı Bir ID Numarası Giriniz");
			kontrol=0;
		}
		
		System.out.print("Oğrenci AD Giriniz -->");
		Ad=input.next();
		System.out.print("Oğrenci SOYAD Giriniz -->");
		Soyad=input.next();
		System.out.print("Oğrenci YAŞ Giriniz -->");
		ogrYas=input.nextInt();
		
		System.out.println("\nOgrencinin Aldığı Dersleri Araya '-' Karakteri Girerek Seçiniz\n\n");
		
		for(int x=0;x<Dersler.size();x++)
		{
			System.out.println((x+1)+") "+Dersler.get(x).getDersAd());
		}
		System.out.print("-->");
		String[] ders_secim = input.next().split("-");
		
		Ogrenciler.add(new Ogrenci(ogrID, Ad+" "+Soyad, ogrYas));
		
		for(int i=0;i<ders_secim.length;i++)
		{
			Ogrenciler.get(Ogrenciler.size()-1).alinanDersler.add(new Ders(Dersler.get(Integer.valueOf(ders_secim[i])-1).getDersAd()));
			Ogrenciler.get(Ogrenciler.size()-1).alinanDersler.get(Ogrenciler.get(Ogrenciler.size()-1).alinanDersler.size()-1).setDersID(Dersler.get(Integer.valueOf(ders_secim[i])-1).getDersID());
			Ders.setSyc(Ders.getSyc()-10);
		}
	}
	
	
	public static void OgrenciAra(ArrayList<Ogrenci> Ogrenciler)
	{
		Scanner input=new Scanner(System.in);
		String Ad,Soyad;
		int kontrol=0;
		
		System.out.print("Ogrenci AD Giriniz -->");
		Ad=input.next();
		System.out.print("Ogrenci SOYAD Giriniz -->");
		Soyad=input.next();
		
		for(Ogrenci o:Ogrenciler)
		{
			if((Ad+" "+Soyad).equals(o.getAdSoyad()))
			{
				kontrol=1;
				System.out.println(o.getOgrID()+" "+o.getAdSoyad()+" "+o.getOgrYas());
			}
		}
		
		if(kontrol==1)
		{
			System.out.println("Girdiğiniz AD-SOYAD Bilgisine Ait Kayıt Bulunamadı!");
		}
	}
	
	
	public static void OgrenciSil(ArrayList<Ogrenci> Ogrenciler)
	{
		Scanner input=new Scanner(System.in);
		int x;
		
		System.out.print("Silmek İstediğiniz Öğrencinin ID Numarasını Giriniz -->");
		x=input.nextInt();
		
		for(int i=0;i<Ogrenciler.size();i++)
		{
			if(x==Ogrenciler.get(i).getOgrID())
			{
				Ogrenciler.remove(i);
			}
		}
	}
	
	public static void OgrenciListele(ArrayList<Ogrenci> Ogrenciler)
	{
		System.out.println("Tüm Öğrenciler");
		for(Ogrenci o:Ogrenciler)
		{
			System.out.println(o.getOgrID()+" "+o.getAdSoyad()+" "+o.getOgrYas());
		}
	}
	
	public static void OgrenciAyrıntılıListele(ArrayList<Ogrenci> Ogrenciler)
	{
		System.out.println("Tüm Öğrenciler ve Aldıkları Dersler");
		
		for(Ogrenci o:Ogrenciler)
		{
			System.out.println(o.getOgrID()+" "+o.getAdSoyad()+" "+o.getOgrYas());
			
			for(Ders d:o.alinanDersler)
			{
				System.out.println("\t"+d.getDersID()+" "+d.getDersAd());
			}
		}
	}
	
	public static void OgrencilerinOdeyeceğiTutarHesaplama(ArrayList<Ogrenci> Ogrenciler)
	{
		Scanner input=new Scanner(System.in);
		int x,ders_sayisi;
		
		System.out.print("Ödenmesi Gereken Ücreti Öğrenmek İçin Öğrencinin ID Numarasını Giriniz -->");
		x=input.nextInt();
		
		for(Ogrenci o:Ogrenciler)
		{
			if(x==o.getOgrID())
			{
				if(o.alinanDersler.size()==1)
				{
					System.out.println("\nTek Ders Alan Öğrenciler Kampanyalardan Faydalanamamaktadır.");
					System.out.println("Ödemeniz Gereken Aylık Ücret Tutarı: 1600 TL");
				}
				else if(o.alinanDersler.size()==2)
				{
					System.out.println("\n1. Kampanyadan Faydalanmaktasınız.");
					System.out.println("Ödemeniz Gereken Aylık Ücret Tutarı: 3120 TL");
				}
				else if(o.alinanDersler.size()==3)
				{
					System.out.println("\n2. Kampanyadan Faydalanmaktasınız.");
					System.out.println("Ödemeniz Gereken Aylık Ücret Tutarı: 4560 TL");
				}
				else if(o.alinanDersler.size()>3)
				{
					System.out.println("\n3. Kampanyadan Faydalanmaktasınız.");
					System.out.println("Ödemeniz Gereken Aylık Ücret Tutarı: "+o.alinanDersler.size()*1440+" TL");
				}
			}
		}
	}
	
	public static void Bitir(File ogrenci ,File ders ,ArrayList<Ogrenci> Ogrenciler ,ArrayList<Ders> Dersler) throws IOException
	{
		FileWriter ogrenciFW=new FileWriter(ogrenci);
		BufferedWriter ogrenciBW=new BufferedWriter(ogrenciFW);
		
		FileWriter dersFW=new FileWriter(ders);
		BufferedWriter dersBW=new BufferedWriter(dersFW);
		
		for(Ogrenci o:Ogrenciler)
		{
			ogrenciBW.write("+"+o.getOgrID()+"%"+o.getAdSoyad()+"%"+o.getOgrYas());
			ogrenciBW.newLine();
			for(Ders d:o.alinanDersler)
			{
				ogrenciBW.write("*"+d.getDersID()+"%"+d.getDersAd());
				ogrenciBW.newLine();
			}
			ogrenciBW.flush();
		}
		
		for(Ders d:Dersler)
		{
			dersBW.write(d.getDersID()+"%"+d.getDersAd());
			dersBW.newLine();
			dersBW.flush();
		}
		
		System.exit(0);
	}
	
	
	

	public static void main(String[] args) throws NumberFormatException, IOException{
		Scanner input=new Scanner(System.in);
		
		File ogrenci=new File("ogrenci.txt");
		File ders=new File("ders.txt");
		
		FileReader ogrenciFR=new FileReader(ogrenci); 
		BufferedReader ogrenciBR=new BufferedReader(ogrenciFR);
		
		FileReader dersFR=new FileReader(ders); 
		BufferedReader dersBR=new BufferedReader(dersFR);
		
		ArrayList<Ogrenci> Ogrenciler=new ArrayList<Ogrenci>();
		ArrayList<Ders> Dersler=new ArrayList<Ders>();
		
		
		String line;
		int temp1,temp2;
		
		
		if((!ogrenci.exists())||(!ders.exists()))
		{
			System.out.println("Dosya Bulunamadı!");
		}
		else
		{
			while((line=ogrenciBR.readLine())!=null)
			{
				String charakter=(line.charAt(0)+"");
				
				if("+".equals(charakter))
				{
					temp1=line.indexOf("%");
					temp2=line.indexOf("%",temp1+1);
					
					Ogrenciler.add(new Ogrenci(Integer.valueOf(line.substring(1, temp1)), line.substring(temp1+1, temp2), Integer.valueOf(line.substring(temp2+1, line.length()))));
				}
				else
				{
					temp1=line.indexOf("%");
					Ogrenciler.get(Ogrenciler.size()-1).alinanDersler.add(new Ders(line.substring(temp1+1, line.length())));
					Ogrenciler.get(Ogrenciler.size()-1).alinanDersler.get(Ogrenciler.get(Ogrenciler.size()-1).alinanDersler.size()-1).setDersID(Integer.valueOf(line.substring(1, temp1)));
					//System.out.println(Ogrenciler.get(Ogrenciler.size()-1).alinanDersler.add(new Ders(charakter)));
				}
			}
			Ders.setSyc(990);
			
			while((line=dersBR.readLine())!=null)
			{
				temp1=line.indexOf("%");
				Dersler.add(new Ders(line.substring(temp1+1, line.length())));
			}
		}
		
		
		int x;
		String string1;
		
		while(true)
		{
			System.out.println("--------------------------------------------------");
			System.out.println("1–Ders Ekle");
			System.out.println("2–Ders Listele");
			System.out.println("3–Ders Ara");
			System.out.println("4-Ders Sil");
			System.out.println("5–Öğrenci Ekle");
			System.out.println("6–Öğrenci Ara");
			System.out.println("7–Öğrenci Sil");
			System.out.println("8–Öğrenci Listele");
			System.out.println("9–Öğrencileri Ayrıntılı Listele");
			System.out.println("10–Öğrencilerin Ödeyeceği Tutarı Hesapla");
			System.out.println("11-Çıkış");
			System.out.print("--------------------------------------------------\n");
			System.out.print("Lütfen Seçim Yapınız -->");
			x=input.nextInt();
			System.out.println("--------------------------------------------------\n\n");
			
			switch (x)
			{
			case 1:
				DersEkle(Dersler);
				break;
			case 2:
				DersListele(Dersler);
				break;
			case 3:
				DersAra(Dersler);
				break;
			case 4:
				DersSil(Ogrenciler, Dersler);
				break;
			case 5:
				OgrenciEkle(Ogrenciler, Dersler);
				break;
			case 6:
				OgrenciAra(Ogrenciler);
				break;
			case 7:
				OgrenciSil(Ogrenciler);
				break;
			case 8:
				OgrenciListele(Ogrenciler);
				break;
			case 9:
				OgrenciAyrıntılıListele(Ogrenciler);
				break;
			case 10:
				OgrencilerinOdeyeceğiTutarHesaplama(Ogrenciler);
				break;
			case 11:
				Bitir(ogrenci, ders, Ogrenciler, Dersler);
				break;
			}
		}
	}

}
