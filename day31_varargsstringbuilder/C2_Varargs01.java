package day31_varargsstringbuilder;

public class C2_Varargs01 {

	public static void main(String[] args) {
		// .verilen iki sayiyi toplayan ve sonucu yazdiran method yazdiriniz

		int sayi1 = 10;
		int sayi2 = 20;
		int sayi3=30;
		toplam(sayi1, sayi2);
		
		// .verilen 3sayiyi toplayan ve sonucu yazdiran method yazdiriniz
		toplam(sayi1,sayi2,sayi3);
		
		//oyle bir method olmaliki  icine kac sayi yazarsak yazalim toplasin
		toplam(2,3);//iki sayinin toplami calisr
		toplam(2,5,8);//3cu sayinin toplama methodu
		//istedigimiz kadar sayinin yazabailecegimiz methodun olusturabilmemiz icin Java varargars olusturu
		
		
	}

	public static void toplam(int sayi1, int sayi2, int sayi3) {
		System.out.println("3sayinin toplami "+(sayi1+sayi2+sayi3));
		
	}

	public static void toplam(int sayi1, int sayi2) {
		System.out.println("2sayinin toplami "+(sayi1 + sayi2));
	}
}
