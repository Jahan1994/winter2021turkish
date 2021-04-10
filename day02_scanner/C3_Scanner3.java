package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini alip aralrinda bir bosluk birakarak
		//isim ve soyisim yazdirin
		//Mehmet,Bulutluoz=> Mehmet Bulutluoz
		Scanner scan = new Scanner(System.in);

		
		System.out.println("lutfen isminizi giriniz");
		String name=scan.nextLine();// sadce next secsem birden cox kelime girsede ilk kelime alir
				//eger kullanicinin girdigi tum yaziyi almak istersen nextLine() secmek lazim
				System.out.println("lutfen soyisminizi giriniz");
		String surname= scan.nextLine();
		System.out.println(name + " " + surname);
	scan.close();	
		
		

	}

}
