package src.day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {


        LocalTime tm = LocalTime.now();
        System.out.println(tm); //22:14:17.014590100
//bır ıslemın ne kadar surede bıttıgını bulmk ıstersek
        //ia-slemden once ve ssonra bırer tıme objesı olusturup aradakı
        //farkı heseaplayabılırız
        int sayi = 0;
        for (int i = 0; i < 100000; i++) {
            sayi++;
        }
        LocalTime tmLoopSonrası = LocalTime.now();
        System.out.println(tmLoopSonrası);//22:14:17.015844800

        double nano1=tm.getNano();
        double nano2=tmLoopSonrası.getNano();

        System.out.println("islem "+ (nano2-nano1) + "nano sanıyede bıttı");


        //ilerı veya gerıye gıdebılırız

        System.out.println(tm.plusMinutes(1000));//15:00:11.468318600

        //istersek Zone ıd kullanrak ıstedıgımız bolgenın saatı ıcın de obje olsturabılırız
    }
}
