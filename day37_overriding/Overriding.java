package day37_overriding;

public class Overriding {
	/*
     *  Overriding Kurallari
     * 1) Method Signature ayni olmak zorundadir.
     * 2) Child class’daki method’un (overriding method) Access Modifier’i parent class’daki method’un (overridden) modifier’indan daha dar olamaz. 
     * Ornek olarak Parent'da public iken Child'da default olamaz. Esit ya da daha genis olmalidir. public > protected > default > private
     * 3) Overriding method covariant return type kullanmalidir.
     * 4) private, static and final method’lar overriding yapilamazlar.
     * Not : Return Type aciklamasi ; (Cok onemli degil ama okumus olun) (Slaytta 337. sayfada aciklamali resmi var)
     * overridden method'un return type'i primitive veya void ise 
     * overriding method'un return type'i da ayni olmali.
     * 
     * eger return type primitive degilse (overriding method'un return type'i) IS-A (overridden method'un return type'i) olmalidir. 
     * 
     * Eger variable'a ulasmak istersek Data Type'a bakiyoruz fakat Method'a gidiyorsak Constructor'a bakariz. (Override durumlari icin hatirlatma
     * 
     * Bu ikisini sonra gorecegiz
     * 5) Child class’daki method (overriding method), parent class’daki method’un (overridden method) compile time
     * edip etmedigine bakmaksizin compile time exception throw edebilir. Fakat child class’daki method (overriding method), parent class’daki
     * method’dan (overridden method) daha bir run time exception throw edemez.
     * 6) Eger abstract olmayan bir class abstract class’a extend ediyorsa veya bir 
     * interface’i implement ediyorsa abstract method’larin tamami override edilmelidir.
     * 
     * Polymorphism nedir ? (Poly = Cok , morphism = Sekilcilik) ****** DIKKAT INTERVIEW SORUSU******
     * Polymorphism = Overloading + Overriding
     * Overriden ve overriding method’larin ikisini de kullanmak istersek child class’da (overriding method) super keyword’unu kullanabiliriz.
     * Poly “cok” morph ise “form”, “bicim” anlamlarini tasir. 
     * Bu ikisinin birlesimiyle olusan “polymorphism” sozcugu “çok bicimlilik” anlamina gelir.
     * Ozetle, olusturulan nesnelerin gerektiginde kiliktan kiliga girip baska bir nesneymis gibi 
     * davranabilmesine polymorphism diyebiliriz. Bunlar program
     * kodlarinin yeniden kullanilabilmesi veya var olan kodun gelistirilebilmesi acisindan cok onemlidir.
     * 
     * Method Overloading bir compile time (static) polymorphism’dir. Method Overloading sayesinde 
     * ayni isme, ayni body’e, farkli parametrelere sahip bir cok method uretip kullanabiliriz.
     * Method Overriding bir run time (dynamic) polymorphism’dir. Method Overriding sayesinde 
     * ayni isme, ayni parametrelere’e, farkli body’e sahip bir cok method uretip kullanabiliriz.
     * 
     * Overloading vs Overriding
     * 1) Overloading’de method signature degisir, Overriding’de degismez.
     * 2) Overloading’de body istenirse degistirilebilir, Overriding’de body %99 degistirilir.
     * 3) final, static ve private methodlar Overload edilebilir, ama Override edilemezler.
     * 4) Overloading Compile Time Polymorphism (static)’dir, Overriding is Run Time Polymorphism’(dynamic)dir.
     * 5) Overloading’de inheritance gerekmez, Overriding’de gerekir.
     * 6) Overloading’de istedigimiz sekilde access modifier ve return type
     * kullanabiliriz ama Overriding’de access modifier ve return type kullanma belli kurallara baglidir.
     * 
     * “Overloading” ve “Overriding”in farki nedir ? 
     * Overloading’de sadece parametreler degisir, overriding’de signature’a dokunulmaz sadece body degisir.
     * “Overriding”in faydasi nedir ? Coklu uygulama, reusability
     */
	
	/*1)parent classdaki bir methodu child classa gore ozellesdirerek kullanmak isterseniz "Overriding" yapabilirsiniz
	 * 2)a)overriding yaparrken method signature (name+parametr) e dokunulmaz
	 * b)overdding yaparken access modifierler belli kuralla gore degitirilebilir
	 * c)overdding yaparken return typelar belli kurallara  gore degitirilebilir
	 * d)overdding yaparken method body degitirilebilir zaten "Overriding"in amaci budur.ama method bodyi degistirmeden 
	 * kullanirsaniz java CTE vermez.ama overriding yaparken method body ni degisdirmemek mantiksizdir.
	 * e)overriding yapabilmek icin parent child relationship sartdir.yani inheritance olmadan overriding olmaz
	 *  f)override edilen method(parent yeni)parentdeaki method dur java o methoda "OVERRIDDEN METHOD" denir.child classdaki method ise
	 *  "OVERRIDING METHOD" olarak adlanir.
	 *  3)overrding methodun basina "@Override" annotation koyarsaniz Java yaptiginiz ovrridigni kontrol eder,herhangi bir yanlislik
	 *  varsa CTE verir.
	 *  4)overrding methodun access modifieri ya Overriding method ile ayni olur yada daha genis olur.
	 *  5)ovveriding methodun return type i overridden method ile ayni olmalidir.
	 *  6)overridden methodun Return type void ise overriding methodun return type i void olmali.
	 *  7)Return type  wrapper class ise overriding methodun Return type  overridden method ile ayni olmalidir
	 *  8)return typelar arasinda parent+child relationship varsa Overriding methodun return type i ya "Overridden Method" ile ayni olmalid
	 *  veya "Overridden Method" un child classi olmali.
	 *  9)static methodlar ovveride edilemez
	 *  10)final methodlar override edilemez.bir method finalsa onun bodysisi en son haldedir.java ya ben bu methdodu degistiremem 
	 *  deyemezsin.
	 *  11)private methodlar override edilemezler
	 *  12)"Plymorphism"  nedir?(cokbicimlilik):Polymorphism "Overloading " ve "Overrding"den olusur.
	 *Overloading ve Overriding arasindaki farklar:
	 *1)overloadingde method signature (name+parametr)degistirili.overridingde method siignature e dokunlmaz.
	 *2)overloadingde method body genllikle degisilmez.overridingde  method body hemen hemen her zaman degistirilir
	 *3)overloadingde  inheritance gerekmez.overridingde inheritance sartdir.
	 *4)overloading Compile Time Polymorphismdir.overriding Run Time Polymorphismdir.
	 *5)private methodlar overloading edile bilirler,ama overriding edilemezler.\
	 *static methodlar overloading edile bilirler,ama overriding edilemezler
	 * final methodlar overloading edile bilirler,ama overriding edilemezler 
	 *  
	 * */
}
