package src.day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {


        List<Integer> sayılar = new ArrayList<>();
        sayılar.add(5); //[5]
        sayılar.add(3); //[5,3]
        sayılar.add(0, 7); //[7,5,3]
        sayılar.add(2, 7);// [7,5,7,3]

        sayılar.remove(3); //indeks olarak 3 tekı elemntı sıler

        // sayılar.remove(5); //IndexOutOfBoundsException

        //sayılardan olusan bır lıste objeyı vererek element sılme methodu calısmaz
        //sayı degerı gırdıgımızde java otomatık olarak sayıyı ındeks olarak kabul eder


      /*  int sayı=5;
        sayılar.remove(sayı); // ındeks olarak aldı
        System.out.println(sayılar); //IndexOutOfBoundsException */

        System.out.println(sayılar);
        Integer sayı = 5; //Integer wrapper class ıkullanınca sayı obje old ıcın calıstı
        sayılar.remove(sayı);
        System.out.println(sayılar); //5 ı sıldı Integer obje olarak alıyor. [7,7]




        int arr[] = new int[5];

        ArrayList<Integer> list = new ArrayList<Integer>();



        for (int i = 1; i <= arr.length; i++) {

            list.add(i);

        }

        System.out.println(list);
        ArrayList<Character> list1 = new ArrayList<Character>();



        for (char i = 'a'; i <= 'e' ; i++) {

            list1.clear();

            list1.add(i);

        }

        System.out.println(list);

    }


    }
