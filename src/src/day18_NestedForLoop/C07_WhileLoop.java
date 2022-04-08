package src.day18_NestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {

        //kullanıcıdan kac sayı toplamak ıstedıgını alın
        //bu sayıları alıp ve bu sayıların top ekrana yazdırın

        int sayıAdedı = 5;

        Scanner scan = new Scanner(System.in);
        int sayı = 0;
        int toplama = 0;


        for (int i = 1; i <= sayıAdedı; i++) {
            System.out.println("lutfen bır sayı gırınız");
            sayı = scan.nextInt();
            toplama += sayı;
        }
        System.out.println("gırılen " + sayıAdedı + "sayını toplamı" + toplama);

        //while ıle

        sayı = 0;
        toplama = 0;
        int sayac = 1;

        while (sayac <= sayıAdedı) {
            System.out.println("lutfen bır sayı gırınız");
            sayı = scan.nextInt();
            toplama += sayı;
            sayac++;


        }
        System.out.println("gırılen " + sayıAdedı + "sayını toplamı" + toplama);
    }

}
