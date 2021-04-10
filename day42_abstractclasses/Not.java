package day42_abstractclasses;

public class Not {
/*1)Bazen child classlar parent classdaki methodlarin body lerini hep degistirererk kullanirlar.Bu tip durumlarda parent classdaki
 *  methoda  body koymak manasiz olur cunku parent class daki method body hic kullanilmaz.bu manasizligi gidermek icin 
 *  Java bize body siz method uretme imkani verir.Bodysiz methodlara abastract method denir.
 * 2)parent classdaki bodysiz methodlari(abstract method)child classlar override etmek zorundadilar(alip kullanmak).biz bir
 * application olustururken chil classlari parent classdaki bazi methodlari override etmek zorunda birakmak istersek 
 * o methodlari abstract method yapariz. 
 * 3)abstract method olusturmak icin a)"{}" kismini yazmayin;b)access modifier dan sonra "abstract" keyword kullanin.
 * 4)abstarct methodlar sadece abstract classlar icinde olusturulur.
 * 5)abstarct classs olusturmak icin access modifierdan sonra "abstract" keyword kullanin.
 * 6)abstract keyword u ile method body birararda kullinilmaz.
 * 7)abstract class icinde hem abstact hemde abstract olmayan(concrete)methodlar kullnilabilir.
 * 8)bir concrete class abstract class a extends etdiginde abstract class icindeki tum abstract methodlari override etmek zorundadi
 * aksi takdirde CTE verir.fakat concrete methodlari override etmek zorunda degil nu isteye baglidir.
 * 9)bir abstract class baska bir abstract classa extendes etdiginde her hangi bir methodu override etmek zorunda degil.Isterse eder
 * istemezse etmez.
 * 10)final classlarin child classi olamaz.abstract class lar child classlara talimat vermek icin olusturulurlar.eger bir classi 
 * final yaparsaniz o classin child classi olamayacgindan abstract olmasi mantikli degildir.bu yuzden Java abstract classlarin final
 * olmasina musaade etmez.
 * 11)abstract method uretmeyimizin sebebi child classlarin kullanabilmesidir.eger methodu final yaparsak bu o methodu override
 * edilemez demekdir yani child classlar kullanamaz demekdir.bu celiskiden dolayi Java abstract methodlarin "final"olmasina musaade
 * etmez.
 * 12)Abstract methodlar private olamaz.cunku abstract methodlar baska classlardan kullanilmak icin uretilir.halbuki pravite methodlar
 * baska classlardan kllanilamazlar.
 * 13)abstract classlardan obje uretilemez.
 * 14)abstract methodlar static olamazlar.cunki static methodlar override edilemezler halbuki biz abstract methodlari override etmek
 * icin uretiriiz.
 * 
 * 
 * 
 * 
 */
}
