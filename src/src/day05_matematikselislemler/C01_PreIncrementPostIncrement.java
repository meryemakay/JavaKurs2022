package src.day05_matematikselislemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayi1=10;
        //bu sayıyı 1 arttrılacak
        sayi1++;

        System.out.println(sayi1); //11
        sayi1++;
        System.out.println("preıncrementten once " + sayi1); //12 once arrtırı sonra yazdırısak yenı deger yazılır

        System.out.println(sayi1); //12 / önce yazdırp sonra arttırılırsa eskı deger yazılır


        System.out.println("preıncrement satırında " + ++sayi1); //13

        System.out.println("preıncrementten sonra " + sayi1);

        System.out.println("post ıncrement satırında "+ sayi1++); // önce yazdır sonra arttır
        System.out.println("post ıncrement satırından sonra "+  sayi1); // 14







    }
}
