package src.day34_accessModifier_encapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01 obj = new C01();

        obj.acikString = "Bye";
        C01.acikSayi = 50;

        //  C01.sayi=15;//private access m ı old ıcın baska classs dan erısılemez
        // obj.method1; prıvate access m old ıcın baska classtn erısılemz

        //  C01 objParametreli=new C01(5);  prıvate access m old ıcın baska classtn erısılemz


    }
}
