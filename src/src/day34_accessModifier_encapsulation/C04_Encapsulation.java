package src.day34_accessModifier_encapsulation;

public class C04_Encapsulation {

    public static void main(String[] args) {
        /*bır variable ı encapsule etmek ıcın
        1.access m ı private yaparız
        2.okuma ve yazma ozellıklerının kullnmasını ıstedgımız gıbı sınrlndırabılırz
          eger sadece okunmasını ıstersek getter
          sadece deger gırılebılsın ıstersek setter
          methodlarını olustururz

          bır varıable ıcın hem getter hem setter olustursanız
          o varıable publıc olmus gıbı
          hem okuyp hem de yazılmasını saglayabılırsınız
          Pısayada developer lar arasında genel uygulama da boyldır


        */
        C03 obj = new C03();

        System.out.println(obj.getSayi());//0

        obj.setStr("Java Java Java");
        System.out.println(obj.getStr());//Java Java Java

        System.out.println(obj);//sayi=0 str=Java Java Java



    }
}
