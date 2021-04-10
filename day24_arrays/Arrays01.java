package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		int sayi=10;
		int sayi2=20;
		int sayi3=30;
		String isim="Ali";
		
		//javada birden fazla elementin koyabilecegimiz(store)obeler vardir
		//bu gun bunlardn ilkini oyrenecez
		
		int arr[]= {10,20,30};//int[] arr sekilinde de kullanila bilir
		                      //bu ornekde arrayin elementlerini direk yazdigim icin uzunlik belirtmeye ihtiyac kalmadi
		                     //bu kullanimda max element sayisi(length) yazdigimiz element sayisidir
		System.out.println(arr);//array nir objedir
		                     //eger direk olarak arrayi yazidrmak isterseniz java referansi yazidirir
		
		System.out.println(Arrays.toString(arr));//[10,20,30]
		
		String takim[]=new String[5];//[null,null,null,null,null]
		System.out.println(Arrays.toString(takim));
		 takim[0]="Ali";
		 System.out.println(Arrays.toString(takim));//[Ali.null,null]
		 takim[2]="Hasan";
		 takim[1]="veli";
		 System.out.println(Arrays.toString(takim));//[Ali,Veli,Hasan]
		 takim[3]="mehmet";//java run time programdir dolaysiyal array programi calistirilnca olusturulur
		                 //31ci setrde syntax olarak hata olmadiginda CTE olmaz
		               //program calistiginda 3cu index olmadigi icin RTE verir
		 //Arraydaki bir elementi update (guncellemek) etme
		 //velinin yerine kemal gelsin
		 takim[1]="Kemal";
		 System.out.println(Arrays.toString(takim));//[Ali,Kemal,Hasan]
		 //bir arrayin uzulugunu nasil bula biliriz
		 System.out.println(takim.length);//3
		                                //stringdeki length() idi arrayda length
		 
		 //Array deki son elementi Mehmet yapin
		 takim[takim.length-1]="Mehmet";
		 System.out.println(Arrays.toString(takim));
  		 //eger arrayin element sayisi tek ise ortadaki elemani can yapalim
		 //a b c d e//x+1/2 matamatikde
		 //0 1 2 3 4 //x-1/2(index 0dan basladigi ucun) javada bele olur
		 if(takim.length%2==1) {
			int ortaIndex=(takim.length-1)/2;
			takim[ortaIndex]="Can";//[Ali,Can,Hasan]
			
			
		 }System.out.println(Arrays.toString(takim));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
