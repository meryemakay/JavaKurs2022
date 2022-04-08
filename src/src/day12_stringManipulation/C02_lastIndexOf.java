package src.day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        // Girilen kelime cumlede kullanilmamis.
        //       - Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.


        String cumle = "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime = "yeni";

        int ilkKullanım = cumle.indexOf(kelime); //-1 veya ındex ckar

        int sonKullanım = cumle.lastIndexOf(kelime);

        if (ilkKullanım == (-1)) {
            System.out.println("gırılen kelıme kullanılmmaıs");
        } else if (ilkKullanım == sonKullanım) {


        } else {
            System.out.println("gırılen kelıme 1 den fazla kullnılmıs");
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf('p',4)); //4 dahıl

        //**ındexof verılen strng de ıstenen karakterın kullnıldıgı som ındex ı döndürür. ('')("") seklınde yzılmalı
    }
}