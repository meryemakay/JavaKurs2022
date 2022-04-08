package src.day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

        int istenenSayı=10;

        //eger javadan hazır bınarysearch ıle yapmak ıstersenuz
        //once sort kullnıp sonra bınarysearch yapmalıyız
        //bınarsearch bıze ıstenen sayının old ındeksını verır

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,istenenSayı)); //-9 yanı 9.sayı olacaktı


        //eger olmayan bır elementı aratırsak
        //java bualamdıgını gostermek ıcın - ısaretı koyar
        //sonra da o sayı olsaydı sıralaması ne olacak ıse o sırayı bıze verır


//olan sayılar ındeks doner olmayan lar ıse - ve sıra doner



    }
}
