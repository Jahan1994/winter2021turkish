package day14_methodcreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		//verilen 3 double sayinin ortlamasini alan bir method yazin
		//main method icinden cagirilarq calsitirin
		ortalama(80, 60);
		ortalama(80, 60,55);
	}// mm sonu

	public static void ortalama(double num1, double num2, double num3) {
		System.out.println("3 sayinin ortalamasi =" + (num1 + num2 + num3) / 3);
	}

	public static void ortalama(double sayi1, double sayi2) {
		System.out.println("girdiyiniz iki sayinin: " + (sayi1 + sayi2) / 2);
		
		
	}

	
	
	
}// class sonu
