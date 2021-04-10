package day05_wrapperconcetanationoperator;

public class C3_Concatenation {

	public static void main(String[] args) {
	
//concatenation (birlesdirme):javadan birden fazla stringi + isareti ile toplarsak
		//java stringleri yanyana yazar
		String str1="Java";
		String str2="Guzeldir";
		String bosluq=" ";
		
		System.out.println(str1+str2);
		//aradda bosluq qoymaq ucun 
		System.out.println(str1+ " "+ str2);
		System.out.println(str1+ ' '+str2);
		//Guzeldir  Java
		System.out.println(str2+" "+str1);
		int sayi1=5;
		int sayi2=4;
		//verilen deiskenleri istf ederek 9 yaz
		System.out.println(sayi1+sayi2);
		System.out.println(sayi1+sayi2+str1+str2);
		System.out.println(str1+str2+sayi1+sayi2);
		//javaguzeldir1
		System.out.println(str1+str2+(sayi1-sayi2));//javaguzeldri1
		
		System.out.println(sayi1+sayi2+' ' +str1+str2);//41 javaguzeldr olur 
		System.out.println(sayi1+sayi2+ " "+str1+str2);//9javaguzeldr
		
		//riyazi hesabla aparaeken char data turunden bir deyerle karsilayirsa 
		//o charin ascii deyri alir
		System.out.println(sayi1+sayi2+str1+' '+str2);//9javaguzeldir
		System.out.println(str1+str2+sayi1*sayi2);//javaguzeldir20
		System.out.println(bosluq);
		
		
		
		
		
		
	}

}
