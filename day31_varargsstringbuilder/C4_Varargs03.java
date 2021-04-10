package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {
		//verilen int lardan ilki haric tum sayilari toplayin ve buldugunuz toplam ilke ilk sayiyi carpip sonucu yazin
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(3,54,3,2,1,1,4);
		

	}

	public static void toplama(int sayi,int... var) {//data turunden sonra yazdigimiz 3 ... varargs kullanacagimiz anlamini geliyor
	int toplam=0;
	for(int each:var) {
		toplam+=each;
	}System.out.println(toplam*sayi);
		
	}

	}


