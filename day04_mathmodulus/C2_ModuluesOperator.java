package day04_mathmodulus;

public class C2_ModuluesOperator {

	public static void main(String[] args) {
		//modulus opertaoru bolme isleminde kalalni verir 
		
		//bir ededi 7e bolunmasini tam olub olmamasini modulus biler
		int qaliq=15%4;
		
		System.out.println( qaliq);
		System.out.println(26%8);//qaligi yazir 2
		//856nin tekliyi nedi =6dir
		int sayi=856;
		int teklik=sayi%10;
			System.out.println("ededinin tekliyi:" +teklik);
			//856nin onlugu necedir?=5
		
		System.out.println("10a boldukden sonra sayinin deyeri:" +sayi);
		
		sayi/=10;
		
		int onluq=sayi%10;
		System.out.println("ededin onlugu :"+onluq);
		sayi/=10;
		System.out.println("2ci defa 10a boldukden sonra " +sayi);
		
		
	}

}
