package src.day36Inheritance;

public class UstaBası extends Isci{
    public static void main(String[] args) {

        UstaBası ustabası1=new UstaBası();
        ustabası1.saatUcreti=15;
        ustabası1.isim="murat";
        ustabası1.soyisim="gokcek";
        ustabası1.maas= ustabası1.maassHesapla();
        ustabası1.statu="isci";
        ustabası1.ıscıStatu="ustabası";

        System.out.println(ustabası1);

    }

    @Override
    public String toString() {
        return "UstaBası{" +
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
