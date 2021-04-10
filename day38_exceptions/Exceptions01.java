package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// Kullanicidan 2 tam sayi alin ve bolumlerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bolunecek sayiyi girin");
		int num1=scan.nextInt();
		System.out.println("lutfen kaca bolmek istediyinizi yazin");
		int num2=scan.nextInt();
		//java exception i handle etmek ici try-catch blogu olusturmus
		try {
			System.out.println("bolme isleminin sonucu:"+num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("sayiyi 0 a bolemezsin");
		}
scan.close();

//0a bolduk exception verdi.

/*ArithmeticException classi Javada matematiksel islemler yapilirken olusabilecek hatalarda kullnilir.mesela 12 i 0a bolersek Java
 * Exception throw eder.bu Exception ArithmeticException kullanilarak halledilebilir(handle).Run Time Exceptiondir.
note:Javada iki tip Exception vardir:birisi siz code yazarken kirmizi alt cizgi(CTE)verir,digeri kirmizi alt cizgi vermez.
Compile Time Error veren Exceptionlara Compile Time Exception ve ya Checked Exception denir.Compile Time Error vermeyen 
Exceptionlara Run Time Exception ve ya Un-checked Exception denir.
Note:Compile Time Exception larda ya throws ve ya try-catch kullanmalisiniz aksi takdirde code calismaz.Ama Run Time Exceptionlarda 
isterseniz throws isterseniz try_catch isterseniz hic bir sey kullanmayabilirsiniz.Yani Compile Time Exception lar handle
edilemelidirler ama Run Time Exceptionlar handele edilmesede olur.
Javada sadece rakamlardan olusan Stringleri sayiya cevire biliriz.Integer wrapper classin icinde parseInt() methodunu kullaniriz.


 */

	}

}
