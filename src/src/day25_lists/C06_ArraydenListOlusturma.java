package src.day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {

    public static void main(String[] args) {


        //verılen bır array ı lısteye cevırın

        String arr[]={"A", "B", "C"};

        List<String> arraydenList= Arrays.asList(arr);

       //add remove ve clear methodları kullanılamaz.. array dan cevrıldıgı ıcın
      //** arraydenList.add("J");  desteklnmez

        System.out.println(arraydenList); //A B C

        arr[1]="F";

        System.out.println(Arrays.toString(arr)); //A F C

        System.out.println(arraydenList); //A F C

arraydenList.set(0,"Y");


        System.out.println(Arrays.toString(arr)); //Y F C

        System.out.println(arraydenList); // Y F C

    }
}
