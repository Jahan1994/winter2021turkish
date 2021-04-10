package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve bir harf isteyin
		//while loop kullanarak cumleden istenen harf kac kec kullanilmis bulunnuz
		//program case sensitive olsun
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle yazin");
		String cumle=scan.nextLine();
		System.out.println("lutfen saymak istediyiniz harfi giriniz");
	String harf=scan.next().substring(0, 1);//string olarak ilk harfi alir
	
		int count=0;
		int index=0;
		while(index<cumle.length()) {
			if(cumle.substring(index, index+1).equals(harf)){
				count++;
				
			}index++;
System.out.println("cumlede " + harf + "harfi" + count + " defa kullanilmis");
scan.close();
		}

	}

}
