package day20_scope;

import java.util.Scanner;

public class Scope1 {

	public int sayi;// clasin icinde fakat main methodun disindan olusturulan
	// ve static olmayan variable lara INSTANCE(object) variable deyilir.
	// class levvelda olusturuldugu icin classin her yerinden belli sartlarla
	// kullanila bilnir
	// instance variballar object e bagli olarak calisir(ogretmen adi veya ogrenci
	// notu gibi)
	public String isim = "Mehmet";
	public String soyIsim;// default deger null
	boolean izindeMi;// default deger false
	char ilkHarf;// default deger space
	public String soyisim;

	public static void main(String[] args) {

		//System.out.println(sayi);//static olmayan bir variable la static method
		// icinden ulasamayiz
		// main method static oldugu icin main method icerisinden
		// static olmayan variable ve ya methodlara direk ulasamayiz

//instance bir variable a main method icinden ulasmak istediyinizde 
		// OBJECT olusturmaliyiq

		Scanner scan = new Scanner(System.in);// bu javadki standart obje olusturma formidir
		// class ismi //obje ismi obje olusturma keyword //class ismi()

		Scope1 obj1 = new Scope1();
		System.out.println(obj1.sayi);// buna deger atamadik java default deger verdi 0
		System.out.println(obj1.isim);//mehmet
		System.out.println(obj1.soyIsim);// buna deger atamadik default deger verdi null

		// instance variable lar olusturuldugunda biz istersek deger ataya bilirik
		// Instance variable lara eger biz deger atamazsak java default deger atar

		Scope1 obj2 = new Scope1();
		obj2.isim = "Muslum";
		obj2.soyIsim = "Baba";
		System.out.println(obj2.isim + " " + obj2.soyIsim);// Muslum Baba
		System.out.println(obj1.isim + " " + obj1.soyIsim);// Mehmet null

		System.out.println(obj2.izindeMi);// false
		System.out.println(obj2.ilkHarf);// space

		Scope1 obj3 = new Scope1();
		obj3.isim = "Ferdi";
		obj3.soyIsim = "Tayfur";
		obj3.izindeMi = true;
		System.out.println(obj3.isim + " " + obj3.soyIsim + " " + obj3.izindeMi);
		scan.close();
	}

	public static void staticMethod() {

	}

	public void method() {
		System.out.println(sayi);// bu method static olmadigi icin instance variable lara direk erisebilr
		sayi = sayi + 20;// bu method icerinsden gecerli olmak uzere degerini degistire bilir

	}

}
