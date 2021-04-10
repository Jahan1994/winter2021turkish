 package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		/*
		 * Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4 degerini
		 * girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini
		 * yazdirin. Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok
		 * sayi girdiniz, ben toplayamam” yazdirin.2den kucuk sayi girerse en az 2 sayin
		 * girmelisiniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen kac sayi toplmak istediyinizi girin");
		int adet = scan.nextInt();
		if (adet < 2) {
			System.out.println("en az 2 sayi girmelisiniz");
		} else if (adet == 2) {
			ikiSayiTopla();

		} else if (adet == 3) {
			ucSayiTopla();
		} else if (adet == 4) {
			dortSayiTopla();
		} else {
			System.out.println("cok sayi girdiniz,ben toplayamam");
			scan.close();
		}

	}

	public static void dortSayiTopla() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 4 sayi girin");
		double say1 = scan.nextDouble();
		double say2 = scan.nextDouble();
		double say3 = scan.nextDouble();
		double say4 = scan.nextDouble();
		System.out.println("dort sayinin toplami ="+(say1+say2+say3+say4));
		scan.close();
	}

	public static void ucSayiTopla() {
			Scanner scan = new Scanner(System.in);
		System.out.println("lutfen  3 sayi girin");
		double say1 = scan.nextDouble();
		double say2 = scan.nextDouble();
		double say3 = scan.nextDouble();
		System.out.println("uc sayinin toplami ="+(say1+say2+say3));
scan.close();
	}

	public static void ikiSayiTopla() {
		Scanner scan = new Scanner(System.in);
System.out.println("lutfen 2 sayi girin");
double say1=scan.nextDouble();
double say2=scan.nextDouble();
System.out.println("iki sayinin toplami ="+(say1+say2));
scan.close();
	}

}
