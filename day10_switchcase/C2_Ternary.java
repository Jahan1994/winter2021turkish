package day10_switchcase;

import java.util.Scanner;

public class C2_Ternary {

	public static void main(String[] args) {
		// kullanicdan bir sayi ali
		//sayi cifte ise cift yazdir
		// degilse sayinini karesini yazdir
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayin girin");
		int sayi=scan.nextInt();
		
		System.out.println(sayi%2==0?"cift":sayi*sayi);
		//eger ternaryde iki durum icin farkli data tipleri donusu oluyorsa 
		//ya variabla atama yapmadan direk yazdiririz
		//yada mumkunse sonuclari ayni data tipine cevirmeye calisirz
		scan.close();
	}

}
