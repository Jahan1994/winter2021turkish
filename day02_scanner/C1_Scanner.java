package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		// scanner ile kullacidan bilgi ala biliriz
		//3 adimla scanner islemini gereceklesdiriyoru:
		
		//1.Scanner olusturucagz
		Scanner scan = new Scanner(System.in);
		 

	
	// new: javada ne zaman new gorsen yeni bir object yaranir demekdir
	//() icinde yazilan degerlere parametre diyoruz ve Scanner icin System.in yazmamiz gerekeri
	//1kod yazdigimiZda kodun altinda kirmizi cizgi yaranirsa veya setr nomresi olan yerde qirmizi x yaranirsa demeli nese
	//sehv var
//java.util javanin bizimucun hazirladigi bir kitabxnadir ehtiyacimiz olanda ehtiyac olani class a import etmek yeterlidir
	//scan yaratdigimiz scanner objesine verdiyigimiz addir.ferqli adda vere bilerik
	//ancaq scan adini butun programmcilar terefinden istifade edilen bir addir.
	//kodumuz analaslia bilir ve rahat oxumansi ucun scan adini istifade etmek tovsiye edilir
		
		//2.kullaniciya bir msj yaz
		System.out.println(" Karenin bir kenar uzunlugunu girin");
		//3.kullacinin konsula girdigi deyeri programimiza alacagiz ve 1 variable yardib ona deger vermeliyik
		//kullanicida bir kenar uz-u istedigim ucun kullanicida kucuk bir sayi da girebilir
		//buyuk bir sayida yazabiler,tam sayi da yazabilir vergullu sayida yazabilir
		double kenar=scan.nextDouble();//next sonraki gelen yeni
		System.out.println("girdiginiz kenar uzunluguna sahip karenin alani= " +kenar*kenar);
		//5
		scan.close();
		
		
		
	
	

	}

}
