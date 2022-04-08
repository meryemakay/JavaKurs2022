package src.day02_variables;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C03_Variables {
    public static void main(String[] args) {
        String ogrenciIsmı="melih";

       String isim, yas,maas ;

        isim="ali";
        yas="20";

        maas="110";

        System.out.println(isim);

        System.out.println(yas);

        char harf2='A';
        String kelıme="merhaba";
        System.out.println(kelıme);

int sayı=40;
        System.out.println(sayı);
         boolean öğrenciMi= true;
        System.out.println( "melih :" + öğrenciMi);

String name="meryem";
String surname="akay";
        System.out.println("isminiz :"  + name);
        System.out.println("soyisim :" + surname);
        int sayı1=10;
        int sayı2=200;
        System.out.println( "iki sayının toplamı :" + (sayı1+sayı2));
        int sayi3= 40;
        double sayi4= 3.3;
        System.out.println( "toplamm:" +(sayi3 + sayi4));

        char karakter ='?';
        System.out.println("girilen karakter:" +karakter);

        int sayı5= 50;
        char harf='?';
        System.out.println(sayı5+harf);

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen üç tam sayı giriniz");
        int sayi6 = scan.nextInt();
        int sayi7= scan.nextInt();
        int sayi8=scan.nextInt();
        System.out.println("girdiğiniz sayıların toplamı:"+ (sayi6+sayi7+sayi8));

        Scanner ali= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String names= ali.next();
        System.out.println("lutfen sayısmınıız gırınız");
        String surnames=ali.next();
        System.out.println("isim - soyisim :" + names + " " + surnames);

    }
}
