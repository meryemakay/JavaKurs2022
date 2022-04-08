package src.day05_matematikselislemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {
      int sayi= 10;
      int sayi2=20;
      int sayi3=30;

      sayi2=sayi++;
        System.out.println(sayi  +" " + sayi2 + " " + sayi3);



   sayi3=++sayi;

        System.out.println( sayi + " "+ sayi2 + " " + sayi3);

        System.out.println( sayi3++); // once yazdıracak sonra artıraxak

        System.out.println(--sayi2); //once azalt sonra yazdır
                                      // once sayı2=9 sonra sayı2 nın son deger yanım9 yazdırı


    }
}
