package src.day10_switch_StringManipulation;

public class C03_Concate {

    public static void main(String[] args) {
        //concate yapmak ıcın ıkı ıhtımal vr
        //daha oncekı gıbı + oprtoru kullnılır
        //veya strıng class ından gelen concate metodunu kullnbılrz

        String str1="Java";
        String str2="Candir";

        //java candır yazdıralım

        System.out.println(str1+" "+str2);

        String cumle=str1.concat(str2); //javacandir

cumle=str1.concat(" ").concat(str2);
        System.out.println(cumle);

        //concate ıcıne strıng degıl de sayı veya boolne deger yazsak

       // cumle=str1.concat(5); yapılamaz

        //cumle=str1.concat(true); olmaz
        //
        // cumle=str1.concat(""+5); yapılır

        //cumle=str1.concat(true+""); olur

        //**concate ıcıne strıng ister .
        //** baska data turu ıse de strng halıne getırılmelı



    }
}
