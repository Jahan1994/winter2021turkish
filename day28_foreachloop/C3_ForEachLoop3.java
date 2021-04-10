package day28_foreachloop;



import java.util.ArrayList;
import java.util.List;
public class C3_ForEachLoop3 {
    public static void main(String[] args) {
        // verilen bir array'deki tum elemanlari bir listeye aktaran bir method yaziniz
        // 
        
        String arr[]= {"Ali","Veli","Ayse","Fatma"};//bir array olustruduk
        
        List<String> list= listeyeCevir(arr);//ben methodu arraya gonderecegim argument olarak array yazmaliyim
        
        
        list.add(0,"Bu is bu kadar");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);//[Bu is bu kadar, Veli, Ayse, Fatma]
        
        
    }
    public static List<String> listeyeCevir(String[] arr) {
        
        List<String> geciciList = new ArrayList<>();
        
        for (String each : arr) {
            
            geciciList.add(each);
        }
        
        
        return geciciList;
    }

	}


