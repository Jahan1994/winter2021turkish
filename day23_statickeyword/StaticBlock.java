package day23_statickeyword;

public class StaticBlock {
 static String isim;
 static {
	 //static block class calistirildiginda ilk olarak calisir(main methodan bile once calisir)
	 //static blocklar static variable lara deger atamak icin kullanilir
	 isim="Mehmet";
	 System.out.println(isim);
 } static{
	 System.out.println("2ci static block calisdi");
 
	
 }public static void main(String[] args) {
		isim="Ali Can";
		System.out.println(isim);
	}

 }

