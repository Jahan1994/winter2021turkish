package day07_ifelsestatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
	//kullanicidan yasini sorun
		//65den buyukse "emekli olabilirisin" yoksa "emekli olamasin"yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("yasinizi yazin");
		int yas=scan.nextInt();
		if(yas>=65) {
			System.out.println("emekli olabilirsin");
			
		}
		else {
			System.out.println("emekli olamazsin");
			scan.close();
		}
	}

}
