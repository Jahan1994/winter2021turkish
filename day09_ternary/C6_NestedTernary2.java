package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary2 {

	public static void main(String[] args) {
		// Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” ,
		// buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.
		Scanner scan=new Scanner(System.in);
		System.out.println("bir harf yazin");
		char harf=scan.next().charAt(0);
		
			String sonuc=((harf>='a'&& harf<='z')||(harf>='A'&&harf<='Z'))
					?((harf>='a'&& harf<='z'))?"kucuk harf":"buyuk harf":"girdiginiz karakter harf degil ";
			System.out.println(sonuc);
			scan.close();
	}

}
