package src.day32_dateTime;

public class C06_Varargs {
    public static void main(String[] args) {

        //verılen ıkı sayıyı toplayan bıt method olusturun

        int sayı1 = 10;
        int sayı2 = 20;
        int sayı3 = 30;
        int sayı4 = 40;
        int sayı5 = 50;


//bır de 3 sayıyı olusturan method yazalım

        toplaGel();
        toplaGel(sayı1);
        toplaGel(sayı1, sayı2);
        toplaGel(sayı1, sayı2, sayı3);
        toplaGel(sayı1, sayı2, sayı3, sayı4);
        toplaGel(sayı1, sayı2, sayı3, sayı4,sayı5);


    }

    private static void toplaGel(int... sayı) {
        int toplam=0;
        for (int each:sayı
             ) {
            toplam+=each;
        }

        System.out.print(toplam);
    }



    }




