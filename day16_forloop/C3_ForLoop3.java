package day16_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		//kullanicidan postive bir  tam sayi alin
		//1den kullanicinin girdyi sayiya kadar olan butun tam sayilarin toplamini yazin
		
	Scanner scan=new Scanner(System.in);
	System.out.println("lutfen positive bir tam sayi girin");
		int sayi= scan.nextInt();
		int toplam=0;
		for(int i=1;i<=sayi;i++) {
			//toplam=toplam+i;
			toplam+=i;
			
		}
		System.out.println(toplam);
		scan.close();
			
		}
	}


