package src.day26_ForEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {


        //10 elementlı bır lıst olusturalım

        int arr[] = {2, 5, 4, 6, 4, 9, 7, 1, 3, 10};
        List<Integer> sayılar = new ArrayList<>();

        for (int each : arr
        ) {
            sayılar.add(each);
        }
        System.out.print(sayılar + " ");
        System.out.println("");
        //sayılar lıstesınde 3 e bolunemeyen sayıları for each loop ıle yazdırın

        for (int each : arr
        ) {
            if (each % 3 != 0) {
                System.out.print(each + " ");
            }
        }

        int arr1[] = {1, 3, 5, 7, 9};

        for (int w : arr1) {

            System.out.print(w + " ");

            if (w > 4) {

                break;

            }
        }


    }}


