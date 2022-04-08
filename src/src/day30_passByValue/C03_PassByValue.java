package src.day30_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        /*
        java pass by value bır programlama dılıdır
        yanı  bır prımıtıve varıable yı argument olarak bır methoda yollarsanız
        java o varıable yı dgıl degerını yanı value yı methoda yollar buna da pass dıyoruz
         */
        double etiketFiyati = 100;
        yuzdeOnIndırımYap(etiketFiyati);
        yuzdeOnIndırımYap(etiketFiyati);
        yuzdeOnIndırımYap(etiketFiyati);

        System.out.println("ıkı ındırımden sonra maın method da etiket fıyatı :" + etiketFiyati);
    }

    public static void yuzdeOnIndırımYap(double etiketFiyati) {

        etiketFiyati = etiketFiyati * 0.90;
        System.out.println("sızın ıcın %10 ındırımlı fıyatımız:" + etiketFiyati);


    }
}
