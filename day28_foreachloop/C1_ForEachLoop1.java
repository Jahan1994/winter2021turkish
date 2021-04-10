 package day28_foreachloop;

public class C1_ForEachLoop1 {

	public static void main(String[] args) {
		//bir arrayin tum elemntlerini  for loop ile yazdirlalim
		
		int arr[]= {2,4,6,8,10};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			// for loop yazmamizin esas amaci arryin butun elementlerini loopa getirmek
			//foreach loop daha kolay for yazmamizi saglar
			//each her biri demek.foreach loop istediyim bir toplulukdaki tum elemntleri bir-bir bana getirir
			//for each loop da baslangic degeri yoxdur,bitis degeri de yoxdur,indexde yoxdur
			
			 
		}System.out.println();
		
		for (int each : arr) {
			System.out.print(each+ " ");
			
		}
		
	}

}
