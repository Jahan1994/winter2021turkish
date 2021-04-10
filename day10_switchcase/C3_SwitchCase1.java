package day10_switchcase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		// kullancidan bir ve rakam isteyin
		// girilen rakami yazi ile yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir yazi girin");
		int rakam = scan.nextInt();

		if (rakam == 0) {

			System.out.println("sifir");
		}
		if (rakam == 1) {
			System.out.println("bir");
		} else if (rakam == 2) {
			System.out.println("iki");
		} else if (rakam == 3) {
			System.out.println("uc");

		} else if (rakam == 4) {
			System.out.println("dort");

		} else if (rakam == 5) {
			System.out.println("bes");
		} else if (rakam == 6) {
			System.out.println("alti");
		} else if (rakam == 7) {
			System.out.println("yeddi");
		} else if (rakam == 8) {
			System.out.println("sekkiz");
		} else if (rakam == 9) {
			System.out.println("doqquz");
		} else {
			System.out.println("rakam degil");

		} // switch ile edek
		switch (rakam) {
		case 0:
			System.out.println("sifir");
			break;
		case 1:
			System.out.println("bir");
			break;
		case 2:
			System.out.println("iki");
			break;
		case 3:
			System.out.println("uc");
			break;
		case 4:
			System.out.println("dort");
			break;
		case 5:
			System.out.println("bes");
			break;
		case 6:
			System.out.println("alti");
			break;
		case 7:
			System.out.println("yeddi");
			break;
		case 8:
			System.out.println("sekkiz");
			break;
		case 9:
			System.out.println("doqquz");
			break;
		default:
			System.out.println("lutfen gecerli rakam giriniz");
scan.close();
		}
	}

}
