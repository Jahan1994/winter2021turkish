package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullanicidan hangi gunde oldugmuzu isteyin
		// girilen gunun haftya ici yada hafta sonu oldugun yazdir
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir gun  yazin");
		String gun = scan.next().toLowerCase();

		switch (gun) {
		case "bazarertesi":
		case "cersenbe":
		case "cersenbe axsami":
		case "cume axsami":
		case "cume":
			System.out.println("hefte ici");
			break;
		case "senbe":
		case "bazar":
			System.out.println("hefte sonu");
			break;
		default:
			System.out.println("duzgun yazin");
			scan.close();
		}
	}

}
