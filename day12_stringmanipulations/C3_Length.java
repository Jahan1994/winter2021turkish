package day12_stringmanipulations;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// kullanicidan bir string girmesini isteyin girilen stringin son harfini buyuk
		// harf olarak yazdirir

		Scanner scan = new Scanner(System.in);
		System.out.println("bir string girin");
		String str = scan.nextLine().toUpperCase();
		System.out.println("girdiyiniz cumlenin son herfi :" + str.charAt(str.length() - 1));
		// length()methodu girilen stringin uzunlugunu verir
		System.out.println(str);// kullanici ne girdiyse hamisin boyuk herfle yazir

		String str2="";
		System.out.println(str2.length());//0
		//String str3=null;  //null hecne demekdir.hecin uzunlugu yoxdur ona gorede RTE verir
		//normalda stringler "" icinde yazilir ama null ucun buna gerek yoxdur
		//null case sensitive dir dolayisiyla NULL ve ya Null yazilmaz
		//null bir deyer deyildir sadece hecliyi gosteren bir pointer dir.
		
		//System.out.println(str3.length());

		//System.out.println(str3.equals(str2));//RTE
		//null assign etmek string ile string manipulation methodlari kullanilmaz
		System.out.println(str.charAt(1));//index 1 olan(basdan ikinci)herfi verir
		//System.out.println(str3.charAt(1));//RTE
		scan.close();
	}

}
