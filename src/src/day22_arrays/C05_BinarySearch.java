package src.day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {

    public static void main(String[] args) {
//verılen array de ıstenen bır elementın var olup olmadıgını true false yazdırarak
        //gosteren bır method olusturun

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

        int istenenSayı=14;

        istenenElemanVarMi(arr,istenenSayı);

        //eger javada hazır bınarysearch ıle yapsak ıstersek
        //once sort methodunu kullanıp
        //sonra bınarysearch yapmalıyız



    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayı) {
boolean sonuc=false;
        for (int i=0; i<arr.length; i++){

            if(arr[i]==istenenSayı){
               sonuc=true;
                break;
            }
        }
        System.out.println(sonuc);

    }
}
