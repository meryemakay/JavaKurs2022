package src.day05_matematikselislemler;

import java.util.Scanner;

public class C03_RkamlarToplamınıBulma {
    public static void main(String[] args) {
        //kullanıcıdan aldıgnız 4 basakmklı sayını  basamaklardkı rakamlar top bulun


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı bır tam sayı gırınızı");
        int sayi=scan.nextInt();



      int rakam=0;
      int rakamlarToplamı=0;

      //1.adım rakam=0 sayı=7532

        rakam=sayi%10; //2
        rakamlarToplamı +=rakam;
        sayi/=10; //753,2 olur ama ınt old için 753 olur

        //2.adım r=2  rkmtop=2  sayı=753


        rakam=sayi%10; //3
        rakamlarToplamı+=rakam; //5
         sayi/=10; //75.3 olur ama ınt old için 75

        //3.adım r=3 rmtop=5  sayı=75

        rakam=sayi%10; //5
        rakamlarToplamı+=rakam; //10
        sayi/=10; //7.5 olur ama ınt old için 7


        //4.adım r= 7 rkmtop= 17  sayı=7

        rakam=sayi%10; // 7
        rakamlarToplamı+=rakam; //17
        sayi/=10; // 0.7 ama 0

        System.out.println("girdiginiz sayının rakamlar top :" + rakamlarToplamı);







    }
}
