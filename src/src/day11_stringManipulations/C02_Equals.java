package src.day11_stringManipulations;

public class C02_Equals {
    public static void main(String[] args) {

//equals ıkı strıng ın bırbırne esıt olup olmdıgını kontrol eder
        //== ise hem esıt olup olmdıgını hem de ref lere bakar


        String str1 ="Ali Can";
        String str2 ="Ali" +" Can";

        System.out.println("str:" + str1);
        System.out.println("str2:"+ str2);

        System.out.println("== ıle karsılastır " +( str1 ==str2));
        System.out.println("equals ıle karsılastır :" + str1.equals(str2));

        String str3=str1+"";

        System.out.println("== ıle karsılastır " +( str3 ==str2));
        System.out.println("equals ıle karsılastır :" + str3.equals(str2));

        //strng de == her zamn dogru sonuc vrmz
        //bunun ıcın emın oldugumuz equals metodunu kullnmayı tercıh ederz

        //  equals sadeec strng ler ıcın

        String str5="hasan";
        String str6="HASAN";

        System.out.println(str5.equals(str6));
        System.out.println(str5.toUpperCase().equals(str6));













    }
}
