package day18_whileloop;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		/*Kullanicidan baslangic
		 *  ve bitis haflerini alin
		 *  ve baslangic harfinden baslayip 
		 *  bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
		 *  Kullanicinin hata yapmadigini farz edin
		 */
Scanner scan=new Scanner(System.in);
System.out.println("lutfen baslangiz harfi yazin");
char basharf=scan.next().toUpperCase().charAt(0);
System.out.println("lutfen son harfi yazin");
char bitharf=scan.next().toUpperCase().charAt(0);	
for(char i=basharf;i<=bitharf;i++) {
	System.out.print(i+" ");
	scan.close();
}
System.out.println("");
//while ile
	//baslangiz deyer var: basharf
	
	while(basharf<=bitharf) {
		System.out.println(basharf+ " ");
		basharf++;
	}
	}
}