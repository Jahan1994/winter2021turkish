package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
//verilen bir Arrayi i liste cevirek
		String arr[] = { "Ali", "Veli" };
		List<String> listArr = Arrays.asList(arr);

		System.out.println(listArr);// [Ali,Veli]

		Integer arr1[] = { 1, 2, 3 };
		List<Integer> list2 = Arrays.asList(arr1);

		System.out.println(list2);// [1,2,3]

		// bazen cok fazla bir elementi olan bir liste yaratmamiz gererkir bu durumda
		// liste elementlerini tek-tek eklemek yerine
		// elementleri bir Array e ekler sonrada arrayi liste cevirebiliriz
		// ornek bir web sitesindeki butun urunleri bir listeyee eklemek istediyimizde

		// ancak bu methodla arrydan cevirdiyimiz list esnek olmaz (arrayin ozelliklerin
		// tasir) add(),remove(),clear() gibi
		// uzunlugu ekleyen methodlar kullanilir
		// java bu degisimdeki Array ve Listi senkronize eder birinde yapdigimiz
		// degisiklik otomatik olarak digeriinde update eder

		// arr1 array ve list2 listesi senkron calisir.1de yaptigimiz degisiklik
		// digerinide islenir

		arr1[1] = 5;
		System.out.println(Arrays.toString(arr1));// [1,5,3]
		System.out.println("list2 " + list2);// [1,5,3]

		list2.set(2, 13);
		System.out.println("list2=" + list2);// [1,2,13]
		System.out.println("array:" + Arrays.toString(arr1));// [1,5,13]
	}

}
