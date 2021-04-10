package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		//kullanicadan gun sozunun ilk herfini iste ve herfe uygun olan gun adlari yazin
		Scanner scan=new Scanner(System.in);
		System.out.println("gun sozunun ilk herfini yaz");
		 char ilkHerf=scan.next().toUpperCase().charAt(0);
		 System.out.println(ilkHerf);
		if(ilkHerf=='p'|| ilkHerf=='P') {
			System.out.println("pazar,pazartesi ve ya persenbe");
		}
if(ilkHerf=='s'||ilkHerf=='S'){
System.out.println("sali");
	}
if(ilkHerf=='c'|| ilkHerf=='C') {
	System.out.println("carsanba,cuma ve ya cumartesi");
} 

if(ilkHerf!='p' && ilkHerf!='P'&&ilkHerf!='s'&& ilkHerf!='S'&&ilkHerf!='c'&&ilkHerf!='C') {
	System.out.println("kecerli bir herf yaz");
	scan.close();
}
	}
}
