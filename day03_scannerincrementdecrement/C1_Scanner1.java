package day03_scannerincrementdecrement;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("sadece adinizi yazin");
		String name=scan.nextLine();
		System.out.println("soyadini yaz");
		String surname=scan.nextLine();
		
		
		//eger yazdircagimiz yazi sabitdirse "" icinde
		//eger vairable a degr versek degeru yazdirmak ucun "" olmadan sadce vaariable adini yaziriq
		
		System.out.println("adiniz : " + name);
		System.out.println("soyadini yaz : " + surname);
		System.out.println("kursumuuza kaydinizi alinmistir tesekkurler");
	scan.close();	
	}

}
