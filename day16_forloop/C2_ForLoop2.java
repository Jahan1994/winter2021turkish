package day16_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		// kullanicidan 2tam sayin alin
		// ilk sayidan 2 ci sayiya qeder butun tam sayilari yanyana aralarinda bolsuq
		// olarak yazidirn
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 2 tam sayi girin");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a > b) {
			for (int i = a; i >= b; i--)
				System.out.print(i + " ");
		} else {
			for (int i = a; i <= b; i++)
				System.out.print(i + ",");
			scan.close();
		}
	}

}
