package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
	System.out.println(list);//[Ali, Can, Ayse, Fatma]
	//istenen indexdeki elementi bizim istediyimiz kaldirip yerine istediyimizi qoyar
		list.set(2, "Kemal");
System.out.println(list);//[Ali, Can, Kemal, Fatma]

 list.set(0, "Semih");
 System.out.println(list);//[Semih, Can, Kemal, Fatma]
 
 //list.set(4, "Mustafa");//RTE olmayan index ucun
  list.add(2, "Yasin");
  System.out.println(list);//[Semih, Can, Yasin, Kemal, Fatma]
  list.add(5, "Cahan");
  System.out.println(list);//[Semih, Can, Yasin, Kemal, Fatma, Cahan]
  //list.add(10, "Sefer");//ard arda ekler yoxsa RTE verir
  System.out.println(list.contains("Cahan"));//true
  System.out.println(list.contains("Fuad"));//false
 list.contains("Cemal");//bizee boolean bir sonuc veirir liste deyismez yazdirmadigimiza gore
System.out.println(list.contains("Cemal"));//false
 
 //listedki elemnterli siralayaq
 Collections.sort(list);
 System.out.println(list);//[Cahan, Can, Fatma, Kemal, Semih, Yasin]
	}

}
