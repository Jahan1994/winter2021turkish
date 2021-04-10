package day38_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		//try-catch blogundaki e nin gorevi
		
		int sayi1=10;
		int sayi2=0;
	 
		Exceptions01 exp=new Exceptions01();
		//esitliyin solundaki Exceptions01 hem class adi hemde exp objesi icin data turu
 try {
	 System.out.println(sayi1/sayi2);
 }catch(ArithmeticException e) {//int a,String kelime,Object obj gibi..
	 //ArithmeticException javada bir class ve e objesi icin data turu.e ise ArithmeticException classindan olusturdugumuz objenin adi
	 // o zaman ismi e olmak zorunda degililiz ama genelde e kullanilir(for each de each kimi)
	 System.out.println("sayiyi 0a bolemezsin");//bizim kullanica vermek istediyimiz 
	 System.out.println(e);//direk bana hatani verdi e yazinca.problemin kaynaigin verir
	//bu durumda hem javaya sorunu yazmasi icin firsat vermis hemde aplication i blocke etmemis oluruz
	 System.out.println(e.getMessage());//- / by zero. problemin ne oldugun verir
	 
	 e.printStackTrace();/*sadece yazdirir ve netice:java.lang.ArithmeticException: / by zero
		at day38_exceptions.Exceptions03.main(Exceptions03.java:14)*/
	 
 }System.out.println("kod bloke olmamis");//kod bloke olmamis
	}

}
