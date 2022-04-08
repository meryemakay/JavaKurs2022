package src.day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
//** ternary ıcınde komplex kodlar olmaz saddece sonuc veya bızı dırek sonuca goturecek basıt ıslemler olablr


        //ternary ıle yaoılan tum ıslemler ıf else ıle de yapılabılır
        // ıf else yerıne bunu tercıh edılme sebebi bunu basıt ve anlasılır olmasıdır
        //ternary nın ıcınde komplex kodlar olmz
        // sadec sonuc ve bızı sonuca goturen basıt ıslmler olblr

        //kullnıcd bır tam sayı alıp tek mı cıft mı
        //yazdırn bır kod yazdırlım

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen pozıtıf bır tam sayı gırınız");

        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("sayı cıft");
        } else {
            System.out.println("sayı tek");

        }
        System.out.println(sayi%2==0 ? "Sayı cıft" : "sayıtek");  //ılk sonuc true sonuc2 ıse false dır
    }
    }



