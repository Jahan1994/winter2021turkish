package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C5_forEachLoop5 {

	public static void main(String[] args) {
		// bir integr list olusturun bu listedki tum sayilarin  karelrinin toplamini 
		//foreach loop kullanark bulunuz sonucu ekranan yazdiri
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(3);
		list.add(8);
		System.out.println(list);//[10,5,3,8]
		int karelerinToplami=0;
		for(Integer each:list) {
			karelerinToplami+=each*each;
			
		}System.out.println(karelerinToplami);

	}

}
