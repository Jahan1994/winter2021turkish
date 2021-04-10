package day12_stringmanipulations;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		// equalsIgroneCase() methodu karsilastirdigi string lere case sensintive(buyuk kucuk harf duyarliligi)
		//olmaksizin bakar.
		//strigler ayni ise true ayni degilse false doner
		
		String str1="Ali Can";
		String str2="ali Can";
		String str3="Ali Can ";
		System.out.println(str1.equals(str2));//false
System.out.println(str1.equalsIgnoreCase(str2));//true
System.out.println(str1.equals(str3));//false
System.out.println(str1.equalsIgnoreCase(str3));//false
	}

}

