package src.day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cemberin yarıcapını giriniz");
      double yarıcap= scan.nextDouble();
        System.out.println("girdiğiniz yarıcap :"+ yarıcap);
        System.out.println("cemberin cevresi:" + 2*3.14*yarıcap);
        System.out.println("dairenin alanı :" +3.14*yarıcap*yarıcap);




        }
    }

