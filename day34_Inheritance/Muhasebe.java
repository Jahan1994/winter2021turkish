package day34_Inheritance;

public class Muhasebe extends Personel {
//muhasebe classinin personal classinin child classi oldugunu declare etmek icin class ismine keyword ile parent classi yazariz
	
	  // Muhasebe class'inin personel class'inin child class'i oldugunu 
    // declare etmek icin class ismine extends keyword ile
    // parent class'i yazariz
    
    public int saatUcreti;
    public String statu;
    public int maas;
    
    public int maasHesapla() {
        
        maas=30*8*saatUcreti;
        
        return maas;
	}

}
