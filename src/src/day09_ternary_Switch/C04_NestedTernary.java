package src.day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        //OCA(javayı bıld belegelr) ve ISTQB(calısma ortmını bıl gostren)
        //nested ıc ıce demek

        //verılen sayını pozıtıf mı negatıf mı old kontrol edıp
        //0 veya pozıtıf sayı ıse tek veya cıf
        //negtıf sayı ıse   -100 den buyuk veya kucuk
        // old belırleyn bır ternary yazınız


        int sayi = -122;

        if (sayi >= 0) {
            if (sayi % 2 == 0) {
                System.out.println("sayı pozıtıf cıft sayı");

            } else {
                System.out.println("sayı pozıtıf tek sayı");
            }
        } else {
            if (sayi < -100) {
                System.out.println("sayı -100 den kucuk negztıf");

            } else {
                System.out.println("sayı -100 den buyuk negatıf sayı");




            }
        }
    String sonuc=sayi>=0 ?
            (sayi%2==0 ? "pozıtıf cıft sayı" : "poztıf tek sayı"):
            (sayi<-100? "-100 den kucuk negatıf sayı ": "-100 den buyk negatıf sayı");
        System.out.println(sonuc);

    }
}