package day11_stringmanipulations;

public class C1_StringManipulations_Concatenation {

	public static void main(String[] args) {
		// 
System.out.println(15+20+"Merhaba");//35merhaba
System.out.println("Merhaba"+15+20);
System.out.println("Merhaba"+(15+20));
String str1="Hello";
String str2="World";
System.out.println(str1+""+str2);
//str1.concat(str2) str1 in sonuna str2 i ekler
System.out.println(str1.concat(" ").concat(str2));
System.out.println(str1.concat(" "+str2));
// str1.concat(str2) methodu str1 in sonuna str2i ekler

	}

}
