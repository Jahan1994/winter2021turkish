package day12_stringmanipulations;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		// kullanicida bir cumle alin ve asagidaki 3 durumdan uygun olani yazdirin
		//1-cumle java icermiyor
		//2-cumle bir tane java iceiryor
		//3-cymlede birden fazla java var
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle yaz ");
		String cumle = scan.nextLine().toLowerCase();
		int ilkJava=cumle.indexOf("java");// ya -1 verecek yada ilk javanin indexni
		int sonJava=cumle.lastIndexOf("java");//ya -1 verecek yada son javanin indexni
	if(ilkJava==-1) {
		System.out.println("cumle java icermiyor");
	}else if(ilkJava==sonJava) {
		System.out.println("cumlede 1 java kelimesi var");
	}else {
		System.out.println("cumlede 1den cox java var");
		scan.close();
	}
		
	}

}
