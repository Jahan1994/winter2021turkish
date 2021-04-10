package day21_scope;



public class Scope2 {

	public static void main(String[] args) {
		
	//static variable lar icin obje olusturma ihtiyaci yokdur
		//baska bir classdan static varibale(method)lara ulasmak istedigimizde ulasmak istedigimiz
		//Class in adi . static variable adi yazmamiz yeterlidir
		
		System.out.println(Scope1.okulAdi);//yildiz koleji
		System.out.println(Scope1.okulId);//java RUn Time programdir//1201
                                        //Scope2 classi calistirildiginda Scope1 calismmaz
		                              ///dolasyisila en basta olusturulan ve ya atanan degerler gecerli olir
		Scope1.okulAdi="Mehmet Koleji";
		System.out.println(Scope1.okulAdi);//Mehmet Koleji
		
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);
		System.out.println(Scope1.okulAdi);
		
	}

	
	
}
