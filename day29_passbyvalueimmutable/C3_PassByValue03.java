package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {



	public static void main(String[] args) {
		/*
		 * Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method olusturup
		 * list elemanlarini artirmayi deneyelim - 1. Method’da elemanlari for each loop
		 * kullanarak artirin - 2. Method’da elemanlari set method’u kullanarak artirin
		 * - Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini
		 * kontrol edelim.
		 */
List<Integer> list=new ArrayList<>();
list.add(10);
list.add(11);
list.add(12);
System.out.println(list);//[10,11,12]
degistirFor(list);
System.out.println("1ci method calldan sonra: "+list);//[10,11,12]
degistirSet(list);
System.out.println("set ile degistirdiyimiz liste main methodun icinde"+list);//[13,14,15]
//java pasbyvalue kullanir ancaq listedki set methodu istisna olarak methodun icinde yapilan degisiikleri kalici hale getirir
// pbv bir method cagirildigi zaman methoda olusan clone value gider
// pbr ise method call yapildiginda methoda orjinal variable gidier
// java pbv'dur bunun istisnasi ile list'deki set methodu istisnadir, method icinde yapilsa bile degisiklikleri kalici olarak yapar.
	}


		
	public static void degistirSet(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			list.set(i, list.get(i)+3);
		}System.out.println("set ile degistirdiyimiz liste methodun icinde"+list);//[13,14,15]
		
	}



	public static void degistirFor(List<Integer> list) {
		
		for (Integer each : list) {//foreach loop ile listeyi guncellemiyoruz sadece her bir elementi tek-tek cagirib +3 yazdirdiq
			each+=3;
			System.out.print(each +" ");
			
		}System.out.println();
		System.out.println(list);//litenin kendisinin degismediyini gorduk [10,11,12]
	}


			
	

}
