package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
//ben farkli classlardanda Scope1 clasina object olusturarark ulasabilirim
		
		Scope1 obj4=new Scope1();
		System.out.println(obj4.isim);
		System.out.println(obj4.soyIsim);
		
		
		 obj4.soyIsim="Can";
		 obj4.isim="Ahmet";
		 System.out.println(obj4.isim + " "+ obj4.soyIsim);
		
	}

}
