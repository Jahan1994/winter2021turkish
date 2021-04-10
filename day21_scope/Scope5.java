package day21_scope;

public class Scope5 {
int num1;
String name="Ali";
	public static void main(String[] args) {
add();
//product(5);//static olmayan method static olan main method icerisinden cagiralamaz

	}
public static void add() {
	//num1++;//static olmayan num1(instance) static bir method icinde kullanilamaz
	
	int num2=6;
	char letter;
	System.out.println("Do addition");
}
public void product(int num3) {
	name="Veli";
	//num2++; //num2 ustedki methodada olusturulmus local bir variable dir.
	System.out.println(num3*num3);
}
}