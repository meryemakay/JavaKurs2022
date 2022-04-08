package src.day36Inheritance;

public class Memur extends Muhasebe {


    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {


        Memur memur1 = new Memur();
        //memur1 objesı memur classına aılt olmasına rgmen
        //ınherıt ettıgı muhasebe ve onun da parentı olan
        //personel class larındakı tum datları alabılır


        //personel classından aldık
        memur1.persNo = 1001;
        memur1.isim = "Ahmet";
        memur1.soyisim = "Tepecik";
        memur1.adres = "Ankara";
        memur1.tel = "3127576595";

        //muhasebe classından aldık
        memur1.saatUcreti = 10;
        memur1.maas = memur1.maassHesapla();
        memur1.statu = "memur";

        System.out.println(memur1);

        Memur memur2 = new Memur();
        memur2.persNo = 1002;
        memur2.saatUcreti = 10;
        memur2.maas = memur2.maassHesapla();

        System.out.println(memur2);

    }
}