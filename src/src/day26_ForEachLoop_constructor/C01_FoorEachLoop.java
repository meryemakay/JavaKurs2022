package src.day26_ForEachLoop_constructor;

public class C01_FoorEachLoop {
    public static void main(String[] args) {


        int arr[]={2,4,6,8,11};

        //for loop ıle yazdıralım

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");

        }

        System.out.println("");

        //for-Ecah Loop ıle

        //for each ı calaıstırmk ıcın hedef bır collectıon vermelıyız

        for (int each :arr
             ) {
            System.out.print(each + " ");
        }
        //avantajı ındeks baslangıc degerı ve bıtıs degerı gıbı detaylrla
        //ugrasmamıza gerek kalmadan
        //collectıons dan bıze tum elementlerı bıze getırır
        //dezavantajı : ındekse baglı bır ıslem yapamayız
    }
}
