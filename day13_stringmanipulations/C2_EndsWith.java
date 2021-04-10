package day13_stringmanipulations;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
		
String str="Javayla hayat ne guzel";
System.out.println(str.endsWith("zel"));//true
System.out.println(str.endsWith("ne guzel"));//true
System.out.println(str.endsWith("zel "));//false
//1)kullnicidan bir email isteyin
//eger @ isareti icermiyorsa "girdiyiniz bilgi email deyil desin"
//eger @ isareti iceriyor ama @gmail.com icermiyorsa "lutfen gmail adresi yazin"
//eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa "gecersiz gmail.adresi" yazsin
Scanner scan=new Scanner(System.in);
System.out.println("email adresi yazin");
String email=scan.next();
if(!email.contains("@")) {//basinda !olanda emailde @ yoxdursa demek
	System.out.println("girdiyiniz bilgi email deyil desin");
}else if(!email.contains("@gmail.com")) {
	System.out.println("lutfen gmail adresi yazin");
	}else if(email.endsWith("@gmail.com")){
System.out.println("emailiniz basarli ile kaydedildi");
}else {
	System.out.println("gecersiz email adresi");
	scan.close();
}

}
}