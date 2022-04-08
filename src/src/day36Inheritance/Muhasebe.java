package src.day36Inheritance;

public class Muhasebe extends Personel {
    //maıne ıhtıyac yok burda olusturmdık
    protected int saatUcreti;
    protected String statu;
    protected int maas;

    protected  int maassHesapla(){
        int maas=saatUcreti*8*30;
        return maas;


    }

}
