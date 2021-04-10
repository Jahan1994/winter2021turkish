package day15_methodcreation;

import java.util.Scanner;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir tam sayi alin. Bu sayi sifirdan buyukse, bu sayinin negativ
		 * ve ya pozitiv oldugunu, tek mi cift mi oldugunu ve 3 basamakli ve daha
		 * buyukse birler, //onlar ve yuzler basamagindaki rakamlarin toplamini,100’den
		 * kucukse sadece 1’ler basamagini yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tam sayi girin");
		int sayi = scan.nextInt();
		positiveNegative(sayi); // girilen sagi argumentinin pos ya da neg oldugunu yazdirin
		tekmiCiftmi(sayi);

		if (sayi >= 100) {
			yuzdenBuyuk(sayi);

		} else {
			yuzdenKucuk(sayi);
			scan.close();
		}
	}

	public static void yuzdenKucuk(int sayi) {
		System.out.println(sayi % 10);

	}

	public static void yuzdenBuyuk(int sayi) {
		int rakamlarToplami = 0;
		rakamlarToplami = sayi % 10;
		sayi /= 10;
		rakamlarToplami += sayi % 10;
		sayi /= 10;
		rakamlarToplami += sayi % 10;

		System.out.println("rakamlarToplami =" + rakamlarToplami);
	}

	public static void tekmiCiftmi(int sayi) {

		if (sayi % 2 == 0) {

			System.out.println("sayi cift");
		} else {
			System.out.println("sayi tek");
		}
	}

	public static void positiveNegative(int sayi) {
		System.out.println(sayi > 0 ? "positive" : (sayi < 0 ? "negative" : "positive or negative degil"));
		
	}

}
