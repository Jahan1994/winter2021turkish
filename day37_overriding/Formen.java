package day37_overriding;

public class Formen extends Isci{
	public String sorumluOlduguBolum="bakim";
	public String isim="Emrullah";
	public static void main(String[] args) {
	//Inheritance da data turu olarak class ismi kullanimi.

        // Bir class'da obje uretirken data turu olarak class'in kendisini 
        // veya parent(lar)ini kullanabiliriz.
        // Olusturdugumuz obje ile variable kullanmamiz gerekirse, hangi degeri 
        // alacagini anlamak icin once Data turu olan class'a gideriz
        // orada aradigimiz variable varsa kullaniriz, yoksa 
        // parent(lar)ina bakariz, yukari dogru giderken ilk buldugumuz degeri kullaniriz 
		Formen fr1=new Formen();
		//fr1 i objesini kullanarak hangi classlarin variable larini gore bilirim
		fr1.sorumluOlduguBolum="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOlduguBolum+" "+fr1.maas);
		
		Isci fr2=new Formen();
		//data turu olarak Isci secildigi icin Iscidenkileri yazidirir Formendiklerki yazdirmaz
		
		fr1.bolum="Kaynak Atolyesi";
	
		System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas);
		// minik bir degisiklik ile isci class'ina public String isim="Mesut" ekledik. Bu class'a da public String isim="Emrullah"; ekledim.
        // Personel classinda hala Emre duruyor. fr3'e deger atamadim ama isim olarak ekrana Mesut yazdiriyor neden ?
        // Cunku bir objeden variable'a gitmek istiyorsak once data turune bakariz.
        // Data turu olarak Isci old. icin oradaki atamayi yazdirir yani Mesut'u eger orada isim olmasa idi,
        // parent class'a cikip bakacakti ve oradaki variable'i yazdiracakti.
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim);
	}

}
