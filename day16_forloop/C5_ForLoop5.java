package day16_forloop;

import java.util.Scanner;

public class C5_ForLoop5 {

	public static void main(String[] args) {
		/* Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
          1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 100den kicik tam bir  sayi girin");
		int num=scan.nextInt();
	for(int i=1;i<=num;i++) {


		if(num%15==0) {
			System.out.println("java guzeldir");
				}else if(num%5==0) {
					System.out.println("guzeldir");
			}else if(num%3==0) {
				System.out.println("java");
			}else {
				
			}System.out.println(i);
			scan.close();
}

	}

}
