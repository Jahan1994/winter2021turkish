package day19_dowhileloop;

import java.util.Scanner;

public class C5_DoWhileLoop2 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a
		 * basmasini soyleyin.
		 * Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
		 * “Negatif sayi giremezsiniz” yazdirip basa donun Kullanici 0’a bastiginda
		 * toplam kac pozitif sayi girdigini,
		 * yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin
		 * toplaminin kac oldugunu yazdirin.
		 */
		Scanner scan = new Scanner(System.in);

		int countPos = 0;
		int countNeg = 0;
		int toplamPos = 0;
		int sayi = 1;
		System.out.println("oyuna hosgeldiniz bitirmek istedyiniZde 0a basin ");
		do {
			
			System.out.println("lutfen positive bir sayi girin");

			sayi = scan.nextInt();
			if (sayi > 0) {
				countPos++;
				toplamPos += sayi;
				System.out.println();
			} if (sayi < 0) {
				countNeg++;
				System.out.println("negative sayi girmezsiniz");
			}

		} while (sayi != 0);
		
		System.out.println("toplam" + countPos + "Positive sayi girdiniz");
		System.out.println("toplam" + countNeg + "negative sayi girdiniz");
		System.out.println("girdiyiniz positive sayilarin toplami:" + toplamPos);
		scan.close();
	}

}
