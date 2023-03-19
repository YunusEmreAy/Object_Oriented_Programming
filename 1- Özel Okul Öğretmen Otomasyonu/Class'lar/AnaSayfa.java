package paket;

import java.util.Scanner;

public class AnaSayfa {
	
	public static void OgretmenSirala(MatematikOgretmeni[] arr,int boyut)
	{
		int i,j;
		MatematikOgretmeni temp;
		
		for(i=0;i<boyut;i++) 
		{
			for(j=0;j<boyut-1;j++)
			{
				if(arr[j+1].tp>arr[j].tp)
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
	}
	
	
	
	public static void OgretmenSirala(ResimOgretmeni[] arr,int boyut)
	{
		int i,j;
		ResimOgretmeni temp;
		
		for(i=0;i<boyut;i++) 
		{
			for(j=0;j<boyut-1;j++)
			{
				if(arr[j+1].tp>arr[j].tp)
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int matematik_sayisi, resim_sayisi;
		int i;
		
		String ad, soyad;
		int yas, gs;
		
		System.out.print("Matematik Ogretmeni Sayisini Giriniz:");
		matematik_sayisi = input.nextInt();
		System.out.print("Resim Ogretmeni Sayisini Giriniz:");
		resim_sayisi = input.nextInt();
		
		MatematikOgretmeni[] mat_arr=new MatematikOgretmeni[matematik_sayisi];
		ResimOgretmeni[] resim_arr=new ResimOgretmeni[resim_sayisi];
		
		
		for(i=0;i<matematik_sayisi;i++)
		{
			System.out.print((i+1)+". Matemateik Ogretmeni Ad giriniz:");
			ad = input.next();
			System.out.print((i+1)+". Matemateik Ogretmeni Soyad giriniz:");
			soyad = input.next();
			System.out.print((i+1)+". Matemateik Ogretmeni Yas giriniz:");
			yas = input.nextInt();
			System.out.print((i+1)+". Matemateik Ogretmeni Gorev Suresi giriniz:");
			gs = input.nextInt();
			
			mat_arr[i]=new MatematikOgretmeni(ad, soyad, yas, gs);
		}
		
		
		for(i=0;i<resim_sayisi;i++)
		{
			System.out.print((i+1)+". Resim Ogretmeni Ad giriniz:");
			ad = input.next();
			System.out.print((i+1)+". Resim Ogretmeni Soyad giriniz:");
			soyad = input.next();
			System.out.print((i+1)+". Resim Ogretmeni Yas giriniz:");
			yas = input.nextInt();
			System.out.print((i+1)+". Resim Ogretmeni Gorev Suresi giriniz:");
			gs = input.nextInt();
			
			resim_arr[i]=new ResimOgretmeni(ad, soyad, yas, gs);
		}
		
		System.out.println("--------------------------------------------------");
		Ogretmen.OgretmenSayisiVer();
		System.out.println("--------------------------------------------------");
		
		for(i=0;i<matematik_sayisi;i++)
		{
			mat_arr[i].BilgileriYazdır();
			System.out.println("******************************");
		}
		
		System.out.println("--------------------------------------------------");
		
		
		for(i=0;i<resim_sayisi;i++)
		{
			resim_arr[i].BilgileriYazdır();
			System.out.println("******************************");
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		OgretmenSirala(mat_arr,matematik_sayisi);
		OgretmenSirala(resim_arr,resim_sayisi);
		
		
		for(i=0;i<matematik_sayisi;i++)
		{
			mat_arr[i].BilgileriYazdır();
			System.out.println("******************************");
		}
		
		System.out.println("--------------------------------------------------");
		
		
		for(i=0;i<resim_sayisi;i++)
		{
			resim_arr[i].BilgileriYazdır();
			System.out.println("******************************");
		}

	}

}
