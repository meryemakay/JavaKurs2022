package src.day42_exception;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) throws IllegalArgumentException {

        /*
        kullnıcıdan yasını ısteyın
        kullnıcı yaza olrk negstf
        0 veya 120 den buyuk gırerse ıllegalargmntexp olusacak sekılde
        progrm yzınz
         */

Scanner scan = new Scanner(System.in);

        System.out.println("yasınızı gırınız");
int yas =scan.nextInt();


if (yas<0 || yas>120){
    System.out.println("lutfen gecerlı yas gırınz");
    //java ıstedıgımız exceptıonu fırlatır
    throw new IllegalArgumentException();

}else
    System.out.println("yasınz uygun ");
    }
}
