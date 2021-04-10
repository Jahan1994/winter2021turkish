package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		// javada saat ile islem yapmak icin LocalTime classindan obje kullaniriz
		
		LocalTime saat=LocalTime.now();
		
System.out.println(saat);//15:38:18.231304800
for (int i=0;i<1000000;i++) {
	i++;
	
}LocalTime saat2=LocalTime.now();
System.out.println(saat2);
System.out.println(saat);
System.out.println(saat.plusHours(15));
System.out.println(saat.getSecond());//25
System.out.println(saat.minusSeconds(12434));
System.out.println(saat.now(ZoneId.of("America/Chicago")));
System.out.println(saat.now(ZoneId.of("Japan")));
System.out.println(saat.now(ZoneId.of("Turkey")));
	}

}
