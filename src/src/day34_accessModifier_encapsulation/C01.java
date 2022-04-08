package src.day34_accessModifier_encapsulation;

public class C01 {

    private static int sayı = 10;
    private static String str = "Java";
    static int acikSayi = 20;////access m ı default Access Modıfıer dır
    String acikString = "Hi"; //access m ı default Access Modıfıer dır
    public static int halkaAcıkSayi = 15;
protected static int aileyeozel=40;


    protected C01() {
        // bu constructor un access modifier ı yazılmadıgı ıcın
        // default access m dır
        //dolayısıyla ıcıbde oldugumuz
        // paketın dısında bu class dan obje dahı olusturulamz
    }

    private C01(int numara) {
        System.out.println("parametrelı cons calıstı");
    }

    private void method1() {

    }

}
