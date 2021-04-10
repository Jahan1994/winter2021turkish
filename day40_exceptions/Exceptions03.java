package day40_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		  
        int arr[]= {1,4,7,8};
        
        try {
        System.out.println(arr[2]);
        
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } 
        finally {
            System.out.println("ne olursa olsun bu satir yazilsin");
        }
        
        System.out.println("kod bloke olmamis");
        
        // Finally blocku try-catch blogu ile veya sadece try blogu ile calisabilir.
        // Finnally blogu catch ile ongordugum bir sorun oldugunda calistigi gibi
        // ongoremedigim bir exception olustugunda da calisir....
        
        
/*Finally block cloud da yapilan islemlerden sonra cloud ile connection i kesmek icin kullanilir.Cloud ile connection yazdigimiz 
 * code basarili bir sekilde calisirsa isimiz bitigi icin kesilmelidir.Yazdigimiz code exception atarsa cloud ile connection yine 
 * kesilmeli ve code tamir edilmelidir.Cloud ile connection kesilmezse fatura bahali ola bilir(saniye basina pul yazlr saygac kimi)
 */
    }
}