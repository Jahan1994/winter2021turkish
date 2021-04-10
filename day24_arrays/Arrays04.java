package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		//kullanicidan deger alarak int bir array olusturun
		//once kullanicidan sayi ededini almamiz lazim ki arrayi olusturualimn
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen kac sayidan ibaret bir array istediyinizi yaziniz");
		 int uzunluk=scan.nextInt();
		 int arr[]=new int[uzunluk];//5
		 System.out.println("lutfen sayilari giriniz");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=scan.nextInt();
			 
		 }
		 
System.out.println(Arrays.toString(arr));

	}

}
