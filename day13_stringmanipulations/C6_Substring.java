package day13_stringmanipulations;

public class C6_Substring {

	public static void main(String[] args) {
		String str = "Her ders Java gibi olsa";
		// str in ilk 10 harfini * ile gizleyin geriye qalanlari normal yazilsin

		System.out.println(str.substring(10));// 10cu index daxil(inclusive) sonuna qeder tum string
		System.out.println(str.substring(str.length() - 10));// son 10 herfi yazdirin
		System.out.println(str.substring(0, 10));// substring(0,10) yazildiginda 0 inclusiv,10 exclusive

//11ci karakterden sonuna kadar olan stringi yazdiralim
		System.out.println(str.substring(10));
//str in ilk 10 karakteri * ile gizleyin geriye kalanlari normal yazilsin
		System.out.println("**********" + str.substring(10)); // ve ya asagidaki kimi
		System.out.println(str.substring(0, 10).replaceAll("\\D", "*") + str.substring(10));

		System.out.println(str.substring(10, 10));// baslangic indexi olsun der ama bitis indexi olmasin der java son
													// soyleyeni yapr
//System.out.println(str.substring(8, 7));//RTE(run time eror)
		System.out.println(str.substring(22));// length()-1 -> son karakter
		System.out.println(str.substring(23));// length() ->bos
//System.out.println(str.substring(24));//length()den boyuk sayi yazrasak RTE

		String str3 = str.substring(0, 10);// strin ilk 10 harfini aldik
		str3 = str3.replaceAll("\\W", "a");
		System.out.println(str3);
		System.out.println(str3.replaceAll("\\w", "*") + str.substring(10));
		System.out.println(str.substring(7, 9));
		

	}

}
