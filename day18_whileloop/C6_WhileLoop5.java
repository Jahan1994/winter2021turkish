package day18_whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
	/*verilen sayinin asal olub olmadigini bulan bir program yaz
	 * asal sayi bire ve ozune bolunenler
	 * 
	 */
int sayi=50;
String flag="Asal";//flag  bizim istediyimiz sartin gerceklesib gerceklesmediyini kontrol eder
int bolen=2;
while(bolen<sayi) {
	if(sayi%bolen==0) {
		flag="Asal sayi degil";
		
		
	}
	bolen++;
}System.out.println(flag);
	}

}
