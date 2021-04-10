package day21_scope;

public class Scope3 {

	public static void main(String[] args) {
int sayi=10;
//1.bir method icinde olusturulan variable sadece o method icinde kullanilabilir
//1.System.out.println(isim);

int sayi2;//2.bir local variable deger atanmadanda olusturulabilir
//2.System.out.println(sayi2);///anca ilk deger atamasi yapilmayan variable lar kullanilamaz
//2.sayi2++;//2ilk deger atanmadigi icin artirma yada azaltma da yapamayiz
//2.java deger atamasi olmadan local variale olusturulmasina izin veriri irelde deger atanacak diye bekler

sayi2=15;//olusturma ayri satrda deger atamasi baska satirda yapilabilir

//3.birden fazla methodun oldugu classlarda her methodda kullanmamiz gereken ortak variable lar varsa
//3.class levelda variable olusturmaliyim
//3.ortak variable classin yapisina bagli olarak instance yada static olabilir


	}

	public static void staticMethod() {
		
		String isim="Hasan";
		//1.System.out.println(sayi); bu kurala main method icerisinde olusturulan variable lar dahildir
	
	}
	
	public void method() {
		boolean isTrue=true;
		//1.System.out.println(sayi); bu kural static olan ve ya olmayan butun methodlar icin gecerlidir
		
	}
}

