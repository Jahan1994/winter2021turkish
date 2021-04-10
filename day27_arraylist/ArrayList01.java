package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
list.add("Ali");
list.add("Can");
list.add("Ayse");
list.add("Fatma");
System.out.println(list);//[Ali, Can, Ayse, Fatma]
System.out.println(list.size());//4

System.out.println(list.remove(1));//indexi 1 olan Cani silib sildiyi elemani bana dondureck Can
System.out.println(list);//[Ali, Ayse, Fatma]


System.out.println(list.remove("Ayse"));//Ayseyi silecek ve bize true dondureck
System.out.println(list);//[Ali, Fatma]

System.out.println(list.remove("Mehmet"));//mehmeti tapmadigina gore false doner
System.out.println(list);//[Ali, Fatma]

list.add("Ayse");
System.out.println(list);//[Ali, Fatma, Ayse]

 list.remove(1);//[Ali]
 list.remove("Ali");//[]
 System.out.println(list);
 

	}

}
