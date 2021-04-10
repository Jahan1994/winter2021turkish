package day08_iselsenestedif;

public class C2_NestedIf {

	public static void main(String[] args) {
	//Verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini
		 //yazdiran bir java programi yaziniz
		 //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		 //calisan erkekse 65 yasindan buyukse emekli olabilir.
		String cinsiyyet="kadin";
		int yas=59;
		if(yas<0) {
			System.out.println("yas negatif olamaz");
		}
	else if(cinsiyyet.equalsIgnoreCase("erkek")&&yas>66) {
			System.out.println("emekli ol bilirsin");
		}else if(cinsiyyet.equalsIgnoreCase("erkek")&&yas<65) {
			System.out.println("emekli olamazsin");
		}else if(cinsiyyet.equalsIgnoreCase("kadin")&&yas>60) {
			System.out.println("emekli ola bilirsin");
		}else if(cinsiyyet.equalsIgnoreCase("kadin")&&yas<60) {
			System.out.println("emekli olamazsin");
		}else {
			System.out.println("cinsiyyet ve ya yas tanimsiz");
		}	
			System.out.println("nested if ile sonuc");
			if(cinsiyyet.equalsIgnoreCase("Erkek")) {
				if (yas<0) {
					System.out.println("erkek yas negativ olamaz");
				} else if(yas<65) {
System.out.println("bu yastaki erkek emekli olamazsin");
				}else {
					System.out.println("emekli olabilirsin");
				}
			}else if(cinsiyyet.equalsIgnoreCase("Kadin")) {
			if(yas<0) {
				System.out.println("kadin yas negatif olamaz");
			}else if(yas<60) {
				System.out.println("bu yastaki kadin emekli olamaz");
			}else {
				System.out.println("bu yastaki kadin emekli ola bilir");
			}
			
		}else {
			System.out.println("yazdiginiz cinsiyyet  sisteme kayitli degil");
		}

	
}
}
