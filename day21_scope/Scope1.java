package day21_scope;

public class Scope1 {
	
	static int okulId=1201;
	static String okulAdi="Yildiz Koleji";
	static boolean acikMi;

	
	//static variable lar class levelde olusturuldugu icin classin her yerinde kullanilabilirler
	//instance variable lar static olmayan methodlarda direk kullanila biliyorken static methodlarda object olusuturularak kullanilabiliyordu
	//static variable lar ise ister static istersede static olmayan butun methodlardan direk kullanilabilir
	
	public static void main(String[] args) {
		System.out.println(okulId+ " " + okulAdi+ " "+ acikMi);//1201 Yildiz Koleji false
		okulId=1202;
		acikMi=true;
		staticMethod();
System.out.println(okulId+ " " + okulAdi+ " "+ acikMi);
	}
	
	
public static void staticMethod() {
	System.out.println(okulId+ " " + okulAdi+ " "+ acikMi);//1202 Yildiz Koleji true
	okulId=1203;
	
	
}


public void method() {
	okulId=1205;

}

}
