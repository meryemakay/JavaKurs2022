package src.day14_stringManipulation;

import java.util.Locale;

public class C02_TerstenYazdırma {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi ilk harfı buyuk
        // dıgerlerı kuuck olaraktersten yazdirin.

String ınput="evam";
String tersStr=ınput.substring(3).toUpperCase()+
        ınput.substring(2,3).toLowerCase()+
        ınput.substring(1,2).toLowerCase()+
        ınput.substring(0,1).toLowerCase();
        System.out.println(tersStr);








    }
}
