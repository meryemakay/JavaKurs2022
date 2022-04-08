package src.day36Inheritance;

public class SureklıIscıler extends Isci{

    public static void main(String[] args) {


        SureklıIscıler surIc1 = new SureklıIscıler();
surIc1.persNo=5001;
surIc1.isim="Cem";
surIc1.soyisim="Akay";
surIc1.statu="Iscı";
surIc1.saatUcreti=11;
surIc1.maas=surIc1.maassHesapla();
        System.out.println(surIc1);


    }
    @Override
    public String toString() {
        return "SureklıIscıler{" +
                "ıscıStatu='" + ıscıStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

}