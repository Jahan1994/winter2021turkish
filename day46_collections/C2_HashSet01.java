package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C2_HashSet01 {

	public static void main(String[] args) {
		   // Verilen bir Array'deki tekrarli elemanlari silip
        // unique elemanlardan olusan bir Array'e ceviren 
        // bir method yaziniz
        
        int arr[]= {2,3,4,3,5,3,6,4,7,4,8,5};
        
        int tekrarsizArray[] = tekrarlariSil(arr);
        
        System.out.println("Main method icinde array olarak : " + Arrays.toString(tekrarsizArray));
        
    }
    public static int[] tekrarlariSil(int[] arr) {
        
        Set<Integer> set1 = new HashSet<>();   //set olusturduk
                                                    
        for (Integer each : arr) {          //arraydeki her bir elementi set e ekleyerek tekararlardan kurtulduk
            set1.add(each);
        }
        
        System.out.println("Set olarak method icinde : " + set1); // [2, 3, 4, 5, 6, 7, 8]
        
        int tekrarsizArray[] = new int[set1.size()]; //seti in size in alip bu buyuklukde bir array olusturduk
        
        int index=0;                  //setdeki elementleri arraye ekledik.
                                    // array indexe ihtiyac duyudugu icin int index=0 local varible olusturduk
        for (int each : set1) {
            tekrarsizArray[index]=each;
            index++;
        }
        
        return tekrarsizArray;
    }
}