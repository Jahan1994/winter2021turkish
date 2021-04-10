package day24_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		/*Verilen 3 elemanli
		 *  bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
		 *   Ornek; array [1,2, 3] ise output [2, 3, 1] olacak
		 */

		int arr[]= {1,2,3,4,5,6};
		int temp=arr[0];
		 for(int i=0;i<arr.length-1;i++) {//int=1;i<arr.length;i++/arr[i] olursa ayni sonuc elde ederiz
			 arr[i]=arr[i+1];             ///degiscek olan sol tarrfdaki
			 
		 }
		 arr[arr.length-1]=temp;
		 System.out.println(Arrays.toString(arr));
		 /*
		  * arr[0]=arr[1]
		  * arr[1]=arr[2]
		  * arr[2]=arr[3]
		  * arr[3]=arr[4]
		  * arr[4]=arr[0]
		  */

}
}