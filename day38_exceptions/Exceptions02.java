package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		// Kullanicidan 2 tam sayi alin ve bolumlerini yazdirin
		// 100efa araliksiz yaz
		int count = 1;
		Scanner scan = new Scanner(System.in);
		while (count < 100) {
			System.out.println("lutfen bolunecek sayiyi girin");
			int num1 = scan.nextInt();
			System.out.println("lutfen kaca bolmek istediyinizi yazin");
			int num2 = scan.nextInt();
			/*
			 * javaya exception i handle etmek ici bir cozum uretmeksek java exception ile
			 * karsilastiginda calismayi durdurur //(stop execution) //sonra throw
			 * exception(exception firlatir)(problemin kaynagini bize gosterir) dolaysiyla
			 * tum aplication durmus olur. musterinin kullandigi bir uygulama icin bu kabul
			 * edilemez. bunun icin kod yazan kisi muhtemel sorulaniri ongormeli ve javaya
			 * bu sorunlara handle edebilmesi icin yol gostermelidir
			 */

			System.out.println("islem no:" + count);
		try {
			System.out.println("bolme isleminin sonucu:" + num1 / num2);
		
		}catch(ArithmeticException e) {
			System.out.println("sayiyi 0a bolemezsin");
		}
		count++;
	}	
	}
}
