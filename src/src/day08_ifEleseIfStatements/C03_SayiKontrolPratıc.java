package src.day08_ifEleseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrolPratıc {
    public static void main(String[] args) {


// Kullanicidan iki sayi isteyin,
// sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
// sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
// sayilarin ikisi farkli isaretlere sahipse
// "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
// sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayı giriniz");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("girdıgınz ıkı sayı da pozıtıf old toplmları "+
                    (sayi1+sayi2));

        }else if (sayi1<0 && sayi2<0) {
            System.out.println("girdıgınz ıkı sayı da negatıf old toplmları " +
                    (sayi1 + sayi2));



        }else if (sayi1*sayi2<0){
            System.out.println("gırdıgınız ıkı sayının ısaretı farklı ");
        }



        }
}
