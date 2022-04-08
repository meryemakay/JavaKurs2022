package src.day03_scanner;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen isminizi yazınız");
        String isim=scan.nextLine();
        System.out.println("lutfen soyısmınızı gırınız");
        String soyısım=scan.nextLine();
        System.out.println("isim - soyısım : "+ isim + " " + soyısım);

    }
}
