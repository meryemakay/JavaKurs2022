package src.day27_Constructor;

public class ToyotaRunner {
    public static void main(String[] args) {

        Toyota t1 = new Toyota();
        System.out.println(t1.marka); // Toyota default constructor vardı atanmıs bır deger old ıcın marka yı yazdırdı
        System.out.println(t1.tekerAdedi); //4
        System.out.println(t1.model); // atama olmadıgı ıcın null yazdırır
        t1.model = "Corolla";
        t1.yakıt = "benzin";
        t1.yil = 2022;


        System.out.println("t1 model:" + t1.model + ", yakit : " + t1.yakıt + ", yil :" + t1.yil);
t1.maxHiz();
        Toyota t2 = new Toyota();
        System.out.println(t2.model); //Null t1 ın atadıgı modelle ılgılenmez null yazdırır.
        System.out.println(t2.marka);// Toyota

        t2.model = "Yaris";
        t2.yakıt = "benzin";
        t2.yil = 2021;
        System.out.println("T2 model:" + t2.model + ", yakit : " + t2.yakıt + ", yil :" + t2.yil);
        //T2 model:Yaris, yakit : benzin, yil :2021

//t1.model ımstance varıable old ıcın t2 ıcın de atama yapmamız lazm.

    }
}
