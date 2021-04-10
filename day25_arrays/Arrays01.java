package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		//javada 1den fazla variablae store etmek icin kullanilan objelerden biridir Array
		//Array olusturulrken 2 seyi declare etmeliyiz:1)data type(bir arrayin icersinde sadece ayni data type den elementler ola bilir)
		//2)uzunluk(uzunluk arrayin icerisine kyulacak max element sayisini belirtir ve bundan fazlasini koymayk istersen RTE)

		int arr[]= {10,23,54};//length =3
		String isimler[]=new String[3];//4 olarsa uzunlugu 4 olan bos bir array olsuturur
		
		
		//Array de p ve np data larin referanslari strore edilebilir
		//mesala isimler arrayin icinde isim degerleri degil isimlerin referanslari olur
		
		//arrayin elementlerine ulasmak ve update etme
		 System.out.println(isimler[1]);
		isimler[2]="Cahan";
		isimler[0]="Elveda";
		//arrayin butun elementlerini yazidraq
		System.out.println(Arrays.toString(isimler));
		//method kullnmadan tum elemenleri yazdiraq
		//loop kullanmamiz lazim
		
		for(int i=0;i<isimler.length;i++) {
		
			System.out.println(isimler[i] + " ");
		}System.out.println();
		System.out.println(arr);//referns
		System.out.println(Arrays.toString(arr));
	

		
		//arrayin elelemntlerini siralaya biliriz
		isimler[1]="Maria";
		Arrays.sort(isimler);;
		System.out.println(Arrays.toString(isimler));
}
}
