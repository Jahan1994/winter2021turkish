package day05_wrapperconcetanationoperator;

public class C2_WrapperClass {

	public static void main(String[] args) {
	
		String isim="mehmet";
		System.out.println(isim.toUpperCase());
		//Wrapper Class Javanin primitive data turleri ile bazi methodlari kullana bilmemmiz icin yaratdigi classlardi
		//boolean,char,byte,short,int,long,float,double
		
		byte sayi=10;
		Byte sayi2=11;// ismen primitive data turu ile ayni olan np datalara Wrapper denir
		System.out.println(sayi2);
		System.out.println(sayi);
		Byte byteMinSayi=Byte.MIN_VALUE;
		System.out.println(byteMinSayi);
		Byte byteMaxSayi=Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
		
		//variable olusturmadan direk olarak shortun en kucuk ve en buyuk deyerlerini yazdiraq
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		//int in wrapper clasi INteger
		//int in en kicik ve en boyuk deyerleri yazin
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//Boolean,character,Byte,Short,Int,Long,Float ,double
	
	
		
		
		
		
	}
}
