package day29_passbyvalueimmutable;

public class C5_Immutable02 {

	public static void main(String[] args) {
		
//degisikliyi kalici yapmak icin atama yaparsak immutable classlar nasil davranir
		
		String isim="Ali";
		isim=isim+"";
		System.out.println(isim.equals("Ali"));//false
		System.out.println(isim=="Ali");//true
		 String str1=new String("Mehmet");
		 //obje olustururken new keword kullandilidginda java once obje olusturur sonra icine Mehmet koyar sonra deger bakar
		 
		 String str2=new String("Mehmet");                                                       
		 System.out.println(str1==str2);//false degerler ayni referance lar farkli oldugu icin
		 System.out.println(str1.equals(str2));//true
		 String str3="Mehmet";
		 String str4="Mehmet";
		 System.out.println(str3==str4);//true
		 System.out.println(str3.equals(str4));//true
		 System.out.println(str3==str1);//false
		 System.out.println(str3.equals(str1));//true
		 
	
		
	}

}
