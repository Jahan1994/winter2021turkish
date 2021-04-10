package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {
	
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
	//	toplama(list); varargs esnek oldugu icin liste benzesede list degildir
		  
		int arr[]= {15,20,25};
		toplama(arr);//varags array olarak calisir ve argument olarak array yollanila bilir
		
		//kullanicidan deger alarak varags calistirmak istiyorsak girilen degerleri bir array a kaydetmeliyik
		//bunun icin kullaniocidan aldigimiz degerleri esnek olmasi icin bir liste koyariz sonra listi arraye cevirirz
		
		
			}

			public static void toplama(int... var) {
			int toplam=0;
			for(int each:var) {
				toplam+=each;
			}System.out.println(toplam);
				

	}

}
