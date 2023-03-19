package paket;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		
		int işçi_sayisi;
		
	    String ad,soyad;
		int yas,çş;
		
		ArrayList <İşçi> liste=new ArrayList <İşçi>();
		
		
		
		System.out.print("Kaç Adet işçi Girmek istiyorsunuz -->");
		işçi_sayisi = input.nextInt();
		
		for(int i=0;i<işçi_sayisi;i++)
		{
			System.out.print("Lutfen AD Giriniz -->");
			ad = input.next();
			
			System.out.print("Lutfen SOYAD Giriniz -->");
			soyad = input.next();
			
			System.out.print("Lutfen YAS Giriniz -->");
			yas = input.nextInt();
			
			System.out.print("Lutfen ÇOCUK SAYISI Giriniz -->");
			çş = input.nextInt();
			
			liste.add(new İşçi(ad,soyad,yas,çş));
			
		}
		
		for(İşçi i:liste)
		{
			System.out.println(i.id+" "+i.ad+" "+i.soyad+" "+i.MaasHesapla()+" "+i.Görev);
		}
		
		File f=new File("işçiler.txt");
		
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		for(İşçi i:liste)
		{
			bw.write(i.id+" "+i.ad+" "+i.soyad+" "+i.MaasHesapla()+" "+i.Görev+"\n");
		}
		
		bw.flush();
	}

}
