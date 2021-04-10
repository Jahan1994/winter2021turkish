package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		//kullanicidan gun ismini isteyin 
		//girilen gunun hafta ici ve ya hafta sonu oldugunu yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("gun ismini yazin");
		String gunAdi=scan.next().toLowerCase();
		//eyer string lerde beraberlik sorugulaniyors == kullanmamaliyiz
		//stringlerde beraber olma durumu sorgulmak ucun equal istf edilir
		if(gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
			System.out.println("Haftasonu");
	}
		if(gunAdi.equals("pazartesisi") || gunAdi.equals("persenbe")||  gunAdi.equals("cuma")||gunAdi.equals("sali"))  {
			System.out.println("hafta ici");
		scan.close();
		}	
}
	
}