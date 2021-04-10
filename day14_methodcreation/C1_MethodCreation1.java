package day14_methodcreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
	String str="Java cok guzel";
	//1)java methodlarin sadece ismine degil,isim+ argumentlere baxar
	//sadece paremtre sayisi degil parametrlerin data tiplerine baxar
	
	str.endsWith("el"); //bu methodun gorevi gidip kelimenin son kismini kontrol etmek 
//bu method u kullanmak icin methodun kontrol etdikden sonra 
	//bana rapor olarak ne getiryini bilmem lazim(TRUE/FALSE)
	
	//2) bir method olusturdugumuzda method un ne yapacagina 
	//ve gorevi yaptikdan sonra bana ne dondurecgine karar vermeliyiz
	//3) bir method olusturuken str.indexOf(String str,int fromIndex) de oldugu kimi disaridan kabul edeceyi parametrleri 
	//ve bu parametrlerin data tiplerin declaration etmeliyik
	
	//methodu calsitirmak istediyimde (methodu cagirmaq ucun)parametre olarak declare edilen data tiplerine uygun
	//deyerler girmeliyiz.ve gireln deyerlere ARGUMENT denir()
	
	str.indexOf("va", 1);//
	
	System.out.println(str.indexOf('a'));
	System.out.println(str.indexOf("ava"));
	System.out.println(str.endsWith("a"));
	System.out.println(str.startsWith("c", 5));
	System.out.println(str.indexOf("va", 1));
	}

}
