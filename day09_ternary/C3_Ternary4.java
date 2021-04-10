package day09_ternary;

import java.util.Scanner;

public class C3_Ternary4 {

	public static void main(String[] args) {
		// kullanicdan iki sayi al buyuk olani yazdir
		Scanner scan=new Scanner(System.in);
		System.out.println("iki sayi yaz");
		double a=scan.nextDouble();
		
		double b=scan.nextDouble();
		
	System.out.println(a>=b?a:b);
	scan.close();

	}

}
