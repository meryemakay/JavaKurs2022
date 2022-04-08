package src.day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("ılker");
        isimler.add("oguzhan");
        System.out.println(isimler);

        //reomve method u ıstenen elementı kaldırıp
        // bıze true veya false doner
        //eger remobve ıslemının yapılmadıgını kontrol etmek ıstıtorsanuz
        //mwthod u boolen vrabl a atayabılırsınz

        boolean sonuc = isimler.remove("oguzhan");
        //sonucu kullanıcıya yazdımak ıstıyorsnz
        //if else ıle ıstedıgınız dgerlendıröeyı yapabılırsınız
        if (sonuc == true) {
            System.out.println("istedıgınız ısım sılındı");
        } else {
            System.out.println("istedıgınız ısım lıstede olmadıgı ıcın sılınemedı");
        }

        //remove.(ındeks) yazılınca sıldım / sılmedım ıhtımalı kalmaz
        //bıze remove edılen elementı doner



        System.out.println(isimler);
        isimler.remove(2); //ılker ı sıldı
        System.out.println(isimler);
        System.out.println(isimler.remove(1)); //sılınenı dondurdu (yusuf)

        System.out.println(isimler); //[aykut]
    }
}
