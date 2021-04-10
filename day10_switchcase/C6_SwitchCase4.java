package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullanicidan VIP(very iportant person) kisaltmasinda hansi harfin anlamini istedigini soralim
		//gireln harfin aciklamasin yazalim
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen harf yazin");
String str=scan.next();
	switch(str) {
	case "v":
	case "V":
	System.out.println("Very");
	break;
	case "i":
	case "I":
		System.out.println("important");
		break;
	case "p":
	case "P":
		System.out.println("person");
		default:
System.out.println("duzgun yazin");

char harf =scan.next().charAt(0);
switch(harf) {
case 'v':
case 'V':
System.out.println("Very");
break;
case 'i':
case 'I':
	System.out.println("important");
	break;
case 'p':
case 'P':
	System.out.println("person");
	default:
System.out.println("duzgun yazin");
scan.close();
	}
	}
	}
}
