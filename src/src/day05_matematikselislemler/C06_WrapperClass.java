package src.day05_matematikselislemler;

public class C06_WrapperClass {
    public static void main(String[] args) {
        String str1="12345";
        String str2="23456";

        //verılen ıkı strng dekı sayıları tplayın

        System.out.println(str1+str2); // yan yana yazdırır

        System.out.println(Integer.valueOf(str1)+ Integer.valueOf(str2)); //valueof=şunun degeri //35801

//Integer.valueof(str1+str2) olmaz


        //wrapperclass ozel classlardır

//Integer.valueof(str) metodu sadece sayısal deger ıceren Strng lerde kullanılır
        //bır tane bıle sayı dısında karakter varsa da hata verr




    }
}
