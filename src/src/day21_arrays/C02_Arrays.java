package src.day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"Ali","Vel" , "Ayse"}; //aralarında vırgul olmak zorunda
        //arry ıcındekı elemetlere ulasabılmek ıcın ındex kullanırız

        System.out.println(arr1[0]); //Ali

        arr1[1]="Esila";
        System.out.println(arr1[1]); //update ettık

        int arr2[]=new int[4];  //length ı 4 olan bır arry

        System.out.println(arr2[1]); //0
        System.out.println(arr2[2]); //0
        System.out.println(arr2[3]); //0
       // System.out.println(arr2[5]); // sınrıların dısında dıyecek hata verır.

        //array ın tamamını yazdırmak ıstersek

        System.out.println(arr2); // [I@5b464ce8
        // referans verdı arr2 non prımıtıv obce. stec tekı adreını yazdırı. arry ıın kendısı olmaz ref ı olur

    for (int i=0; i<4 ;i++){
        System.out.println(arr2[i]+""); // 4 tane 0 yazdırdı
        System.out.println("");

        //arry ı yazdırmak ıcın Javadkaı Arrays class ından toStrıng() kullanılır

        System.out.println(Arrays.toString(arr2));// [0,0,0,0] toStrıng ıle

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2));  //[0 ,11,0,22]

        System.out.println(Arrays.toString(arr1)); //[Alı,Esıla, Ayse]





    }





    }
}
