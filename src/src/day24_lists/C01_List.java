package src.day24_lists;

import src.day23_multiDimensionalArray.C06_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        int arr[] = {};

        //bu array e 5 ekleyelım


        arr = C06_.arrayeElemanEkle(arr, 5);
        System.out.println(Arrays.toString(arr)); //[5]

        //bır de 3 ekleyelım

        arr = C06_.arrayeElemanEkle(arr, 3);

        System.out.println(Arrays.toString(arr));//[5,3]

//bır lıst olusturalım

        List<Integer> sayılarLıst = new ArrayList<>();

        System.out.println(sayılarLıst); //[]

        sayılarLıst.add(5); //[5]
        sayılarLıst.add(3); //[5,3]
        sayılarLıst.add(0, 7); //[7,5,3]
        sayılarLıst.add(2, 7);// [7,5,7,3]
        System.out.println(sayılarLıst);

        System.out.println(sayılarLıst.size());//4

        System.out.println(sayılarLıst.isEmpty()); //bos degılse false




    }
}
