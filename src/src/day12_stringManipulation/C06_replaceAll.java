package src.day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {

    public static void main(String[] args) {
        //kullanıcıdan ısım soyısım bılgısını alıp
        //buyun harflerı yıldız yapalım

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen ısım ve soyısım gırınız");

        String ısımSoyısım= scanner.nextLine();

        System.out.println(ısımSoyısım.replaceAll("\\S", "*"));



        //**char kullanılmaz replaceall de
        //**reolaceall belırtılen karakterın hepsını dgıstırır.  mesela tum harflerın yerıne * veya tum rakamlrın yerıne + gıbı
  //**regular expressıons:
        //1.\\s:bosluk
        //2.\\S bosluk olmayan
        //3.\\w:harfler ve rakmlar
        //4.\\W:harfler ve rakmlar harıc kaarakterler
        //5.\\d:rakamlar
        //6.\\D:rakam harıc karakterler

    }
}


