package day14_methodcreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		
		//bir methodu calistirmak icin main methodun icinden cagirmamiz gerekir
		//bir methodu cagirmak icin method adini ve parametrlere uygun argumentleri yazmaliyiz
		  ortalama(85.2,90.3);//method call

	}//main method sonu
//bir method olusturmak istediyimizde Classin icinde ama main methodun disinda bir alanda olusturmaliyiz
	//genel kullanim methodlar main methoddan sonra olur
	
	public static void ortalama(double sayi1,double sayi2) {
		System.out.println("girdiyiniz iki sayinin ortalamasi: "+(sayi1+sayi2)/2);
		//bir methodu olusturmak o methodu calistirmak icin yeterli degil
		//olusturulan method main method icinden cagirilnca calisir
		
	}
	
	
	
	
}//Class sonu
