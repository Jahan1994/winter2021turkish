package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.toLowerCase() verilen stringin hamisin kicik herfe cevirir
		//str.toUpperCase() verilen stringin hamisin boyuk herfe cevirir
		String str="Techproeducation";
		//boyuk herfle yazdirsaq
		System.out.println(str.toUpperCase());//TECHPROEDUCATION
		System.out.println(str.toLowerCase());//techproeducation
		//stri boyuk herfe cevirmek istesek
		str=str.toUpperCase();
		System.out.println(str);//TECHPROEDUCATION
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));//techproeducat?on
	}

}
