package day29_passbyvalueimmutable;

public class C1_PassByValue01 {

	public static void main(String[] args) {
		// PassByValue ve PassByRefernce

		/*
		 * Verilen bir fiyat icin %10 indirim yapan bir method olusturun. - Method’da
		 * indirim uygulanan fiyati yazdirin - Method Call sonrasi original fiyati
		 * yazdirin ve method’da yapilan degisikligin orginal degeri degistirip
		 * degistirmedigini kontrol edin.
		 */

	double fiyat=100;
		indirimUygula(fiyat);//method call yaptik
		System.out.println("method call sonrasi fiyat:" +fiyat);//100
	}

	public static void indirimUygula(double fiyat) {//methodun icinde olan clone oluryuor ve on methodun icinde istediyimiz deyisilkleri
		                                               //ede bilerik ve method icinde kecerlidir.geriye donende fiyat oludgu kimi qalir
		fiyat=fiyat*0.90;
	System.out.println("10% endirimli fiyat :"+fiyat);
	System.out.println(fiyat-10);//80.0
		
	}

}
