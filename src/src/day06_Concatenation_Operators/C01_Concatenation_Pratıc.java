package src.day06_Concatenation_Operators;

public class C01_Concatenation_Pratıc {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";
        int sayi=3;
        int sayi2=4;
        //kesınlıkle sayı ve harf yazmdan verıabla ısmı kullanılrk
        //Hello1 yzdrın

        System.out.println(str1+(sayi2-sayi));

        //Hello 5  World yzdırın

        System.out.println( str1 + " " + ++sayi2 + " " + str2 );

        //Hello 34 yzdırın

        System.out.println(str1 + " " + sayi+ --sayi2);

        //7World yazırın
        System.out.println((sayi+sayi2) +str1);

        //34

        System.out.println(sayi+""+sayi2); //34 tıpı str
        System.out.println(sayi + sayi2); // 7  tıpı int

        // int ı String e cevrmek için metoda ihtyc var mı(yok) sayi ve "" toplrsk str olur

       // String intdabCevrılen = ""+sayi // bu yontm mthod kullnmadn ınt ı str ye cevırır


      int sayi3 =7;
      char ilkHarf='a';
      String str="Java";
        System.out.println(sayi3 +str+ilkHarf); // 7Javaa
        System.out.println( sayi3+ ilkHarf+ str); //104Java   a nın ASCII DEGERİ 97
        System.out.println(str+ilkHarf); //javaa
   //7a yazdrın

        System.out.println(sayi3 + ilkHarf);//104

        System.out.println(""+ sayi3+ ilkHarf); //7a
    }
}
