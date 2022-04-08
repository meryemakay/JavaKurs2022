package src.day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {

        boolean dogruMu=true;

   byte sayi1= 44;
        System.out.println(sayi1);

short sayi2= sayi1; // eşitliğin solu short sag ise byte

        System.out.println(sayi2);
double sayi3=sayi2;
        System.out.println(sayi3);

    }
}
