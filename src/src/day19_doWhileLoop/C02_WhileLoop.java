package src.day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin
        // ve bu sayinin rakamlari toplamini yazdirin

        int input = 7629;
        int rakam = 0;
        int rakamlartop = 0;

        while (input > 0) {
            rakam=input%10;
            rakamlartop +=rakam;
            input/=10;

        }

        System.out.println(rakamlartop);
    }
}