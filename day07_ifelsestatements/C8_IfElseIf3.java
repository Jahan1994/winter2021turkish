package day07_ifelsestatements;

import java.util.Scanner;

public class C8_IfElseIf3 {

	public static void main(String[] args) {
	// Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
		// Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 
		//60 – 80.000 arasinda ise  “Konusabiliriz”, 
		//60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen maas teklifinizi yazin");
		int maas=scan.nextInt();
		if(maas>=80000) {
			System.out.println("kabulediyorum");
			
		}else if(maas>=60000&&maas<=80000) {
			System.out.println("konusabiliuriz");
		}
		else if (maas<=60000) {
			System.out.println("Maalesef kabul edemem");
		} else {
			System.out.println("malesef kabul ededm");
			scan.close();
	}

		
}
}