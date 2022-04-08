package src.day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");

       // String kullanıcıIsmi=scan.next(); // sadece ilk bosluga kadar olanı alır

        String kullanıcıIsmii=scan.nextLine();
        System.out.println("kullanıcının gırdıgı ısım : " +kullanıcıIsmii);







    }
}
