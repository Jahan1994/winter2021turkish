package day13_stringmanipulations;

import java.util.Scanner;

public class C9_Examples3 {

	public static void main(String[] args) {
		/*Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
		  isim-soyisim : M***** B*******
		  kart no : **** **** **** 1234
		  */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim=scan.next();
		System.out.println("lutfen soyisminizi giriniz");
		String soyisim=scan.next();
		System.out.println("lutfen kart numaranizi giriniz");
		String kartNo=scan.next();
		
		char isimIlkHarf=isim.toUpperCase().charAt(0);
		String isimGeriKalan=isim.substring(1).replaceAll("\\w","*");
	String soyIsimIlkHarf=soyisim.toUpperCase().substring(0,1);
	String soyisimGeriKalan=soyisim.substring(1).replaceAll("\\w", "*");
	String kartNoBasi="**** **** ****";
	String kartNoSonu=kartNo.substring(kartNo.length()-5);
	
	System.out.println("isminiz ve soyisminiz:"+isimIlkHarf+isimGeriKalan+" "+soyIsimIlkHarf+soyisimGeriKalan);
	System.out.println("Kart No: "+kartNoBasi+kartNoSonu);
	
			scan.close();
	
	}

}
