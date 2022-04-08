package src.day24_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_GetIndeks {
    public static void main(String[] args) {

        List<Integer>sayılarLıst=new ArrayList<>();
        sayılarLıst.add(5); //[5]
        sayılarLıst.add(3); //[5,3]
        sayılarLıst.add(0, 7); //[7,5,3]
        sayılarLıst.add(2, 7);// [7,5,7,3]


        System.out.println(sayılarLıst.get(2)); //7

        System.out.println(sayılarLıst); //[7, 5, 7, 3]






    }
}