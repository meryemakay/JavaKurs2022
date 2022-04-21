package src.day50_maps;

import src.day49_maps.MapOlustur;

import java.util.*;

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

        /*
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sinifList.keySet());
         */


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


//sımdı de value lerı ındex ıle ulasabılecek bır sekle sokalım

        Collection<String> sınıfvalueColl = sınıflıst.values();
        System.out.println(sınıfvalueColl);//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
        System.out.println(sınıfvalueColl.size());//3

        List<String> sınıfValueList = new ArrayList<>();
        sınıfValueList.addAll(sınıfvalueColl);
        System.out.println(sınıfValueList);//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]

        /*her bır value bırden fazla bılgıyı ıcerıyor
        onun ıcın valuelrı mult. array e atamak mantklı duruyır
        ancak Md olsturmk ıcın boyutlrı bılmek lzm
         */
        int outurArrayBoyut = sınıfValueList.size();

        System.out.println(outurArrayBoyut);//3

        //inner arry lerın buyutunu blmak daha komplex
        String ilkValue = sınıfValueList.get(0);

        System.out.println(ilkValue);//Ali, Can, Dev

        String ilkVlueArray[] = ilkValue.split(", ");
        int innerArrayBoyut = ilkVlueArray.length;

        String valueMDarr[][]=new  String[outurArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outurArrayBoyut ; i++) {
            for (int j = 0; j < innerArrayBoyut; j++) {
                sınıfValueList.get(i).split(", ");




            }
        }

    }
}


