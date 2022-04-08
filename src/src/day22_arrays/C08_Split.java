package src.day22_arrays;

import java.util.Arrays;

public class C08_Split {
    public static void main(String[] args) {

        //verılen bır cumlede ıstenen harfın kac defa kullanıldıgını yazdırın

        String cumle="Nerede o 'hello world' yazdiramayan ogrenciler";
        String harf="e";

        harfKacKereKullanılmıs(cumle, harf);


    }

    private static void harfKacKereKullanılmıs(String cumle, String harf) {
    int sayac=0;

    String karaketerler[]= cumle.split("");

        System.out.println(Arrays.toString(karaketerler));
        for (int i=0; i<karaketerler.length;i++){

            if (karaketerler[i].equals(harf)){
                sayac++;

            }
        }
        System.out.println("aradıgınız " +harf+ "verılen cumlede"+ sayac +"adet kullanılmıs");

        /*char ıle
        int sayac=0;
        String harfStr=""+harf;
        String karakterler[]=cumle.split("");
        System.out.println(Arrays.toString(karakterler));
        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(harfStr)){
                sayac++;
            }
        }
        System.out.println("Aradiginiz " + harf + " verilen cumlede " + sayac + " adet kullanilmis");
    }

         */






    }
}
