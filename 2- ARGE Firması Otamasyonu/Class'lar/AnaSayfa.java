package paket;

import java.util.Scanner;

public class AnaSayfa {
	
	public static void Fonksiyonlar(int x,Departman[] yeni_departman)
	{
		Scanner input=new Scanner(System.in);
		int i,j,k;
		int kontrol1,kontrol2,arama_int,yas_sayma20_30,yas_sayma31_40,yas_sayma41_50,yas_sayma50_buyuk,ortalama,yuksek_maliyet,dusuk_maliyet,eleman;
		String arama_yap,yuksek_proje_ad,dusuk_proje_ad;
		
		if (x==1)
		{
			for(i=0;i<yeni_departman.length;i++)
			{
				System.out.println("**************************************************");
				System.out.println("Departman NO: "+yeni_departman[i].getDepNo()+" Departman Ad: "+yeni_departman[i].getDepAd());
				System.out.println("Personeller:");
				for(j=0;j<(yeni_departman[i].personeller).length;j++)
				{
					System.out.println("\t"+(j+1)+". Personel: "+(yeni_departman[i]).personeller[j].getPerID()+" "+
					(yeni_departman[i]).personeller[j].getPerAd()+" "+(yeni_departman[i]).personeller[j].getPerSoyad()+" "+
					(yeni_departman[i]).personeller[j].getPerYas());
				}
				System.out.println("Projeler:");
				for(k=0;k<(yeni_departman[i].projeler).length;k++)
				{
					System.out.println("\t"+(k+1)+". Proje: "+(yeni_departman[i]).projeler[k].getProjeID()+" "+
					(yeni_departman[i]).projeler[k].getProjeAd()+" "+(yeni_departman[i]).projeler[k].getProjeSure()+" "+
					(yeni_departman[i]).projeler[k].getProjeMaliyet());
				}
				System.out.println("**************************************************");
			}
		}
		else if (x==2)
		{
			System.out.print("Aramak istediginiz Departman Adini Giriniz ->");
			arama_yap=input.next();
			kontrol1=0;
			
			for(i=0;i<yeni_departman.length;i++)
			{
				if(arama_yap.equals(yeni_departman[i].getDepAd()))
				{	
					kontrol1=1;
					System.out.println("**************************************************");
					System.out.println("Departman NO: "+yeni_departman[i].getDepNo()+" Departman Ad: "+yeni_departman[i].getDepAd());
					System.out.println("Personeller:");
					for(j=0;j<(yeni_departman[i].personeller).length;j++)
					{
						System.out.println("\t"+(j+1)+". Personel: "+(yeni_departman[i]).personeller[j].getPerID()+" "+
						(yeni_departman[i]).personeller[j].getPerAd()+" "+(yeni_departman[i]).personeller[j].getPerSoyad()+" "+
						(yeni_departman[i]).personeller[j].getPerYas());
					}
					System.out.println("Projeler:");
					for(k=0;k<(yeni_departman[i].projeler).length;k++)
					{
						System.out.println("\t"+(k+1)+". Proje: "+(yeni_departman[i]).projeler[k].getProjeID()+" "+
						(yeni_departman[i]).projeler[k].getProjeAd()+" "+(yeni_departman[i]).projeler[k].getProjeSure()+" "+
						(yeni_departman[i]).projeler[k].getProjeMaliyet());
					}
					System.out.println("**************************************************");
				}
			}
			
			if(kontrol1==0)
			{
				System.out.println("Aradiginz isimde Departman Bulunamadi");
			}
			
		}
		else if(x==3)
		{
			System.out.print("Aramak istediginiz Personel Adini Giriniz ->");
			arama_yap=input.next();
			kontrol1=0;
			kontrol2=0;
			
			for(i=0;i<yeni_departman.length;i++)
			{
				kontrol1=0;
				for(j=0;j<(yeni_departman[i].personeller).length;j++)
				{
					if(arama_yap.equals((yeni_departman[i]).personeller[j].getPerAd()))
					{
						kontrol2=1;
						if(kontrol1==0)
						{
							kontrol1=1;
							System.out.println("**************************************************");
							System.out.println("Departman NO: "+yeni_departman[i].getDepNo()+" Departman Ad: "+yeni_departman[i].getDepAd());
							System.out.println("Personeller:");
						}
						System.out.println("\t"+(j+1)+". Personel: "+(yeni_departman[i]).personeller[j].getPerID()+" "+
						(yeni_departman[i]).personeller[j].getPerAd()+" "+(yeni_departman[i]).personeller[j].getPerSoyad()+" "+
						(yeni_departman[i]).personeller[j].getPerYas());
						System.out.println("**************************************************");
					}
				}
			}
			
			if(kontrol2==0)
			{
				System.out.println("Aradiginz isimde Personel Bulunamadi");
			}
		}
		else if(x==4)
		{
			System.out.print("Aramak istediginiz Proje Adini Giriniz ->");
			arama_yap=input.next();
			kontrol1=0;
			kontrol2=0;
			
			for(i=0;i<yeni_departman.length;i++)
			{
				kontrol1=0;
				for(k=0;k<(yeni_departman[i].projeler).length;k++)
				{
					if(arama_yap.equals((yeni_departman[i]).projeler[k].getProjeAd()))
					{
						kontrol2=1;
						if(kontrol1==0)
						{
							kontrol1=1;
							System.out.println("**************************************************");
							System.out.println("Departman NO: "+yeni_departman[i].getDepNo()+" Departman Ad: "+yeni_departman[i].getDepAd());
							System.out.println("Personeller:");
						}
						System.out.println("\t"+(k+1)+". Proje: "+(yeni_departman[i]).projeler[k].getProjeID()+" "+
						(yeni_departman[i]).projeler[k].getProjeAd()+" "+(yeni_departman[i]).projeler[k].getProjeSure()+" "+
						(yeni_departman[i]).projeler[k].getProjeMaliyet());
						System.out.println("**************************************************");
					}
				}
			}
			
			if(kontrol2==0)
			{
				System.out.println("Aradiginz isimde Proje Bulunamadi");
			}
		}
		else if(x==5)
		{
			System.out.print("Aramak istediginiz Personel Yasini Giriniz ->");
			arama_int=input.nextInt();
			kontrol1=0;
			kontrol2=0;
			
			for(i=0;i<yeni_departman.length;i++)
			{
				kontrol1=0;
				for(j=0;j<(yeni_departman[i].personeller).length;j++)
				{
					if(arama_int==(yeni_departman[i]).personeller[j].getPerYas())
					{
						kontrol2=1;
						if(kontrol1==0)
						{
							kontrol1=1;
							System.out.println("**************************************************");
							System.out.println("Departman NO: "+yeni_departman[i].getDepNo()+" Departman Ad: "+yeni_departman[i].getDepAd());
							System.out.println("Personeller:");
						}
						System.out.println("\t"+(j+1)+". Personel: "+(yeni_departman[i]).personeller[j].getPerID()+" "+
						(yeni_departman[i]).personeller[j].getPerAd()+" "+(yeni_departman[i]).personeller[j].getPerSoyad()+" "+
						(yeni_departman[i]).personeller[j].getPerYas());
						System.out.println("**************************************************");
					}
				}
			}
			
			if(kontrol2==0)
			{
				System.out.println("Aradiginz Yasda Personel Bulunamadi");
			}
		}
		else if(x==6)
		{
			yas_sayma20_30=0;
			yas_sayma31_40=0;
			yas_sayma41_50=0;
			yas_sayma50_buyuk=0;
			ortalama=0;
			eleman=0;
			
			for(i=0;i<yeni_departman.length;i++)
			{
				for(j=0;j<(yeni_departman[i].personeller).length;j++)
				{
					if((20<=(yeni_departman[i]).personeller[j].getPerYas())&&((yeni_departman[i]).personeller[j].getPerYas()<=30))
					{
						yas_sayma20_30++;
					}
					else if((31<=(yeni_departman[i]).personeller[j].getPerYas())&&((yeni_departman[i]).personeller[j].getPerYas()<=40))
					{
						yas_sayma31_40++;
					}
					else if((41<=(yeni_departman[i]).personeller[j].getPerYas())&&((yeni_departman[i]).personeller[j].getPerYas()<=50))
					{
						yas_sayma41_50++;
					}
					else if((50<(yeni_departman[i]).personeller[j].getPerYas()))
					{
						yas_sayma50_buyuk++;
					}
					
					ortalama+=(yeni_departman[i]).personeller[j].getPerYas();
					eleman++;
				}
			}
			System.out.println("20-30 Yaş Aralığındaki Personel Sayısı: "+yas_sayma20_30);
			System.out.println("31-40 Yaş Aralığındaki Personel Sayısı: "+yas_sayma31_40);
			System.out.println("41-50 Yaş Aralığındaki Personel Sayısı: "+yas_sayma41_50);
			System.out.println(">50 Yaş Personel Sayısı: "+yas_sayma50_buyuk);
			System.out.println("**************************************************");
			System.out.println("Tüm Personellerin Yaş Ortalaması: "+(ortalama/eleman));
			
		}
		else if(x==7)
		{
			System.out.print("Aramak istediginiz Proje Suresini Giriniz ->");
			arama_int=input.nextInt();
			kontrol1=0;
			kontrol2=0;
			
			for(i=0;i<yeni_departman.length;i++)
			{
				kontrol1=0;
				for(k=0;k<(yeni_departman[i].projeler).length;k++)
				{
					if(arama_int==((yeni_departman[i]).projeler[k].getProjeSure()))
					{
						kontrol2=1;
						if(kontrol1==0)
						{
							kontrol1=1;
							System.out.println("**************************************************");
							System.out.println("Departman NO: "+yeni_departman[i].getDepNo()+" Departman Ad: "+yeni_departman[i].getDepAd());
							System.out.println("Personeller:");
						}
						System.out.println("\t"+(k+1)+". Proje: "+(yeni_departman[i]).projeler[k].getProjeID()+" "+
						(yeni_departman[i]).projeler[k].getProjeAd()+" "+(yeni_departman[i]).projeler[k].getProjeSure()+" "+
						(yeni_departman[i]).projeler[k].getProjeMaliyet());
						System.out.println("**************************************************");
					}
				}
			}
			
			if(kontrol2==0)
			{
				System.out.println("Aradiginz Surede Proje Bulunamadi");
			}
		}
		else if(x==8)
		{
			System.out.print("Aramak istediginiz Proje Maliyetini Giriniz ->");
			arama_int=input.nextInt();
			kontrol1=0;
			kontrol2=0;
			
			for(i=0;i<yeni_departman.length;i++)
			{
				kontrol1=0;
				for(k=0;k<(yeni_departman[i].projeler).length;k++)
				{
					if(arama_int==((yeni_departman[i]).projeler[k].getProjeMaliyet()))
					{
						kontrol2=1;
						if(kontrol1==0)
						{
							kontrol1=1;
							System.out.println("**************************************************");
							System.out.println("Departman NO: "+yeni_departman[i].getDepNo()+" Departman Ad: "+yeni_departman[i].getDepAd());
							System.out.println("Personeller:");
						}
						System.out.println("\t"+(k+1)+". Proje: "+(yeni_departman[i]).projeler[k].getProjeID()+" "+
						(yeni_departman[i]).projeler[k].getProjeAd()+" "+(yeni_departman[i]).projeler[k].getProjeSure()+" "+
						(yeni_departman[i]).projeler[k].getProjeMaliyet());
						System.out.println("**************************************************");
					}
				}
			}
			
			if(kontrol2==0)
			{
				System.out.println("Aradiginz Maliyette Proje Bulunamadi");
			}
		}
		else if(x==9)
		{
			yuksek_maliyet=(yeni_departman[0]).projeler[0].getProjeMaliyet();
			dusuk_maliyet=(yeni_departman[0]).projeler[0].getProjeMaliyet();
			ortalama=0;
			eleman=0;
			
			yuksek_proje_ad="0";
			dusuk_proje_ad="0";
			
			for(i=0;i<yeni_departman.length;i++)
			{
				for(k=0;k<(yeni_departman[i].projeler).length;k++)
				{
					if(yuksek_maliyet<(yeni_departman[i]).projeler[k].getProjeMaliyet())
					{
						yuksek_maliyet=(yeni_departman[i]).projeler[k].getProjeMaliyet();
						yuksek_proje_ad=(yeni_departman[i]).projeler[k].getProjeAd();
					}
					if(dusuk_maliyet>(yeni_departman[i]).projeler[k].getProjeMaliyet())
					{
						dusuk_maliyet=(yeni_departman[i]).projeler[k].getProjeMaliyet();
						dusuk_proje_ad=(yeni_departman[i]).projeler[k].getProjeAd();
					}
					ortalama+=(yeni_departman[i]).projeler[k].getProjeMaliyet();
					eleman++;
				}
			}
			
			System.out.println("En Yüksek Maliyetli Proje: "+yuksek_proje_ad+" "+yuksek_maliyet);
			System.out.println("En Düşük Maliyetli Proje: "+dusuk_proje_ad+" "+dusuk_maliyet);
			System.out.println("Tüm Projelerin Ortalama Maliyeti: "+(ortalama/eleman));
			
		}
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int Departman_sayisi, Personel_sayisi, Proje_sayisi;
		int depNo, perYas, projeSure, projeMaliyet;
		String depAd, perAd, perSoyad, projeAd;
		int x=0;
		
		System.out.print("Kac adet departman bilgisi girmek istiyorsunuz ->");
		Departman_sayisi = input.nextInt();
		
		Departman[] yeni_departman=new Departman[Departman_sayisi];
		
		for(int i=0;i<Departman_sayisi;i++)
		{
			System.out.print((i+1)+". Lutfen departman NO bilgisini giriniz ->");
			depNo = input.nextInt();
			System.out.print((i+1)+". Lutfen departman AD bilgisini giriniz ->");
			depAd = input.next();
			
			yeni_departman[i]=new Departman(depNo,depAd);
			
			System.out.print("Kac adet personel bilgisi girmek istiyorsunuz ->");
			Personel_sayisi=input.nextInt();
			
			Personel[] yeni_personel=new Personel[Personel_sayisi];
			for(int j=0;j<Personel_sayisi;j++)
			{
				System.out.print((j+1)+". Lutfen personel AD bilgisini giriniz ->");
				perAd = input.next();
				System.out.print((j+1)+". Lutfen personel SOYAD bilgisini giriniz ->");
				perSoyad = input.next();
				System.out.print((j+1)+". Lutfen personel YAS bilgisini giriniz ->");
				perYas=input.nextInt();
				
				yeni_personel[j]=new Personel(depNo,perAd,perSoyad,perYas);
			}
			
			System.out.print("Kac adet proje bilgisi girmek istiyorsunuz ->");
			Proje_sayisi=input.nextInt();
			
			Proje[] yeni_proje=new Proje[Proje_sayisi];
			
			for(int k=0;k<Proje_sayisi;k++)
			{
				System.out.print((k+1)+". Lutfen proje AD bilgisini giriniz ->");
				projeAd = input.next();
				System.out.print((k+1)+". Lutfen proje SURE(AY) bilgisini giriniz ->");
				projeSure = input.nextInt();
				System.out.print((k+1)+". Lutfen proje MALIYET(TL) bilgisini giriniz ->");
				projeMaliyet = input.nextInt();
				
				yeni_proje[k]=new Proje(depNo,projeAd,projeSure,projeMaliyet);
			}
			
			yeni_departman[i].personeller=yeni_personel;
			yeni_departman[i].projeler=yeni_proje;
		}
		
		while(true)
		{
			System.out.println("--------------------------------------------------");
			System.out.println("1- Tüm Departmanların Bilgilerini Listele");
			System.out.println("2- Departman Adına Göre Arama Yap");
			System.out.println("3- Personel Adına Göre Arama Yap");
			System.out.println("4- Proje Adına Göre Arama Yap");
			System.out.println("5- Yaş Bilgisine Göre Personelleri Bul");
			System.out.println("6- Yaş Bilgisine Göre Personelleri Analiz Et");
			System.out.println("7- Proje Süresine Göre Projeleri Bul");
			System.out.println("8- Proje Maliyetine Göre Projeleri Bul");
			System.out.println("9- Proje Maliyetine Göre Projeleri Analiz Et");
			System.out.println("10- Çıkış");
			System.out.println("--------------------------------------------------");
			System.out.print("\nLutfen Yapmak Istediginiz Islemli Seciniz -->");
			x = input.nextInt();
			if (x==10)
			{
				break;
			}
			Fonksiyonlar(x,yeni_departman);
			
		}
		
		

	}

}
