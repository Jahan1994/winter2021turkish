package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

	
		   @SuppressWarnings({ "unused", "resource" })
		    public static void main(String[] args) throws FileNotFoundException, IOException  {
		        
		        FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
		    
		        // try-catch blogu exception ile handle etmekde kullanilir
		        // throws keyword'u ise sadece declaration'dir, dolayisla
		        // throws kullanilan bir method'da exception olusursa KOD BLOKE OLUR
		        int k=0;
		        
		        while((k=fis.read())!=-1) { 
		            System.out.print((char)k);
		        }
		        
		        // Eger birden fazla exception icin throws keyword'u kullanacaksak
		        // yazacagimiz exceptionlarin arasindaki iliski ve siralama onemli olur
		        // eger yazdigimiz exception'lar arasinda parent-child iliskisi varsa 
		        // once child exception yazilmalidir, aksi takdirde child exc. erisilemez olur
		        
		        
		        // Eger yazacaklarimiz arasinda parent-child iliskisi varsa
		        // istersek sadece parent'i yazmamiz da yeterli olur.
		        
		        
		        /*throw ile throws arasindaki farklar nelerdir?
		         * 1)"throws" method parantezinin kapanis parantezi ile method body in acilis parentesi arasinda kullanilir.
		         * "throw" method body nin icinde kullanilir.
		         * 2)"throws" keyword den sonra 1den fazla ecxeption yazila bilir.fakat "throw" keyworden sonra sadece 1 tane 
		         * exception yazila bilir.
		         * 3)"throws" keyword den sonra sadece Exception classinin ismini yazariz fakat "throw" keywordunden sonra
		         * Exception classindan object olustururuz.
		         * 4)"throws"keywordu methodun ilk satirindan sonra sadece 1 kere kullanilabilir ama "throw"keywordu method
		         * bodysin icinde nerede Exception almak istersek orada istedigimiz kadar kullanabiliriz.
		         * 
		         * 
		         */
		    }
		}


