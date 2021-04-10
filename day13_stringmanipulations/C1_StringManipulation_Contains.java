package day13_stringmanipulations;

import java.util.Scanner;

public class C1_StringManipulation_Contains {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve aramak istedigi bir string istediyin
		// cumle stringi iceriyorsa "basarili" degilse "basarisiz"yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle girin");
		String cumle = scan.nextLine().toLowerCase();// cumle oldugu ucun nextlin//Java Guzel
		System.out.println("lutfen aramami istedigimiz stringi giriniz");
		String aranan = scan.nextLine().toLowerCase();// java
		cumle.contains(aranan);// bu islemin sonucu boolean ,benim bunu yaziya cevirmem lazim
		System.out.println(cumle.contains(aranan) ? "Basarili" : "Basarisiz");

		// kullanicidan mail adresini isteyin .mail adresi @gmail.com iceriyorsa mailini
		// kayd edilidi yazilsin,
		// yoksa lutfen gmail adresini giriniz yazdirin

		System.out.println("Lutfen mailinizi giriniz");
		String email = scan.next();
		int sondami = email.indexOf("@gmail.com", email.length() - 10);// index olarak length()-10 yazarsam
//eger email gmail.com  ile bitiyorsa bu islemin sonucu bir index olur(int)
//eger email gmail.com ile bitmiyorsa -1
		if (email.contains("@gmail.com") && sondami != -1) {
			System.out.println("mailiniz kaydedildi");
		} else {
			System.out.println("lutfen gmail adresinizi giriniz");
		}
		// eyer @gmail.com un en sonda oldugunu kontrol etmek istersek
		scan.close();
	}

}
