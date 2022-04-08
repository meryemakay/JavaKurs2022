package src.day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {

        // Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e
       //bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana "5’e bölünen
     //çift sayı" yazdırın. Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
     //Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı pozıtıf bır sayı gırınız");

        int sayi = scan.nextInt();

        if (sayi < 1000 || sayi > 9999) {  //istenmeyen durumu yazıyoruz buraya

            System.out.println("lutfen 4 basamaklı pozıtıf bır sayı gırınız");


        } else if (sayi % 5 == 0) {  // 5 e tam bolunur ve 4 baSAMKALI

            if (sayi % 10 == 0) { //4 basamklı 5 ıle bolunebılen son rakamı 0 olan syı
                System.out.println("5 e bolunen cıft sayı");
            } else { // 4 basaklı 5 ıle bolunen ve son rakamı 0 olmayan tek sayı

                System.out.println("5 e bolunen tek sayı");
            }

        } else {      //4 basamaklı ve 5 e  bolunemıyor
            System.out.println("tekrar deneyın");


        }


    }
}
