package src.day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();

        harfler.add("D"); //D
        harfler.add("M"); //[D,M]
        harfler.add(1,"T");//[D,T,M]
        harfler.add(0,"T"); //[T, D, T, M]  vırgulden sonra bır bosluk bırakıyor
        System.out.println(harfler);


        System.out.println(harfler.contains("T")); //true
        System.out.println(harfler.contains("F")); //false


        List<String> karakterler=new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");

        System.out.println(harfler.containsAll(karakterler)); //TRUE
karakterler.add("F");
        System.out.println(harfler.containsAll(karakterler)); //false

        //tek karakter ıcın contaıns
        //contaınsall(hepsını ıcerıyor mu) ıse bır lıstede tum elementler var mı ya bakar, tum karakterler harfler lıstesın de var mı


    }
}
