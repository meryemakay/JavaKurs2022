package src.day11_stringManipulations;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        //kullanııcya drse katılp katılmak ıstemdıgınız sorup
        //evet derse cevabını ve "derse katılımınız alınmıstır"
        //hayır derse cevabını ve "sonrakı derslrımıze beklerız " yazdırın

        //**class ısmlerı buyık harfle yazılır metod ısmı jucuk harfle yzılır

        Scanner scan = new Scanner(System.in);
        System.out.println("derse katılmak ıster mısınız ? \n Evet veye Hayır yazınız");

        String cevap = scan.next();

//equalsıgnorcase buyuk kucuk harf bakamdan karsılastırır

        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("cevabınız : " + cevap + "  dersekatılımınız onaylanmıstır");
        } else if (cevap.equalsIgnoreCase("hayır")) {
            System.out.println("cevabınız :" + cevap + " sonrakı dersleımıze beklerız");
        } else {
            System.out.println("lutfen evet veya hayır yazınız");
        }

    }
}
