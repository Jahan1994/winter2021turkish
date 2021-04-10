package day17_forloop;

import java.util.Scanner;

public class C4_ForLoopNesdetIf {

	public static void main(String[] args) {
		/* Kullanicidan 10dan kicik pozitif bir rakam girmesini isteyin ve 
		 girilen rakama gore asagidaki sekli cizdirin
		 
		  *
		  * *
		  * * *
		  * * * *
*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("10dan kicik positive bir tam sayi girin");
		int sayi=scan.nextInt();
for(int i=0;i<=sayi;i++) {
	System.out.println("");
	for(int j=0;j<i;j++) {
		System.out.print("*");
		scan.close();
	}
	
}
		
	}

}
