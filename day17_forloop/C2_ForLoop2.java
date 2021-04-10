package day17_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir tamsayi girmesini isteyin sayi negatif veya sifirsa
		 * "Lutfen pozitif bir tamsayi giriniz" yazdirin Girilen Sayinin rakamlar
		 * toplamini ayri bir method'da hesaplayin
		 * 
		 * Main method icinde Kullanicidan bir sinir deger isteyin rakamlar toplami
		 * sinir degerden buyukse
		 * "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 * degilse
		 * "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 * yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen rakamlar toplamini bulmak icin bir positive tam sayi girin");
		int num = scan.nextInt();
		System.out.println("lutfen sinir deyeri icin positive bir tam sayi girin");
		int sinir = scan.nextInt();
		if (num <= 0) {
			System.out.println("lutfen positive tam sayi girin");
			scan.close();

		} else {
			if ((rakamlarToplamiHesapla(num) > sinir)) {// girilen sayinin rakamlar toplami int
				System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk");
			} else {
				System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil");
			}
		}
	}

	public static int rakamlarToplamiHesapla(int num) {

		int rakamlarToplami = 0;
		String num1 = num + "";//inti stringie cevirdik
		for (int i = 0; i < num1.length(); i++) {
			rakamlarToplami += num % 10;
			num /= 10;
		}

		return rakamlarToplami;
	}

}