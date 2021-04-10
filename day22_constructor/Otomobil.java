package day22_constructor;

public class Otomobil {
	 public Otomobil(String renk){//isterek constructoru paramterli olarak olusturabiliriz
		
		
	}
	 //biz bir constructor olusturdgumuzda java default olani yok eder
	 //dolayislyla biz bir const olusturdugumuzda mutlaka 
	 //default const in yerinede bir const yazmaliyiz
	 
	 public Otomobil() {//default const in yerine bunu yazmaliyiz
		 
	 }
	 
	 //onemli not:Default cons-dan baska bir const yazdigimizda Java default olani yok etdiyi icin
	 //mutlaka biz default yerinede cons yazmaliyiz

	String marka;
	String model;
	int yil;
	boolean kazasiVarmi;
	

	public void yakit(String yakit) {//method
		System.out.println("Araba yakit olarak"+yakit+ "kullanir");
		
	}
	public void vites(String vites) {//method
		System.out.println("Araba"+vites+ "viteslidir");
	}
		
}