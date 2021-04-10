package day10_switchcase;

import java.util.Scanner;

public class C1_Ternary_Tekrar {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, yoksa  “Uc  basamakli degil” yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen tam sayi yazin");
		int sayi=scan.nextInt();
		String sonuc=sayi>=100?(sayi<1000? "ucbasamakli ":"ucbasamakli degil"):"ucbasamakli degil";
System.out.println(sonuc);
//nested ternary olmasin
String sonuc1=sayi>=100&& sayi<1000||sayi<=-100&&sayi>-1000?"ucbasamakli":"ucbasamakli degil";
System.out.println(sonuc1);
scan.close();
	}
}
