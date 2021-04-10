package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		/*1)ic ice array olusturdugumuzda disardaki ana array a outer array,icerdeki kucuk arraylere ise inner array denir
		 * 2)eger icerdeki arraylerin boyutlari bir-birinden farkli ise arrayin butun elementleri yazarak declare ede biliriz
		 * 3)multi dimensional arrayda bir elementin indexi ucun en disdaki array haric elemnete qeder ic ice olan butun arraylerin]
		 * indexlerini yazmaak gererkir
		 */
		int arr[][]= {{1,3,5},{3,5},{5,9,11,3}};//2 katli arraydir
		//11i index ile ifade etmek istersek arr[2][2] 

		//eger arrayi uzunlukla declare etmek istersek inner array uzunluklari esit olmali
		
		int arr2[][]=new int [3][2];
		//[3] ilk yazilan sayi outer arrayin icinde kac tane inner array oldugunu belirtir
		//[2] her bir inner arrayin uzunlugu
		
		System.out.println(Arrays.toString(arr2));
		
		//multidismensional arrayleri yazdirmak icin tostring methodu kullanilm,az
		//cunku tostring methodu outer arrayi stringe cevirir
		//outer arrayin icinde inner arrayler oldugundan tostring methodunda inner arraylerin referans degerleri yazdirilir
		
		System.out.println(Arrays.deepToString(arr2));
		
		
	}

}
