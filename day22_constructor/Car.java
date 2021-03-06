package day22_constructor;

public class Car {

	String marka;
	String model;
	int yil;
	boolean kazasiVarmi;

	public static void main(String[] args) {

		Car car1 = new Car();
		
		// 1.bir obje olusturuldugunda esitliyin saginda mutlaka constuctor kullanilir
		// 2.constructor ismi class ismi ile ayni olmalidir
		// 3.constructorda mutlaka parantez olamlidir parametr olmasi isteye baglidir
		
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarmi);
		// null null 0 false
		car1.marka = "Toyota";
		car1.model = "Corolla";
		car1.yil = 2010;
		car1.kazasiVarmi = false;
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarmi);// Toyoto Corolla
																									// 2010false

		Car car2 = new Car();
		car2.marka = "Opel";
		car2.model = "Astra";
		car2.yil = 2015;
		car2.kazasiVarmi = true;
		System.out.println(car2.marka + " " + car2.model + " " + car2.yil + " " + car2.kazasiVarmi);// opel astra 2015
																									// true

		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarmi);// Toyota Corolla
																									// 2010 false
car1.kazasiVarmi=true;//car1 e ait her hangi bir ozelligi degistirebiliriz
System.out.println(car1.marka+" "+ car1.model+ " " + car1.yil+ " "+ car1.kazasiVarmi);//Toyoto Corolla 2010 true



	}

}
