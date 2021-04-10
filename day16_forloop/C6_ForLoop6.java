package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		//kullanicidan bir string istedyin ve string i tersine ceviren bir program yazin
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen tersine cevirmek icin bir yazi girin");
		String yazi=scan.nextLine();
		String tersYazi="";
		for(int i=yazi.length()-1;i>=0;i--) {
			tersYazi+=yazi.charAt(i);
		}
		System.out.println("girdiyiniz yazinin tersden yazilisi:"+tersYazi);
		
		//2) yol tersYaziyi sadece yazdiracaksak varsable olusturmadan da yapabilirz
		System.out.println("");
		for(int i=yazi.length()-1;i>=0;i--) {
			
			System.out.print(yazi.charAt(i));
		}
		System.out.println("");
		//3) method olusturp bunu yazdirabiliriz
		tersineCevir(yazi);
		scan.close();
		
	}

	public static void tersineCevir(String yazi) {
	System.out.println("girdiyiniz yazinin tersi method ile:");
		for(int i=yazi.length()-1;i>=0;i--) {
			System.out.print(yazi.charAt(i));
		}
	}
	

}
