package day26_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		//listin uzunlugu nasil bulunur
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		System.out.println(list);//[10, 15, 8, 12, 20]
		
	
			System.out.println(list.size());//5
			
			//bir element listden nece silinir
			list.remove(1);
			System.out.println(list.remove(2));//12 i kaldir dedik bize 12i dondur
			//remove(index) kullandigimzda o indexdeki elementi remove eder ve bunun delili olarak bize o elemnti getirir
			//eger olmayan bir index girirsek RTE verir
			System.out.println(list);//[10, 8, 20]
			
			//System.out.println(list.remove(5));//git 5 i kaldir dedi 5 olmadigi ucun RTE verdi index 5 deyir 
		
			List<String> list2=new ArrayList<>();
			list2.add("Ali");
			System.out.println(list2.remove("Hasan"));//git hasani kaldir dedik false oldu
			System.out.println(list2);//[Ali]
			
			//remove(object) methodu kullanildiginda eger java istenen elemnti bulub bize remove ederse
			//bize true donduru,listede bulamazsa istedigin yerine getirlemediyini anlamamiz icin false dondurur
			 System.out.println(list2.remove("Ali"));//true
			 System.out.println(list2);//[]
			//hamisin silmek istesek
			list.clear();
			System.out.println(list);//[]
			
	}

}
