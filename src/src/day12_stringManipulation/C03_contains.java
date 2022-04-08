package src.day12_stringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        //contains=ıcermek ıcerıyors true ıcermıyırsa false verecek
        //char yazamayz parametre olrk . sadece strıng yazılır


        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin


String email="mulkiyeayboy@tmail.com";
String arananMetin="@gmail.com";



if(!email.contains(arananMetin)){
    System.out.println("lutfen gmail adresını gırınız");
}else if(email.lastIndexOf(arananMetin)==email.length()-10){
    System.out.println("email adresınız kaydedıldı");
}else{
    System.out.println("lutfen yazımı kontrol edın");
}

    }
}
