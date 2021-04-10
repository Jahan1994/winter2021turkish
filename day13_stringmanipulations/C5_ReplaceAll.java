package day13_stringmanipulations;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		// 
		String str="Java ogren,mutlu ol,Java candir 12345";
		System.out.println(str.replace("Java", "hava"));
		//replaceAll() methodu replace() methoduna benzer ama 2 varki var
		//1.replace() methodu char kabul eder ama replaceAll kabul etmez
		//2.replaceAll methodu regecp kullanimina izin verir
		System.out.println(str.replaceAll("\\w","*"));//tum harf ve rakamlar yerine * yazacak
		System.out.println(str.replaceAll("\\W", "*"));//w  un tersi
		System.out.println(str.replaceAll("\\d","."));//sayilari . yapar
		System.out.println(str.replaceAll("\\D","."));//sayi olmayanlari . yapar
		System.out.println(str.replaceAll("\\s","&"));//bosluqlar & isaresi ile deyisecek
		System.out.println(str.replaceAll("\\S","&"));//bosluq olmayan her sey & eder
		System.out.println(str.replaceAll("\\d", ""));//sayilari siler
		
	}

}
