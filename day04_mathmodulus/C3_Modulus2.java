package day04_mathmodulus;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		//

		Scanner scan=new Scanner(System.in);
		System.out.println("merteberli tapmaq ucun 4 mertebeli bir eded yaz");
		int sayi=scan.nextInt();// bu setrden etibaren elimizde 4 mertebelo bir eded var
		//4 mertebetini elde etmek ucunyuxarida yazdigimiz islemi 3 defe edirik
		//1.tekrar 
		int teklik=sayi%10;
		sayi/=10;
		//bu setrden sonra 3 mertebeli oldu
		//onluq mertebesini tapmaq ucun 2ci defe tekrR
		int onluq=sayi%10;
		sayi/=10;
		//bu setrden etibaren 2 mertebe qaldi
		//3.
		int yuzluk=sayi%10;
		sayi/=10;
		//bu setrden etibaren eded bir merebeli
		int minlik=sayi%10;//burda % prosesin etemek mecburiyyetnde deyilik
		//butun mertebeler var ve hmisin yazdiraq
		System.out.println("teklikler =" +teklik);
		System.out.println("onluqlar=" +onluq);
System.out.println("yuzlukler =" +yuzluk);
System.out.println("minlikler =" +minlik);
//sayiyi tersden yazaq
System.out.print(teklik);
System.out.print(onluq);
System.out.print(yuzluk);
System.out.print(minlik);
System.out.println();
//yada bele yaza bilerik
System.out.println(teklik+onluq+yuzluk+minlik);
//reqemleri cemin deyil yan yana yazaq
System.out.println("yazdigimiz ededin tersden yazilisi ="+teklik+onluq+yuzluk+minlik );
		
scan.close();
	
		
		
	
	}

}
