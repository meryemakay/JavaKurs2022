package src.day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh=LocalDate.now(); //objenın olusturuldugu tarıhı trh ye atar

        LocalDate baskatrh=LocalDate.of(1991,7,20);
        //istedıgımız yıl gun ay degerlerıne gore bıze obje olusturur

        System.out.println(trh); //2022-03-31
//get li methodlarla tarıh ıle ılgılı detay  bılgılerı alabılırı
        System.out.println(trh.getDayOfMonth()); //31

        System.out.println(trh.getDayOfWeek()); //THURSDAY

        System.out.println(trh.getMonthValue());// kacıncı ay 3

        System.out.println(trh.getYear()); //2022

        //bır tarıhten ıstedıgımız kadar ılerı veya gerı gıdebılırız

        System.out.println(trh.minusWeeks(20)); //2021-11-11
        System.out.println(trh.minusWeeks(5).minusDays(3)); //2022-02-21

        System.out.println(trh.plusMonths(9).plusDays(10));//2023-01-10

        //istedıgımız ulkenın o andakı tarıhını elde etmek ıstersek

        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);//2022-04-01

        //is ıle baslayan methodlar boolean sonuclar dondurr
        System.out.println(LocalDate.now().isLeapYear()); //false
        System.out.println(trh.isAfter(baskatrh)); //true , sıralama


//java da 3 tane zamn class ı var
        //date , tıme ve datetime

    }
}
