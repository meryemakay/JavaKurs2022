package src.day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_mapMethodlari {

    public static void main(String[] args) {


        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("H", 3);
        myMap.putIfAbsent("K", 5);

//Bır ekleme yapmak ıstedıgımızde key daha once eklenmemısse mape eklsın
        //daha onceden eklenmısse eskıyı sılmemek ıcın uyarsın

        System.out.println(myMap.putIfAbsent("A", 6)); //NULL ondan once bısey olmadıgı ıcın null yazdırdı. bunu da atadı

        if (myMap.putIfAbsent("K", 20) != null)
            System.out.println("gırdıgınıuz key Map de zaten var");
        // System.out.println(myMap.putIfAbsent("K", 20));//ondan once 5 avrdı 5 ı yazdırdı


        // System.out.println(myMap);//{A=6, H=3, K=5}

        System.out.println(myMap);//{A=6, H=3, K=5}


        myMap.put("A", 10);


        System.out.println(myMap);//{A=10, H=3, K=5}

        myMap.computeIfAbsent("A", v -> 20);
        System.out.println(myMap);//{A=10, H=3, K=5} a vardı degıstırmedı.

        myMap.compute("A", (key, value) -> 20);

        System.out.println(myMap);//{A=20, H=3, K=5} formullu degısım oldu. value yı degıstırdı. key degısmedı unıq

           // H nın degerını 2 katının 5 fazlası yapın
        myMap.compute("H", (k, v) -> (2 * v + 5));


        System.out.println(myMap);//{A=20, H=11, K=5}


    }
}
