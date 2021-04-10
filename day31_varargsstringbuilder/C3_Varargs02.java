package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		//istedigimiz kadar sayi girdigimizde tum sayilari toplayan bir method yazalim
		//var-variety (cesitlilik)args-argumunet
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(3,54,3,2,1,1,4);
		

	}

	public static void toplama(int... var) {//data turunden sonra yazdigimiz 3 ... varargs kullanacagimiz anlamini geliyor
		int toplam=0;
	for(int each:var) {
		toplam+=each;
		
	}System.out.println("toplam:"+toplam);
		
	}

}
