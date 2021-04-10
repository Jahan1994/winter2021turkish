package day09_ternary;

import java.util.Scanner;

public class C4_Ternary5 {

	public static void main(String[] args) {
		//Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
Scanner scan=new Scanner(System.in);
System.out.println("tam sayi girin");
int a=scan.nextInt();

System.out.println(a%2==0?"cut":"tek");
//girilen sayinin mutlak degerini yazdir:mutlak deger yeni x pozotivse|x|=x,negativse |x|=-x
System.out.println("sayinin mutlak degeri:"+(a>0?a:-a));
scan.close();
}
}