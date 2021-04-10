package day16_forloop;


import java.util.Scanner;

public class C1_forLoop1 {

	public static void main(String[] args) {
		// kullanicidan positive 2 tam sayi alin
		// aldigimiz deyerlerden kucuk olandan baslayib boyuk olana qeder
		// butun sayili yanyana (virgulle ayrilara) yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen postive 2 tam sayi girin");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int kicikSayi = 0;
		int boyukSayi = 0;
		if (a < 0 || b < 0) { System.out.println("lutfen positive tam sayi girin");
			boyukSayi = a;
			kicikSayi = b;

		} else {
			boyukSayi = b;
			kicikSayi = a;
		}
		
		
for(int i=kicikSayi;i<=boyukSayi;i++) {

	System.out.print(i+" ,");
	scan.close();
	
	
}
	}

}
