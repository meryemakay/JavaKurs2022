package src.day18_NestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //Soru 11 ) Interview Question
        //Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

       int input=9;

        int faktorıyel=1;
String faktoryelAcıkYazım="";

        for (int i=input; i>=1;i--){

            faktorıyel*=i;
           if(i==input) {
               faktoryelAcıkYazım=faktoryelAcıkYazım+i;
           }else


            faktoryelAcıkYazım= faktoryelAcıkYazım+"*"+i;  //sout u loop un ıcıne yazdıgımızda tek tk carpar

        }


        System.out.println(input+"!="+faktoryelAcıkYazım+ " =" +faktorıyel);



    }
}
