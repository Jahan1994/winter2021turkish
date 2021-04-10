package day17_forloop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		/* Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen rakamlar toplamini bulmak icin bir positive tam sayi girin");
		int num=scan.nextInt();
	
		if(num<=0) {
			System.out.println("lutfen positive tam sayi girin");
			scan.close();
			
		}else {
			rakamlarToplamiYazdir(num);
		}
	}

public static void rakamlarToplamiYazdir(int num) {
		int rakamlarToplami=0;
		String num1=num+"";
		for(int i=0;i<num1.length();i++) {
			rakamlarToplami+=num%10;
			num/=10;
			
		}
		System.out.println("rakamlar toplami:"+rakamlarToplami);
		
	}

}
