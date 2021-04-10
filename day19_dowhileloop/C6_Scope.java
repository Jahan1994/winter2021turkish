package day19_dowhileloop;

public class C6_Scope {
//bir clas icersinde olusturulan variablelarin nerde gecerli oldugu
	//ve neredem killanabildigini o variable in Scopu brlirler
	public static void main(String[] args) {
		int sayi=10;
		denemeMethod();
sayi++;
System.out.println(sayi);
System.out.println(isim);
	}

	public static void denemeMethod() {
	
		//sayi=20;
		String isim="Mehmet";
	}

}
