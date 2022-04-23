package src.day52_maps;

import src.day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {
    public static void main(String[] args) {
//verılen map dekı tum bransları java yapalım

        /*
        Map de value komplex olabıldıgı ıcın
        value ıcerısınden bır bolumu degıstırmk ıstersek
        once value yua ulasmak sonra onu manıpule ederek
        ıstedıgımız degısklıgı yapmak ve en son degısmıs halını yenıden Map e eklemek
        gerekır

         */
        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);

       Set<Map.Entry<Integer, String>>sinifEntrySet= sinifListMap.entrySet();

        for (Map.Entry<Integer, String> each :sinifEntrySet
             ) {

            Integer keyEntry = each.getKey();
            String valueEntry = each.getValue();

            String valueArr[] = valueEntry.split(", ");

            valueArr[2] = "Java";

            String valueYeni = valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2] + ", " + valueArr[3];

            sinifListMap.put(keyEntry, valueYeni);

        }


        System.out.println(sinifListMap);//{101=Ali, Can, Java, 1453, 102=Veli, Yan, Java, 1990, 103=Ali, Yan, Java, 2000, 104=Ali, san, Java, 2000, 105=Ali, kan, Java, 2006, 106=Ali, pan, Java, 2009}

    }
}
