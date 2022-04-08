package src.day29_StaticKeyword;

public class C02_staticKeyword {
    public static void main(String[] args) {





        //baska class dakı statıc class uyelerıne
        //ulasabılmek ıcın sadece
        // clasIsmi.statıcUyeIsmi yazmamız yeterlı


        System.out.println(C01_Static.okulTelefonu);//31225663635
        C01_Static.okulTelefonu="34565444747";

        System.out.println(C01_Static.okulTelefonu);//34565444747

        //baska classtakı statıc olmayan class uyelrıne
        //NCk o class tan obje olusturarak ulasabılırız
        //ve obje ıle yapılan atamalar saece o obje ıcın
        //gecerlı olur


        C01_Static obj1=new C01_Static();

        C01_Static obj2=new C01_Static();

        System.out.println(obj2.okulIsmi); //Yildiz Kolejı

        obj2.okulIsmi="Sabır kolejı";

        System.out.println(obj1.okulIsmi); //Yildiz Koleji



    }
}
