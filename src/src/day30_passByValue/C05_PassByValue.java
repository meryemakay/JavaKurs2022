package src.day30_passByValue;

public class C05_PassByValue {

    //kalıcı ındırım ıcın ıkıncı yontem

    public static void main(String[] args) {
        double etiketFiyati=100;
        double indirimYüzdesi=10;

  etiketFiyati= kaliciIndirimYap(etiketFiyati, indirimYüzdesi);
      System.out.println("main method da ındıırm sonrası etıket fıyatı:"+ etiketFiyati);
    }

        public static double kaliciIndirimYap(double etiketFiyati, double indirimYüzdesi) {
            etiketFiyati = etiketFiyati * (100 - indirimYüzdesi) / 100;
            System.out.println("indirimli fiyat:" + etiketFiyati);
        return etiketFiyati;
    }
}
