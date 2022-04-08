package src.day11_stringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C04_lenght {
    public static void main(String[] args) {

        //kullanıcıdn ısmını alıp bas harfını ve son harfını buyuk harflerle yazıdrın

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen ısmınızı yazınız");

        String ısım= scan.nextLine();

        System.out.println("ılk harf : "+ ısım.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf: " +ısım.toUpperCase(Locale.forLanguageTag("tr")).charAt(ısım.length()-3));
        System.out.println(ısım.length());
String str1="";
        System.out.println(str1.length());

        String str2=null;
        System.out.println(str2);

        //null ıle ısaretlenmıs denır , bır deger degıldır o yuzdn uzunlıgu yok
      //  System.out.println(str2.length()); //hata verır
//null poınter deger atamadım ve bunu farkındaym. null bır dfeger degıldır sadece varıble ye d eger atanmdıgının belırtcıdır
//String str3=;    //degr acısından str2 ıle str3 un farkı yok . str2 yı bıldırıyorsun deger atamadım fıye null ıle

       // System.out.println(str3);

        // str3 ile str2'ye deger atanmamistir
        // str2 null pointer ile isaretlendiginden java durumun kontrol altinda oldugu bilir
        // ve geriye kalan kodun calismasina engel olmaz
        // ancak str3' e bir deger atamasi olmayinca java altini kirmizi cizer
        // ve bu durum duzeltilinceye kadar kodun geriye kalaninin calismasinada izin vermez










    }
}
