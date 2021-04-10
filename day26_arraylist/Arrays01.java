package day26_arraylist;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Verilen bir arraden isten degere esit olan elmentleri kaldirip kalanlari yeni
		// bir array olarak yazdrian bir method yaz

		int arr[] = { 2, 3, 5, 3, 6, 4, 3, 6, 7 };
		int sayi = 3;

//1) arr icinde kaldirmam istenen sayi kac tane var,bulmam gerek
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sayi) {
				count++;
			}
		}

//2)yeni arry olusturlim
		int arr2[] = new int[arr.length - count];

//3)arr arrayinden elemenleri tek-tek alip istenen sayiya esit degilse arr2 ye ekleyeceyim
		int temp = 0;// bununla yeni arryin indexlerini kontrol edevegim
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=sayi) {
				arr2[temp]=arr[i];
				temp++;
			}
		
		}
		System.out.println(Arrays.toString(arr2));
	}

}
