package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		
//kullanicdan diktorgeninin uz u ve eninin alin
		//giriken degerli duzbucaqli ve ya kkvadrat oldugun yazin
		Scanner scan=new Scanner(System.in);
		System.out.println("duzbucaqlinin en ve uzunlugun yaz");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		
		
		System.out.println(a>0&&b>0?(a==b?"kvadrat":"duzbucaqli"):"gecersiz kenar");
		scan.close();
	}

}
