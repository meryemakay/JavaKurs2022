package src.day05_matematikselislemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
        short sayi1= 20;

        Short sayi2=30;

        sayi1=sayi2; // ikisi arasında gecise izin veriyor

        System.out.println(sayi1); //30

       // sayi1.//metod cıkmaz

       // System.out.println(sayi1.);
        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Short.MIN_VALUE); //-32768

        System.out.println(Short.BYTES); //2byt=16bit










    }
}
