package day30_datetime;

import java.time.LocalDate;

public class C1_LocalDate01 {

	public static void main(String[] args) {
		//javada sadece tarih kullanmak istiyoruzsak LocalDate classindan bir obje uretiriz
		LocalDate tarih=LocalDate.now();
		System.out.println(tarih);//2021-03-19
		
		System.out.println(tarih.plusWeeks(20));//2021-08-06
		
		System.out.println(tarih.plusDays(500));//2022-08-01
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12));//2024-08-31
		
		System.out.println(tarih.minusMonths(15));//2019-12-19
		
		System.out.println(tarih.getDayOfYear());//78
		System.out.println(tarih.getMonthValue());//3
		System.out.println(tarih.getDayOfWeek());//friday
		
		LocalDate dogumGunu=LocalDate.of(1994, 8, 16);
		System.out.println(dogumGunu.getDayOfWeek());//tuesday
		System.out.println(dogumGunu.getMonthValue());//8
System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(12));//2017-11-07
System.out.println(tarih.isLeapYear());//false artik yil

//eger suanki tarih ile degilde eski bir tairh ile islem yapacaksak LocalDate.of() methodun kullaniyoruz

LocalDate tarih1=LocalDate.of(1995, 12, 15);
LocalDate tarih2=LocalDate.of(1995, 12,10);
System.out.println(tarih1.isAfter(tarih2));//true 
System.out.println(tarih1.isBefore(tarih2));//false
	}

}
