package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		//kullanicidan 35dan kicik positive bir tam  sayi alin
		//girilen sayinin faktorialini hesablayib yazdiran bir method olusturun
		//6!=1*2*3*4*5*^=720
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 35den kicik  postive bir tam sayi girin");
		int sayi=scan.nextInt();
		
if(sayi<=0||sayi>=35) {
	System.out.println("lutfen gecerli bir sayi girin");
	scan.close();
}else {  
	faktoryalBul(sayi);
}
	}
	public static void faktoryalBul(int sayi) {
		long faktoryal=1;
		for(int i=1;i<=sayi;i++) {
			faktoryal*=i;
		}
		System.out.println(faktoryal);
	}
}
