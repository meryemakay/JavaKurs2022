package src.day03_scanner;

public class C03_SwapVariablesTempKullanmadan {
    public static void main(String[] args) {

         /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10


          */

  int  sayi1=10;
  int  sayi2=20;

sayi1=sayi1+sayi2;
sayi2=sayi1-sayi2;
sayi1=sayi1-sayi2;
        System.out.println(sayi1 );
        System.out.println(sayi2);

    }
}
