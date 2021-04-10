package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
	//karisik sirali verilen bir arrayi sirali olarak yazdirin
		int arr[]= {25,17,6,78,45,69,1};
		
Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	//ayni arrayi buyukden kucuye dogru nasil yazdira biliriz
	//ayni arrayi buyuykden kucuye dogru nasil siralaya biliriz

	for(int i=arr.length-1;i>0;i--) {
		System.out.println(arr[i]+" ");
		
	}System.out.println("");
	System.out.println(Arrays.toString(arr));
	//ayni array i buyukten kucuye dogru nasil siralayabilirz?
	int arrTers[]=new int[arr.length];//ilk array in uz-a esit yeni bir array olusturdum
	for(int i=0;i<arrTers.length;i++) {
		arrTers[i]=arr[arr.length-1-i];
	}System.out.println(Arrays.toString(arrTers));
	
	
}
}