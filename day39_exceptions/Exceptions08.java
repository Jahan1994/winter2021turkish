package day39_exceptions;

import java.util.Scanner;

public class Exceptions08 {

	public static void main(String[] args) {
		  /*
        
        Kullanicidan carpma yapmak icin bir String isteyin. 
        Kullanicinin girdigi String sadece sayilardan olusuyorsa 
        sayiyi 2 ile carpip sonucu yazdirin.
       Kullanici sayilardan olusmayan bir String girerse 
       “Girdiginiz String sayiya cevrilemez” yazdirin.
        */
       
       Scanner scan=new Scanner(System.in);
       System.out.println("Lutfen 2 ile carpmak icin bir String girin");
       String str=scan.nextLine();
       try {
       System.out.println(2*Integer.parseInt(str));
       } catch(NumberFormatException e) {
           System.out.println("Girdiginiz String sayiya cevrilemez");
       }
   }
	
	/*ClassCastException classi bir-birine donusturlumeyen data type lar bir-birine donuturulmek istenirse devreye girer.
	 * Misalcun..Object data typei String data type a cevrile bilmez.Javaya illa donustur diye israr edersek ClassCastException
	 * aliriz.
	 */
	}


