package day12_stringmanipulations;

public class C1_EqualsDoubleEqualsFarki {

	public static void main(String[] args) {
		// 
		
		String str1="Ali Can";
		String str2=str1+ "";//Ali Can
		System.out.println(str1==str2);//false
		//== stringlerin hem deyerlerine hemde adreslerine bakar
		//bu ornekde str1+"" yazdigimizda concatenation yapildigi icin java yeni bir object olusturur ve islemin sonucunu 
		//ve yeni objectin icine koyar
		//str1 ve str2 i == ile karsilastirsak deyerlri ayni fakat adresleru farkli oldugu icin false olur
		
		
		System.out.println(str1.equals(str2));//true
		//equals()methodu sadece stringlerin deyerlerini karsilastiri
		//bu ornekde str1 ile str2 nin deyerleri AYNI oldugu icin true olur
		
		String str3="Ali Can";
		System.out.println(str1==str3);//true 
		System.out.println(str1.equals(str3));//true
		
	}

}
