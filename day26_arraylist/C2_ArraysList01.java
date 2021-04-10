package day26_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C2_ArraysList01 {

	public static void main(String[] args) {
		// bir arraylist nasil olusturulur
		// ArrayList bir objectdir dolaysiyla yeni bir tane olusturmak icin new keyword
		// kullanmaliyiz

		// 1ci yol
		ArrayList<String> list = new ArrayList<String>();

		// 2ci yol

		ArrayList<String> list2 = new ArrayList<>();

		// 3cu yol
		List<String> list3 = new ArrayList<>();
//not:eger constructor olarak List<>() kullanilirsa CTE
		// List<>() constructor olarak kullanilamaz

		// List<String> list4=new List<>();

		// olusturdugumuz Class isimleri Javada kullanilan obje isimleri ile AYNI OLAMAZ

		// List e element ekleme
		// List olustulurken otomotik olarak element ekleme ozelligi yoxdur elementlerin
		// tek-tek eklenmesi gererkir

		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayse");
		// List nasil yazdiririlir
		System.out.println(list3);// [Ali,Veli,Ayse]
		list3.add(1, "Can");// 1ci indexe istenen degeri ekler
		System.out.println(list3);// [Ali, Can, Veli, Ayse]
		list3.add(1, "Fatma");
		System.out.println(list3);// [Ali, Fatma, Can, Veli, Ayse]

		// Verilen bir arraden isten degere esit olan elmentleri kaldirip kalanlari yeni
		// bir array olarak yazdrian bir method yaz
		int arr[] = { 2, 3, 5, 3, 6, 4, 3, 6, 7 };
		int sayi = 3;
		
		List<Integer> istenenList=new ArrayList<>();
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=sayi) {
		istenenList.add(arr[i]);
		
	
}
	
}System.out.println(istenenList);
	}

}
