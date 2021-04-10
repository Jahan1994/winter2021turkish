package day06_ifstatements;

public class C1_IfStatement1 {

	public static void main(String[] args) {
		int a=10;
		int b=8;
		if (a>b) {
			System.out.println("ilk eded boyukdur");
			
		}
if (a*b<0) {
	System.out.println("edelerin hasili negativ");
}if(a<b || b>0) {
		System.out.println("orlu cumle calsiti");
	}
	
if (a-b>0 && a*b>0) {
System.out.println("and cumlesi calsiti");
}
}
	}
