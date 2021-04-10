package day23_statickeyword;

public class Static1 {

	static String isim="Mehmet";
	int yas=49;
	public static void main(String[] args) {
		//static variable lar olusturulan tum objeler icin gecerlidir(okul adi gibi)
		//mesala bir classdan bir instance birde static variable olsun
		Static1 st1=new Static1();
		Static1 st2=new Static1();
		Static1 st3=new Static1();
		st1.isim="Hasan";
		st1.yas=25;
		System.out.println(st1.isim+ " "+ st1.yas);//hasan 25

		st2.isim="Ayse";
		st2.yas=30;
		System.out.println(st2.isim+ " "+ st2.yas);//ayse 30
		System.out.println(st1.isim+ " "+ st1.yas);//ayse 25
		
		st3.isim="Ali Can";
		st3.yas=40;
		System.out.println(st3.isim+ " "+ st3.yas);//ali can 40
		System.out.println(st2.isim+ " "+ st2.yas);//ali can 30
		System.out.println(st1.isim+ " "+ st1.yas);//ali can 25
		
	}

}
