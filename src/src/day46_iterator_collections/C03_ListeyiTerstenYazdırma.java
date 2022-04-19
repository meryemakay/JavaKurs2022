package src.day46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListeyiTerstenYazdırma {

    public static void main(String[] args) {
        // verilen bir listeyi, iterator ile sondan basa dogru yazdiralim

            List<Integer> liste= new ArrayList<>();
            liste.add(5);
            liste.add(7);
            liste.add(8);
            liste.add(6);
            liste.add(9);

        System.out.println(liste);//[5, 7, 8, 6, 9]
            // once iterator u olusturup, sona yollayalim


            ListIterator itr=liste.listIterator();

            while(itr.hasNext()){

                itr.next();

            }



            while(itr.hasPrevious()){
                System.out.print(itr.previous() + " ");//9 6 8 7 5
            }
        }
    }




