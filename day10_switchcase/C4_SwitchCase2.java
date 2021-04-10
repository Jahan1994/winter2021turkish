package day10_switchcase;

import java.util.Scanner;

public class C4_SwitchCase2 {

	public static void main(String[] args) {
		//kullanicidan kacinci ayda oldugunu alin ve ay ismini yazin
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir ay  yazin");
	int ay=scan.nextInt();

		switch(ay) {
		case 1:
		System.out.println("yanvar");
		break;
		case 2:
			System.out.println("fevral");
			break;
		case 3:
			System.out.println("mart");
			break;
		case 4:
			System.out.println("aprel");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("iyun");
			break;
		case 7:
			System.out.println("iyul");
			break;
		case 8:
			System.out.println("avqust");
			break;
		case 9:
			System.out.println("sentyabr");
			break;
		case 10:
			System.out.println("oktaybr");
			break;
		case 11:
			System.out.println("noyabr");
			break;
		case 12:
			System.out.println("dekabr");
			default:
			System.out.println("duzgun yazin");
			scan.close();
		}
		

	}

}
