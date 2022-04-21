package src.day50_maps;

import src.day49_maps.MapOlustur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C01_Maps {
    public static void main(String[] args) {
        //sınıftakı ogrencı lıstesını duzenlı olarak yazdıralım

        Map<Integer, String> sınıflıst = MapOlustur.myMap();
        System.out.println(sınıflıst);//{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}

/*eger key lere tek tek ulsmk ıstersek
 ındeks yapısına ıhtıycımız var
 ancak map ındexyapısını desteklemez
 bunun ıcın key lerı once set e
 sonra da set ın tum elemnlarını bır lıst e ekledık
       */


        Set<Integer> sınıfKeySeti = sınıflıst.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sınıfKeySeti);


        System.out.println(keyList);//[101, 102, 103]

        System.out.println(keyList.get(1));//102

        System.out.println(keyList.get(2));//103

/*!!!!dene
Map<Integer, String> sinifList = MapOlustur.myMap();
List<Integer> sinifKeyList = new ArrayList<>();
sinifKeyList.addAll(sinifList.keySet());
System.out.println(sinifKeyList);

**
LinkedList<Integer> sinifKeyList= (LinkedList<Integer>) sinifList.keySet();
sinifKeyList.get(1);
 */


    }
}


