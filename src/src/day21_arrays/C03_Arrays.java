package src.day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        int arr[]; //deger ataması yapmadık Java kabul ettı amcak kuallnamamıza ızın vermez boyutunu bılmez

       // arr={1,2,3};  // kabul etmıyor bu atamayı. cunku bu array ı olusturuken kac uzunluk old belırlenmedı
        arr=new int[6]; //6 tane 0
        System.out.println(Arrays.toString(arr));  // deger atanmadıgı ıcın

        System.out.println(arr.length); // array ın element sayıısnı verır.
                                        //Strıng dekı lengt de () vardı bunda yok

        //arrydekı her bır elemanı ındeks degerı kadar arrtıralım

        for (int i=0; i<arr.length; i++) {
            arr[i] += i;
        }
            System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5]

       //son ındeks
        System.out.println(arr[arr.length-1]); //5











    }
}
