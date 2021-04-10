
package day15_methodcreation;

public class C4_ForLoop {

	public static void main(String[] args) {
		// 5 defa Hello World yazdiraq
		/*
		System.out.println("hello World");//1
		System.out.println("hello World");
		System.out.println("hello World");
		System.out.println("hello World");
		System.out.println("hello World");
*/
		//bunun yerine loop kullaniyoruz 
		//ne yapacagimizi javaya deyirik necedefe etmesini de deyirik
		
		//butun looplarda 3 seyi yazmaliyiq
		//1)baslangiz deyer
		//2)bitis deyeri
		//3)artis deyeri
		
		
		
		for(int i=10;i>=1;i--) {
			System.out.println(i+  "hello World");
			
		}
		//not:eger sart kismi bizim artisimiza gore hep true verirse loop sonsuzluga qeder gider
		//loopda artis deyeri positi oldugu kimi negative de ola bilir
		//artis degeri 1 olmak zorunda deyil farklida ola bilir
		//eger loopun sarti hir true olmazsa loop body si hic deveye girmez
	}

}
