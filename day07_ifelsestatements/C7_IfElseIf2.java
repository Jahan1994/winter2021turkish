package day07_ifelsestatements;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		//Kullanicidan iki sayi isteyin,
		//sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
		// sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
		//sayilarin ikisi  farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin, 
		//sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir”  yazdirin.
	
		Scanner scan=new Scanner(System.in);
		System.out.println("iki sayi yazin");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		if(a==0||b==0) {
			System.out.println("sifir carpmaya gore yutan elemandir");
		}else if(a<0&&b<0) {
		}else if (a>0&&b>0) {
			System.out.println("sayilarin topami:"+(a+b));
		} else if (a<0&&b<0) {
			System.out.println("sayilarin hasili:"+a*b);
			
		}else {
			System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
			scan.close();
		}
		
		;

}
}