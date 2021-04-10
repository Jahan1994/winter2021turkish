package day07_ifelsestatements;

import java.util.Scanner;

public class C3_IfElseStatement2 {

	public static void main(String[] args) {
	//kullanicidan bir karakter girmesini isteyin
		//herf olub olmamasini yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("bir karakter gir");
		char karakter=scan.next().charAt(0);
		
		if ((karakter>='a'&& karakter<='z')||(karakter>='A'&& karakter<='Z' )) {
			System.out.println("girdiyiniz karakter harf");
		}
		else {
			System.out.println("girdiyiniz karakter harf deyil");
			scan.close();
		}
	}

}
