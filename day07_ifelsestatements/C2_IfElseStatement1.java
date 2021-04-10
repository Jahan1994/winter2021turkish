package day07_ifelsestatements;

import java.util.Scanner;

public class C2_IfElseStatement1 {

	public static void main(String[] args) {
		//kullanicdan duzbucaqlinin uzunluqlarin alin
		//uzunluqlari berberse kvadrat,degilse kvadrat deyil yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("duzbucqaqlinin uzunqlularin yazin");
		double aU=scan.nextDouble();
		double bE=scan.nextDouble();
		if(aU==bE) {
			System.out.println("kvadtrat");
		}
		else {
			System.out.println("kvadtrat deyil");
			scan.close();
		}
	}

}
