package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
	//verilen bir arrayda bir elementin olmagini nasil kontrol ederiz
		int arr[]= {10,25,3,16,75};
		int sayi=25;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==sayi) {
				flag=true;
			}
		}if(flag) {
			System.out.println("array sorulan elementi iceririr");
		}else {
			System.out.println("array sorulan elementi icermir");
		}
	//arrays classindan method kullanarak yapalim
	//ilk once siralam yapalim
	
Arrays.sort(arr);//ilk once sirlama yapalim [3,10,16,25,75]

System.out.println(Arrays.binarySearch(arr, 25));//sonuc olarak aranan sayinin indexini doner
System.out.println(Arrays.binarySearch(arr, 10));//1
System.out.println(Arrays.binarySearch(arr, 28));//-5
System.out.println(Arrays.binarySearch(arr, 5));//-2
//binary search sonuc olarak aradigimiz element varsa indexini veririr,aradigimiz element yoksa olsaydyi kacinci element olacagini donudururdu -ile

int arr2[]= {12,15,25,14,3,12,65};
Arrays.sort(arr2);//[3,12,12,14,15,25,65]
System.out.println(Arrays.binarySearch(arr, 14));//3
System.out.println(Arrays.binarySearch(arr, 2));//-1
//array nasil stringe cevrilir

String arrayString=Arrays.toString(arr2);
System.out.println(arrayString);
System.out.println(arrayString.substring(5));//basdaki duz morterizede daxil butun arrayi stringe cevirir



}
}