package src.day11_stringManipulations;

import java.util.Locale;

public class C01_tuLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str = "Java Guzeldir";
String str2= "Meryem";
        //Bız strng methodlrını arka arkaya kullanblrz
        //mesela ıkıncı kelımenın ılk harfını kucuk olark yazdıralım

        //str.charAt(5) boyle yazılınca sonus artık strng dgel char olaacktır
        //dolayısıyla strıngde yapmak ısyedıgımız tum degısşklıklerı yaıp
        //sonra charat metodunu ykullnmalıyız

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr"))); //tr deyınce buyuk i oldu
        System.out.println(str2.toUpperCase());

    }
}
