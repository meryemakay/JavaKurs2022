package src.day10_switch_StringManipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {

        //strıng te herhngı bır karakterı almak ıstedıgımızde
        //o harfın ındeksını kullanrak
        //str.charAt(ıstenenındex) yazabıblrz

        String str="Java Cok Guzel";
//G yı yazdıralm
        System.out.println(str.charAt(9));

        //j yı yazdırlm
System.out.println(str.charAt(0));

        //va yı yazdırlm

        System.out.println(str.charAt(2)+str.charAt(3));//ascıı yı yzdırır 215


        System.out.println("" + str.charAt(2)+str.charAt(3)); //va

//cOK seklınde yazdırın

        System.out.println( +str.toLowerCase().charAt(5)+
               ""+str.toUpperCase().charAt(6)+
                str.toUpperCase().charAt(7));
//son harfı yazdır

        System.out.println(str.charAt(14-1)); //l  (14)yazsak hata verır ama calısır






    }
}
