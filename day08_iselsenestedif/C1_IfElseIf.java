package day08_iselsenestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
	//Kullanicidan gun ismini yazmasini isteyin. 
  //Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, 
		//gun  ismi  gecerli degilse “Gecerli gun ismi giriniz” yazdirin	
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen gun ismini giriniz");
		String gunIsmi=scan.nextLine().toLowerCase();//girilen butun yazini kicik herfe cevirdik
		if(gunIsmi.equalsIgnoreCase("pazar")||gunIsmi.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		}else if(gunIsmi.equalsIgnoreCase("sali")) {
			System.out.println("Sal");
		}else if(gunIsmi.equalsIgnoreCase("CARSANBA")) {
			System.out.println("Car");
		}else if(gunIsmi.equalsIgnoreCase("persenbe")) {
			System.out.println("Per");
		}else if(gunIsmi.equalsIgnoreCase("cuma")||gunIsmi.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
			
		} else
			System.out.println("lutfen kecerli bir yazi girin");
		//equalsIgnorCase():methodu 2 stringin buyuk,kucuk harf hassasiyeti olmadan esit olub olmadigini kontrol eder
		//next() sadce ilk kelimeyi alir(ilk space e kadar olan kismi alir)
		//nextline() ise o setrin hamisin yazir
		scan.close();
	}

}
