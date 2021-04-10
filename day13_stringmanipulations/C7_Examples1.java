package day13_stringmanipulations;

import java.util.Scanner;

public class C7_Examples1 {

	public static void main(String[] args) {
		// kullanicidan 4 herfli bil kelime isteyin ve girilen kelimeyi terstden yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("4 harfli bir kelime girin");
		String str=scan.nextLine();
		if(str.length()<4|| str.length()>4) {
			
	System.out.println("Lutfen 4 karakterli bir kelime giriniz");
		}else {
			System.out.println(str.substring(3,4));
			System.out.println(str.substring(2, 3));
			System.out.println(str.substring(1, 2));
			System.out.println(str.substring(0, 1));
			scan.close();
			
		}

	}

}
