package src.day30_passByValue;

public class C04_PassByValue {

    //eger bır mthod da yapılan degısıklıgın kalıcı olmasını ıstıyordak
    // ıkı yontem kullanabılrz
    //1.varıable yı class level da statıc olarak olusturabılırız


    static double etiketFiyati;
    static double indirimYüzdesi;

    public static void main(String[] args) {
        etiketFiyati = 100;
        indirimYüzdesi = 20;
        kaliciIndirimYap();
    }


    public static void kaliciIndirimYap() {
        etiketFiyati = etiketFiyati * (100 - indirimYüzdesi) / 100;
        System.out.println("indirimli fiyat:" + etiketFiyati);
    }
}
