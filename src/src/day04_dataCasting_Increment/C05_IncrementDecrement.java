package src.day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
     /*   int sayi1=2;
        sayi1= sayi1+3;
        System.out.println(sayi1);


        int sayi2=30;
         sayi2++;  //sayı1 = sayı1 +1 ;  / sayı1 += 1;
        System.out.println(sayi2);
*/
//decrement azaltma  increment:arttırma

int sayi=20;
        System.out.println(sayi+10);// aatama yapılmazsa sayıda yapılan arttırma kalıcı olmaz
        System.out.println(sayi); // sayının 10 fazlası olmus oldu artmadı
        sayi=sayi+10;
        System.out.println(sayi);

        System.out.println(sayi=sayi+10); //hem arttırma hm atama yapıldı
        System.out.println(sayi);

        System.out.println(sayi+=10); //50

         // bir variable nın degerını kalıcı olark arttmk azaltm için assigment sarttır


        System.out.println(sayi++); //50
        System.out.println(sayi); //51

        System.out.println(++sayi); //52
        System.out.println(sayi); //52
    }
}
