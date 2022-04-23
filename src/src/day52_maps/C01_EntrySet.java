package src.day52_maps;

import src.day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {

        Map<Integer, String> sinifListMap = MapOlustur.myMap();

        System.out.println(sinifListMap);//{101=Ali, Can, Dev, 1453, 102=Veli, Yan, QA, 1990, 103=Ali, Yan, C#, 2000, 104=Ali, san, C#, 2000, 105=Ali, kan, C#, 2006, 106=Ali, pan, C#, 2009}

        sinifListMap.entrySet();//entry lerden olusan bır set donecek ınteger ve strng lerden olusacak
        System.out.println(sinifListMap.entrySet());//[101=Ali, Can, Dev, 1453, 102=Veli, Yan, QA, 1990, 103=Ali, Yan, C#, 2000, 104=Ali, san, C#, 2000, 105=Ali, kan, C#, 2006, 106=Ali, pan, C#, 2009]
        // [] ıcınde dondurdu ceollectıon olark
/*
myMap.Entry(); methodu bıze entry lerdn olusan bır set dondurur
eger bu entry lerı manıpule etmk ıstıyorsk
method un dondurdugu set ı yenı bır set olsturp store etmelıyız
 */

        Set<Map.Entry<Integer, String>> sinifEntrSeti = sinifListMap.entrySet();


        System.out.println("No   Isım  Soyısım   Brans   Dogumyılı");
        System.out.println("__________________________________________");
        for (Map.Entry<Integer, String> each : sinifEntrSeti
        ) {
          //  System.out.println(each);//101=Ali, Can, Dev, 1453
            // 102=Veli, Yan, QA, 1990
            // 103=Ali, Yan, C#, 2000
            //104=Ali, san, C#, 2000
            //105=Ali, kan, C#, 2006
            //106=Ali, pan, C#, 2009

            Integer EntryKey = each.getKey();
            String valueStr = each.getValue();

            String valueArr[] = valueStr.split(", ");

            System.out.printf("%-4d %-6s %-9s %-6s %s\n ", EntryKey ,valueArr[0] , valueArr[1],valueArr[2], valueArr[3]);
        }

        System.out.println("__________________________________________");

    }
}
