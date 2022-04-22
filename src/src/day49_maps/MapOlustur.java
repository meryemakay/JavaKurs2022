package src.day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

    public static Map<Integer,String> myMap(){

        Map<Integer,String> sinifList = new HashMap<>();

        sinifList.put(101,"Ali, Can, Dev, 1453");
        sinifList.put(102,"Veli, Yan, QA, 1990");
        sinifList.put(103,"Ali, Yan, C#, 2000");
        sinifList.put(104,"Ali, san, C#, 2000");
        sinifList.put(105,"Ali, kan, C#, 2006");
        sinifList.put(106,"Ali, pan, C#, 2009");

        return sinifList;
    }
}

