package day09_ternary;

public class C2_ternary2 {

	public static void main(String[] args) {
		int y=1;
		int z=1;
		int a= y <10?y++:z++;
		
System.out.println(y+ ","+z+","+a);
//postincrementde once islem sonra artir y++
//preincrementde once artir sonra islem ++y
//y=2
System.out.println(y++);//3
System.out.println(++y);//4
System.out.println(y);//4
	}

}
