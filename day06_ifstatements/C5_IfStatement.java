package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement {

	public static void main(String[] args) {
		//kullanicidan bir duzbucaqlinin 2 kenar uzunlugunu alin  
		//kenar uzunkluklari beraberse kvadrat deyilse duzbucaqlidir
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen duzbucaqlinin iki kenarini giriniz");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
	if(kenar1>0&&kenar2>0&& kenar1==kenar2) {
		System.out.println("kare");
	}
	if(kenar1>0&&kenar2>0&&kenar1!=kenar2) {
		System.out.println("duzbucaqli");
		if(kenar1<=0||kenar2<=0) {
			System.out.println("lutfen kecerli uzunluq girin");
		}
	}
scan.close();	}

}
