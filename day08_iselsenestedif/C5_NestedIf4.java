package day08_iselsenestedif;

import java.util.Scanner;

public class C5_NestedIf4 {

	public static void main(String[] args) {
		//kullanicidaan bir sifre girmesin isteyin 
		//eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin  ilk harf A ise gecerli sifre degilse gecersiz sifre yazdirin
		//  egerb ilk harf kucuk ise "z" olup olmadigini kontrol edin.ilk harf z ise gecerli sifre degilse gecersiz sifre yazdirin
		
		//1.kullanicidan sifreyi alip ilk harfine bak ve buyuk harfi kucuk harf mi
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen sifre yaziniz");
		char ilkHarf=scan.next().charAt(0);//girilen sifrenin ilk karakterini alir
		if((ilkHarf>='A'&&ilkHarf<='Z')) {//ilk harf buyuk ise
			if (ilkHarf=='A') {
				System.out.println("sifre gecerlidir");
			} else {
System.out.println("sifre gecersiz buyuk harf");
			}
		}else if((ilkHarf>='a'&&ilkHarf<='z')) {//ilk harf kucuk ise
			if (ilkHarf=='z') {
				System.out.println("sifre gecerli");
			} else {
System.out.println("sifre gecersiz kucuk harf");
			}

}else {//ilk harf buyuk harf veya kucuk harf degilse
System.out.println("sifre gecersiz");
scan.close();
}
}
}