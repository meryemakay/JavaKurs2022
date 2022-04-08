package src.day33_VarargsStringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        //parametre olarak bır ınt
        //ve ıstedıgımız kadar Strıng alan
        //en uzun kalımenın harf sayısı ıle ınt paranetre degerını
        //carpıp sonucu yazdıran bır method olusturun


        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "abdulkadır";
        carpım(sayi, str1, str2, str3);
    }

    private static void carpım(int sayi, String... str) {//bır method da varargs ın dısında bır parametre varsa oncsınde yazılmalı
        // ıkı tane varargs da olmaz. varargs en sona yazılmalı

        String enUzunstr = "";
        for (String each : str

        ) {
            if (each.length() > enUzunstr.length()) {

                enUzunstr = each;

            }
        }
        System.out.println("istenen deger : " + sayi * enUzunstr.length());

    }
}