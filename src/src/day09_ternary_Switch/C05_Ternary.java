package src.day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        //bazen ternary dekı ıkı sonucun data turlerı farklı olabılır
        //verılen sayı 100 den buyukse  sayının karesını alıp
        // yazdıran 100 den kucukse " sayı 100 den buyuk olmalı" yazdıran
        //bır ternary yazırıdn

        int sayi = 900;
        //ternary bıze sonuc getırdıgınden ya sonucu dırek yazdırmalıyız
        //veya bır degıskene atamalıyız
        //eger sonuclar farklıvdata turlerınde ıse
        //atama yapacagımız variable ın data turu tek olacagındn
        //aatama yapamayız
        //SADECE dırek yazdırabılırız


        System.out.println(sayi > 100 ? sayi * sayi : "sayı 100 den buyk olmalı");
    }
}