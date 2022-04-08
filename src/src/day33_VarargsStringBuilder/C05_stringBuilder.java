package src.day33_VarargsStringBuilder;

public class C05_stringBuilder {
    public static void main(String[] args) {
        /*
        compare ıkı sb ı esıt mı dıye kontrol etmek ıcın ilk harften baslayark tum
        karaktrlerı karsılatırır
        aynı olan karaterler ıcın bır sey yazdırmz
        farklı olan ılk karkter ıcın ascıı tablsuna gore kac deger
        gerıde veya ılerıde old yazdırır
        tamamen aynı ıse bıze 0 dondurur


         */

        StringBuilder sb1 = new StringBuilder("Ali Can");
        StringBuilder sb2 = new StringBuilder("Bli can");

        String str = "Ali Can";

        System.out.println(sb1.compareTo(sb2)); // -1 compareto karsılastırır
        //bır sb bır strıngı compare edersk CTE verır
        // System.out.println(sb1.compareTo(str));

        System.out.println(sb1.equals(sb2));//false  ıkı farklı obje old ıcın ıcerıkler aynı olsa da false dır

        System.out.println(sb1.equals(sb1));// true ancak kendı ıle karsılatırınca true verır


        System.out.println(sb1.equals(str)); //false

       // sb1.setCharAt(3,'k'); 3.ındekstekını k ıle degıstır


    }
}
