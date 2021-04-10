package day15_methodcreation;

public class C3_Overloading {

	public static void main(String[] args) {
//javada ayni isimle 1den cox method olusturulursa buna overloading denir
		//overloading yapabilmek icin method signature larinin ferqli olmasi gerekir
		//method signature  = isim+parametre sayisi+parametr data tipi
	//bir-birini kapsayan data tipleri oldugundA java en optimal cozumu uretir
		//birebir uyan varsa o methodu calsitirir
		//birebir uyan yoksa en fazla uyani tercih eder
		//eyer kapsayan bir methoda bulamazsa java CTE verir
		
			toplama("Ali", "Veli");
		}

		public static void toplama(int num1, int num2) {
			System.out.println("integer method sonucu =" + (num1 + num2));

		}

		public static void toplama(double num1, double num2) {
			System.out.println("double  method sonucu =" + (num1 + num2));

		}

		public static void toplama(int num1, double num2) {
			System.out.println("integer/double method sonucu =" + (num1 + num2));

		}

		public static void toplama(char char1, char char2) {
			System.out.println("char method sonucu =" + (char1 + char2));
		}

		public static void toplama(String str1, String str2) {
			System.out.println("string method sonucu =" + (str1 +" "+ str2));
		}


	}


