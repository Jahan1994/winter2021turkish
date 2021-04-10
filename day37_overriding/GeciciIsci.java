package day37_overriding;

public class GeciciIsci extends Isci {

	public String calistigiBolum="Yemekhane";
	public static void main(String[] args) {
	
//overriding (gecersiz kilma)
		//bir child classda parent classdan miras alinan methodu degistirmeye overriding denir.
		
		GeciciIsci gi1=new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
		// Parent class'daki method'u child class'da kullanilmamasi icin Parent class'la ayni isimli bir method olusturmaliyiz.
        // Ayni isimli bir method olusturdugumuz zaman Parent Class'inda ki methodu ERISILEMEZ,
		//KULLANILAMAZ yaptik yani overriding yaptik.
	}
//overriding yapmak icin parent classdaki method signature i ile child classda bir method olusturulur.
	//signutare ayni oldugundan sadece body degisir
	//boylece parent classdaki method parent claas method child class icin gecersiz hale gelir
	public int maasHesapla() {
		return 30*8*10;
	}
	@Override//annotation
public void mesai() {
		super.mesai();
		System.out.println("gecici isciler haftada 25 saat calisir");
	}
	//annotaion:aciklama,deepnot
	//Java 18ci setrde kodu inceleyenler icin bir aciklama getiriyor
	//eger override edilen parent classdaki method(overriden)un da calismasini istiyorsak overriding method'a super.overridenMethodIsmi yazariz
    // eger overriding method'da super. yazilmazsa
    // overridden method calismaz. 
    
    // Access Modifier 
    // Child Parent'i sinirlandiramaz 
    // Yani overriding method'un access modifier'i overridden method'un access modifier'indan
    // daha dar olamaz
    
    // Return Type
    // overridden method'un return type'i primitive veya void ise 
    // overriding method'un return type'i da ayni olmali
    // eger return type primitive degilse 
    // (overriding method'un return type'i) IS-A (overridden method'un return type'i) olmalidir.
}

	
	//overridenMethodIsmi yazariz
//eger overriding methodun ilk satirina super() yazilmazsa overriding method calismaz(constructordan farkli)
	

