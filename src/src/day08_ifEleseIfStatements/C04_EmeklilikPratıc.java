package src.day08_ifEleseIfStatements;

import java.util.Scanner;

public class C04_EmeklilikPratıc {
    public static void main(String[] args) {
        //eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

       /* Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz " +
                "\nKadin icin K \nErkek icin E harfini giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yazsinizi giriniz");
        double yas=scan.nextDouble();
        if (cinsiyet=='K'){
            if (yas<0 || yas>120){
                System.out.println("lutfen girdiginiz yas degerini kontrol edin");
            } else if(yas<60){
                System.out.println("emekli olamazsin \nDaha "+ (60-yas) + " yil calisman gerekir");
            } else{
                System.out.println("emekli olabilirsin");
            }
        } else if(cinsiyet=='E'){
            if (yas<0 || yas>120){
                System.out.println("lutfen girdiginiz yas degerini kontrol edin");
            } else if(yas<65){
                System.out.println("emekli olamazsin \nDaha "+ (65-yas) + " yil calisman gerekir");
            } else{
                System.out.println("emekli olabilirsin");
            }
        } else{
            System.out.println("Lutfen Cinsiyet icin gecerli bir Harf giriniz");
        }
    }
}
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cınsıyetınızı yazınız " +
                "\nkadın için K ,\n erkek için E harfını gırınız");

        char cinsiyet = scan.next().toLowerCase().charAt(0);

        System.out.println("lutfen yasınızı gırınız");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {

            if (yas < 0 || yas > 120) {
                System.out.println("lutfen gırıdıgınız yas degerını kontrol edın");

            } else if (yas < 60) {
                System.out.println("emeklı olamazsınız \ndaha" + (60 - yas) + " yıl calısman gereklı");

            } else {
                System.out.println("emeklı olabılırsın");
            }


            if (cinsiyet == 'E') {
                if (yas < 0 || yas > 120) {
                    System.out.println("lutfen girdiginiz yas degerini kontrol edin");
                } else if (yas < 65) {
                    System.out.println("emekli olamazsin \nDaha " + (65 - yas) + " yil calisman gerekir");
                } else {
                    System.out.println("emekli olabilirsin");
                }
            } else {
                System.out.println("Lutfen Cinsiyet icin gecerli bir Harf giriniz");


            }
        }
    }
}