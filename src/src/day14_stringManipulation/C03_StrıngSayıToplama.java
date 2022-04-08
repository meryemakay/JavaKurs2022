package src.day14_stringManipulation;

public class C03_StrıngSayıToplama {
    public static void main(String[] args) {

     //   Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz

        //ipucu : Double.parseDouble() methodunu kullanabilirsiniz

        String str1 = "$13.99";
        String str2 = "$10.55";


        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D" ,"");

        System.out.println(str1+str2); //concat yapar
        double str1Syı=Double.valueOf(str1);
        double str2Sayı=Double.valueOf(str2);

        double sonuc=(str1Syı+str2Sayı)/100;
        System.out.println("verılen Strıng sayıların toplamı:  $" + sonuc);




        }
    }

