package day07_ifelsestatements;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
	//Kullanicidan 100 uzerinden notunu isteyin.
	//Not’u harf sistemine cevirip yazdirin. 
		//50’den kucukse “D”, 50-60 arasi “C”,
		//60-80 arasi “B”, 80’nin uzerinde ise “A”
Scanner scan=new Scanner(System.in);
System.out.println("lutfen notunuzu sayi olaraq giriniz");
double not=scan.nextDouble();
if(not<0|| not>100) {//istenmeyen  bir durum
	System.out.println("lutfen gecerli bir not giriniz");
}
else if(not<50) {//notumuz 0<=not<=100
	System.out.println("notunuz:D");
}else if(not<60) {
	System.out.println("notunuz:C");
	}

else if(not<80){//60 ile 100 arasinda
	System.out.println("notunuz :B");
}else {//80 ile 100 arasinda
	System.out.println("notunuz: A");
	scan.close();
}
	}
	
}