package day12_stringmanipulations;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// IndexOf() methodu bize istediyimiz karakter(lerin) indexlerini
		// dondurur(returns)
		String str = "Java oyren, is sahibi ol";
		System.out.println(str.charAt(6));// y
		System.out.println("char axtarma " + str.indexOf('y'));// 6
		System.out.println("string axtarma " + str.indexOf("y"));// 6
		System.out.println("string kelime axtarma " + str.indexOf("is"));// i->12,s->13 cvb:12
		System.out.println("birden cox varsa " + str.indexOf('i'));// ilk tadiginin ins=dexin getirir 12
		System.out.println("baslangiz indexi ile " + str.indexOf('a', 4));// baslangiz indexi inclusive
		System.out.println("olmayan herf " + str.indexOf("sahibi"));

//kullanicidan bir cumle isteyin case sensitive olmadan Java kelimesi icinde olub olmadigini yazdiri
		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle yaz ");
		String cumle = scan.nextLine().toLowerCase();
		// int sonuc = cumle.indexOf("Java");// java varsa ilk java kelimesini indexni
		// dondurur
//java yoxsa -1
		// System.out.println(sonuc==-1?"Java icermiyor":"Java iceriyor");
		if (cumle.indexOf("java") >= 0) {// java kelimesinin indexinin 0 ve ya daha boyuk oldugunu kontrol edir
			System.out.println("cumle java iceriyor");
		} else {
			System.out.println("cumle java icermiyor");
			
			scan.close();
		}

	}

}
