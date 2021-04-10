package day13_stringmanipulations;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		//kullanicidan bir cumle isteyin  cumledeki butun bosluqlari silin
		//ve butun a larin yerine e yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle girin");
		String str=scan.nextLine();
		str=str.replace(" ", "");
		str=str.replace("a","e");
		System.out.println(str);//assign etmezsek manipulations str i deyistirmez
		//eger assign edersek str kalici olarak deyistigi icin biz bir daha orijinal str a ulasamayiz
		//bunun icin kullanicidan aldigimiz str a degil yeni bir stringe assign etmek daha mantikli
		 System.out.println("Lutfen bir cumle daha giriniz");
String str2=scan.nextLine();
System.out.println(str2.replace(" ","").replace('a', 'e'));
//hem a hemde e nin yerine i yazaq
System.out.println(str2.replace("a", "i").replace('e', 'i'));
//hem a hemde e nin yerine i yazaq boyik kicik herf gozetmezsek
System.out.println(str2.toLowerCase().replace("a", "i").replace('e', 'i'));
	scan.close();

	}

}
