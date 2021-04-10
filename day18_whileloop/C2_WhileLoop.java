package day18_whileloop;

public class C2_WhileLoop {

	public static void main(String[] args) {
//while:iken,oldugu surece
		//10dan 30a kadar olan sayilardan 4 ile bolune bilenleri
		//aralarinda 1 bolsuq olacak sekilde yanyana yazdiri
		
		for(int i=10;i<=30;i++) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
//eynisini while loop ile edek
		int sayi=10;//1ci sert gereceklesdirdik(baslangic deyer)
		while (sayi<=30) {//2ci sert gerecklesdir(bitis)
			if(sayi%4==0) {
				System.out.print(sayi+" ");
			
		
			sayi++;//3cu sert artisi(azalais)deyeri
			
		}
			
		}//while sonu
	}
}
