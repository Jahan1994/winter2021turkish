package day22_constructor;

public class CarUret {

	// su anda bu classda constructor yoktur
	// bir clas olusturuldugunda java bu classdan obje uretlecegini bilir
	// ve gorunmeyen DEFAULT CONSTRUCTOR i class a yerlestirir
	// DEFAULT CONSTRUCTOR parametrsizdir dolassiyla sadece bir ozellgi
	// tanimlanmayan objeler ureit(tisort uret dmek gibidr)
	// DEFAULT CONSTRUCTOR ile uretilen bir objenin tum ozellikleri sonradan
	// tanimlanbmalidir
//eger biz sonradan bir constructor yazarsak Java default constructoru iptal eder
	// bir constructor olusturulaim

	public CarUret() {

	}
	// 1.ismi class ile ayni olmalidir(dolaysiyla buyuk harfla baslar)
	// 2.costructor return type sahip degildir
	// 3.constructir isminden sonra mutlaka parantez olur ama paramatr e olmasi
	// isteye baglidir
	// 4.bir costructor olusturuldugunda kimlerin kullanacagini belirlemek icin
	// acces modifier yaziilir

	String marka;
	String model;
	int yil;
	boolean kazasiVarmi;
	// bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz
	// bu class da olusturulacak objelere aid butun ozellikler olur
	// bu class direk calistirilmayacagi icin main method olmasa da olur
	// (kaliphane gibidir)

	public void yakit(String yakit) {// method
		System.out.println("Araba yakit olarak" + yakit + "kullanir");

	}

	public void vites(String vites) {// method
		System.out.println("Araba" + vites + "viteslidir");
	}
}
