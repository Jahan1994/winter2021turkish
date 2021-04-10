package day04_mathmodulus;

public class C1_Mathematics {

	public static void main(String[] args) {
		int num= 38/2*(4+3)*2;
		System.out.println(num);//266
		int num1=8+2*(14-6/2)-12;
		System.out.println(num1);//18
		int num2=10;
		double num3=num*num1/num2;
		System.out.println(num3);// 266*18/10=478.18==>478
		//bu misalda sag terefde deyiskenler int oldugundan netice de int olur
		// sonra deyer verere(assigment)
		double num4=24.56;
		double num5=14.2;
		double num6=num4/num5;
		System.out.println(num6);//1.7295774647887323
		System.out.println(num4/num2);//2.456
		double num7=(double)(num * num1 / num2);
		System.out.println(num7);//478.0 
				
	}

}
