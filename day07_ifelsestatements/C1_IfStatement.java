package day07_ifelsestatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		//
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen  bir tam sayi giriniz");
		int sayi=scan.nextInt();
		if(sayi>0) {
			System.out.println("sayi positive");
			
		}
		if(sayi<100) {
			System.out.println("kucuk sayi");
		}
		if (sayi>1000) {
			
System.out.println("buyuk sayi");
scan.close();
		}
	}

}
