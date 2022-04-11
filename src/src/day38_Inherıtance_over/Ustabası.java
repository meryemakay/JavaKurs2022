package src.day38_Inherıtance_over;

public class Ustabası extends Personel{

    public class Ustabasi extends Isci{
        public String statu="Ustabasi";
        public String haklar="Ustabasi haftada birgun ekstra tatil hakkina sahiptir";

        public void mesai(){
            System.out.println("Ariza varsa Ustabasi ekstra ucret almadan calisir");
        }
        public void maasHesapla(){
            System.out.println("Ustabasi 30 gun * 8 saat * 12 euro = " + (30*8*12) + " Euro maas alir");
        }
        public void main(String[] args) {
        /*
          Icinde oldugumuz Class'dan klasik haliyle bir obje olusturursak
          o obje ile cagirdigimiz variable ve method'larda
          Java once icinde bulundugumuz class'a bakar
          aradigimiz class uyesi, icinde oldugumuz class'da varsa
          bize onu getirir
          YOKSA,
          parent class(lar)a bakar, ilk buldugunu getirir
         */
            Ustabasi yasin=new Ustabasi();//baslngıc noktası ustbası class ıdır
            System.out.println(yasin.statu); // Ustabasi
            System.out.println(yasin.haklar); // Ustabasi haftada birgun ekstra tatil hakkina sahiptir
            System.out.println(yasin.ikramiye); // Isciler Yilda bir ikramiye alir
            System.out.println(yasin.izin); // Tum personel yilda 4 hafta izin kullanabilir
            yasin.maasHesapla();//2880
            yasin.mesai(); // Ariza varsa Ustabasi ekstra ucret almadan calisir
        /*
            Eger isci olarak ozelliklerini gormek istersek
            Class adini (Data Turu) Isci seceriz
         */
            Isci ahmet= new Ustabasi(); //baslngıc noktası ıscı class ıdır
            System.out.println(ahmet.statu); // isci
            System.out.println(ahmet.haklar); // Isciler Kidem tazminati alirlar
            System.out.println(ahmet.ikramiye); // Isciler Yilda bir ikramiye alir
            System.out.println(ahmet.izin); // // Tum personel yilda 4 hafta izin kullanabilir
            ahmet.maasHesapla(); //2880
            ahmet.mesai();// Ariza varsa Ustabasi ekstra ucret almadan calisir
        /*
        Siz bir objeyi hangi class'dan tanimlarsaniz o class'a ait ozelliklere sahip olur
         */
            Personel adem=new Ustabasi();//baslngıc noktası personel class ı dır. cunku data turu personel
            System.out.println(adem.statu); // personel
            System.out.println(adem.haklar); // Tum personel esit haklara sahiptir
            //System.out.println(adem.ikramiye); // CTE verir cunku personel classt ıkrmıye yok.
            System.out.println(adem.izin); // // Tum personel yilda 4 hafta izin kullanabilir
            adem.maasHesapla();//2880
            adem.mesai();// Ariza varsa Ustabasi ekstra ucret almadan calisir
        /*
        Personel adem=new Ustabasi(); Bu bir Ustabasi objesidir /data turu personle . bır personel olarak ademı gormek ıstıyoruz
        Ustabasi 30 gun * 8 saat * 12 euro = 2880 Euro maas alir
        Ariza varsa Ustabasi ekstra ucret almadan calisir

        Personel adem=new Personel(); Bu Personel objesidir

         */

//!!! List <Strıng> liste=new Arraylıst<>() aslında burada arraylıst in list ozellıklerını kullanırız..


        /*
        Personel adem=new Ustabasi();

        adem'in data turu Personel'dir.
        boylece biz adem'i ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben adem'in ustabasi oldugunu biliyorum
        cunku constructor'i Ustabasi
        Ama bu yazim formati ile
        adem'in tum Personel ile birlikte sahip oldugu
        ortak ozellikleri vurgulamak istiyorum

        Bu kullanim seklinde olusturulan obje data turu olarak secilen class
        ve onun parent class'larindaki variable'lari kullanabilir.
         */
        }
    }
}
