package day35_Inheritance;

public class Memur extends Personel {
public int maas;

	public Memur() {
	super();
	//System.out.println("Child class parametrsiz constructor calisti");
}
//Inheritance da constructor olusturdugumuzda javanin otomatik olarak cons a koydugu super() keyword onemlidir.
	//super() keyword default const gibidir.biz gormesekde calisir ancak yerine baska bir keyword yazarsak etkisiz hale gelir
	public Memur(int maas) {
		super();
		
	}
	
	public static void main(String[] args) {
Memur m1=new Memur();

	}


}
