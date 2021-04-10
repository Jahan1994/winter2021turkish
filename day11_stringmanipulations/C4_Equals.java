package day11_stringmanipulations;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2 yi karsilastirir ve string olarak esit olup olmaddiklarina bakar
		//sonuc olarak true ve ya false döndürür(return)
		
	//bazi methodlarin yaptiklari islem ile dondurdukleri sonuc farkli ola bilir
		//bir methoda git ali ismindeki elementi sil deriz
		//oda gidip alini bulur ve siler
		
		String str="Ali Can";
		String st2="Ali Can";
		//str ile str2 nin eyni olub olmadigini yazdirin
		System.out.println(str.equals(st2));//true
		System.out.println(str.equals(st2)?"esit":"esit degil");
	} 

}
