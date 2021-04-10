package day07_ifelsestatements;

import java.util.Scanner;

public class C5_IfElse4 {

		public static void main(String[] args) {
			//kullanicidan ucbucagin uzuzluqlarin alin
			//3terefdide beraberse beraberterfli ucbucag yaz
			//deyilse beraberterfli deyil yazdirin
			Scanner scan=new Scanner(System.in);
			double a=scan.nextDouble();
			double b=scan.nextDouble();
	double c=scan.nextDouble();
	if(a==b&&b==c) {
		System.out.println("beraberterfli ucbucaq");
	}
	else {
		System.out.println("beraberterfli olmayan ucbucaq");
		scan.close();
	}
		}

}
