package day06_ifstatements;

import java.util.Scanner;

public class C2_ifStatement2 {

	public static void main(String[] args) {
		// kullanicidan bir sayi isteyin ve sayinin tek ve cift sayi oldugunu yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("bir tamam eded yaz");
		int num=scan.nextInt();
		//153%2==0 sayi cut
		//153%2==1 sayi tek
		if (num%2==0) {
			System.out.println("yazdigin eded cutdur");
			
		}
		if(num%2==1|| num%2==-1) {
			System.out.println("yazdigin eded tek");
		}
	System.out.println("katildiginiz icin teskkurler");
	scan.close();
	}
	
}