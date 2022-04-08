package src.day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("ılker");
        isimler.add("oguzhan");
        System.out.println(isimler); //[Aykut, Yusuf, ılker, oguzhan]

        isimler.set(1, "seckın"); //yusuf gıttı yerıne seckın geldı
        System.out.println(isimler); //[Aykut, seckın, ılker, oguzhan]

        //daha onceden lıstede var olanları da arsıv gıbı tutmak ıstıyorsak

        List<String> LogLıstesı = new ArrayList<>();

        LogLıstesı.add(isimler.set(2, "cosmos")); //

        System.out.println(isimler);
        System.out.println(LogLıstesı); //ılker



    }
}
