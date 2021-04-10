package day43_interfaces;

public class Not {
/*1)Interfacelerde concrete methodlar kullanilmaz sadece abstract methodlar kullanilabilir.interface lerde sadece mecbur yapilmasi
 * gerekenleri depolamak icin kullanilir.
 * 2)Java multiple inheritancei destenlenmez ama paranterleri class ise deseteklemez.parentler interface ise java multiple
 * inheritance i destekler.
 * 3)Birden fazla parent class oldugunda farkli parent class larda ayni isimli farkli bodylu methodlarn olmasi mumkundur.Bu tip
 * durumlarda class ayni isimli farkli bodyli methodlardan hangisinin kullanacigina karar vermez.Fakat interface lerde methodlarin 
 * bodyleri olmadigindan ayni isimlimethodlar bir-birinin tamamiyla asynisidir.Bu methodlardan birini override etmek hepsini
 * override etmek manasina gelir.
 * Note:Java parent interface ler icinde ayni method signature sahip ama return type lari farkili methdolar varsa Java
 * interface ler icinde  CTE verir.
 * Java interface ler icindeki tum methodlarin abstract  method olmasi gerektigini bilir.bu yuzden siz method uretirken abstract
 * yazsanizda olur yazmasanizda olur.
 * Interface lerdeki her sey otomotik olarak public dir.bu yuzden access modifier p;arak yazsanizda olur yazmasanizda olur.
 * Normalde access modifier yazmayinca access modiifier default olur ama interfacelerde access modifier her zaman public oldugundan
 * access modifier yazmasaznida public olur.
 * Classlari bir classin parenti yaparken extends kullanilir,interface leri bir classin parenti yaparken implements keyword kullanirlr.
 * Interface interface in parent oldukda extendens keyword kullanilir.bir interfacein parenti class olamaz.
 * Interface deki butun variable lar finaldir.final variable olusturdugunuzda isimleri bold olarak yazilir.
 * Interface lerdeki variable lar static dir.
 * Interface deki tum class memberler publicdir.oyle ise interfacedeki tum variable lar public+static+final dir.
 * Genel kullanim olarak final variable larin isimlerini buyuk harflarler yazilir.
 * Ayni data type li variable lar parent interfacelerde olusturulabilir.ama ayni isimli variable lari object kullanarak cagirirsaniz
 * Java hangisini sececegini karar veremz ve CTE verir.CTE almamak icin ayni isimli variable lar kesinlikle interface isimleri 
 * kullanilarak cagirilmaidir.
 * Zaten interfacelerdeki tum variable satatic oldugundan dogrusu variable lari interface ile cagirmakdir.java staticleri object ile 
 * cagirinca sari alt cizgi verir.
 *Method olusturuken default ve ya static keywordlerini kullanarak isterseniz interface icinde concrete method olusturabilirsiniz.
 * Interface icinde concrete method olusturmak icin kullanilan default keyword access modifier degildir.
 * Default keyword unu kullanrak olusturulan methodlara default method denir.
 * 1)Default keyword kullanmak==>baska classlardan bu methoda ulsamak icin object olusturmalisiniz.
 * 2)Static keyword nu kullanmak==>baska classlardan bu methoda ulasmak icin object olusturmamiza gerek yox sadece interface ismi ile
 * methoda ulasabiliriz.
 * */
}
