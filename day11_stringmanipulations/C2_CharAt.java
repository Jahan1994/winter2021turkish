package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		//index 0dan baslar
		String str="Java cok guzel";
		System.out.println(str.charAt(0));//J
System.out.println(str.charAt(5));//c
System.out.println(str.charAt(13));//l
//kelimenin uzunlugu son index +1dir=13+1=14
//son index kelimenin uzunlugu -1=13 
//System.out.println(str.charAt(15));//exception verir

//kullanici 10 harfli bir kelime girerse abcd efghi
//bana son harfi verecek kod yaziniz
//str.char(9)
//eger index olaraq stringin uzunlugu ve ya daha buyuk bir sayi girilirse
System.out.println(str.charAt(14));//hata verir max 13 olmali

//String str3=5;//compile time error(cte)
//kod calismadan javanin farkina varib altini kirmizi cizdiyi hatalardir
//derleme hatasi
//bu tur hatalar duzeltilmeden java kodu calistirmaz//
  //System.out.println(str.charAt(14));//bazi hatalar syntax den anlasilmaz
//ancak kod calistirildiktdan sonra java islemi yaparken anlasilir
//kod run edilidiginde ortaya ciktigi icin bu tur hatalara RUN TIME ERROR(RTE) denir

	}

}
