package src.day18_NestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class homework {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random r = new Random(); //random sınıfı
        int a = r.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int i = 0;

        while (!(sayi == a)) {
            i++;
            System.out.print("Lutfen tahmininizi giriniz : ");
            sayi = scanner.nextInt();
            if (sayi < a) {
                System.out.println("Lutfen sayiyi buyutunuz");
            } else if (sayi > a) {
                System.out.println("Lutfen sayiyi kucultunuz");
            } else {
                System.out.println(":-) Bravo " + i + ". tahminde dogru tahmin ettiniz :-) ");
            }


        }

    }}
