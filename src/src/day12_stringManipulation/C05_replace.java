package src.day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        //bu cumlede bosluk dısındakı karakter sayısını bulun
//replace  bıseyın yerıne baska bısey koyma..       **char ve strng ıcın kullanılır

// atama yapılamadıgı surece orjınal strng kalıcı olarak degısmez
        //sadece o satır ıcın degıslıklık yapılıp sonuc yazdırılmıs olur


  String str = "Bugun ne cok sey ogrendik";

// bu cumledeki bosluk disindaki karakter sayisini bulunuz
System.out.println("space haric karakter sayisi : " +str.replace(" ","").length());

                // atama yapilmadigi surece orjinal String kalici olarak degismez
                // sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur

                System.out.println("orjinal str karakter sayisi : "+str.length());

                // str da kalici degisiklik yapalim
                // bugun yerine yarin
                // ogrendik yerine ogrenecegiz

                str=str.replace("Bugun","Yarin");
                str=str.replace("ogrendik","ogrenecegiz");

                System.out.println("kalici degisiklikten sonra : "+str);

                str.replace("ne cok","ne az");  //bunu sout ıcınde yaparsak degısıklık yazdırılır

                System.out.println(str);  // degısıklık omaz cunku atama yapmdık.
//butun strıng mrtotlarında kalıcı degısıklık ıcın atama yapmak lazm
                }

    }
