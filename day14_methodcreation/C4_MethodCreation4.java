package day14_methodcreation;

public class C4_MethodCreation4 {

	public static void main(String[] args) {
		toplama('a', 'b');
	}

	public static void toplama(int num1, int num2) {
		System.out.println("integer method sonucu =" + (num1 + num2));

	}

	public static void toplama(double num1, double num2) {
		System.out.println("double  method sonucu =" + (num1 + num2));

	}

	public static void toplama(int num1, double num2) {
		System.out.println("integer/double method sonucu =" + (num1 + num2));

	}

	public static void toplama(char char1, char char2) {
		System.out.println("char method sonucu =" + (char1 + char2));
	}

	public static void toplama(String str1, String str2) {
		System.out.println("string method sonucu =" + (str1 + str2));
	}
}