package src.day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {
        //Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        char ilkHarf=scan.next().charAt(0);

        System.out.println("ilk harf: " +ilkHarf);
    }
}
