
package day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		/* Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari 
		 * ve toplam kac tane  olduklarini ekranda yazdirin
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bolenleri bulmak icin postve  bir tam sayi girin");
		int sayi=scan.nextInt();
		int bolen=1;
		int count=0;
		while(bolen<=sayi) {
			if(sayi%bolen==0) {
				
				System.out.println(bolen);
				count++;
			scan.close();}
			bolen++;
		}
		System.out.println(sayi + "sayisinin bolenleri:"+count+ "adetdir");
	
//bolenleri bu sekilde yazdirin
	//1-1
	//2-2
	
	 bolen=1;
	 count=0;
	while(bolen<=sayi) {
		if(sayi%bolen==0) {
			
			
			count++;
			System.out.println(count + "-" +bolen);
		}
		bolen++;
	}
	System.out.println(sayi + "sayisinin bolenleri:"+count+ "adetdir");
}
}
