package src.day14_stringManipulation;

public class C04_IsıimGizleme {

    public static void main(String[] args) {
       /*Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        yazdirin
        isim-soyisim : M***** B*******
        kart no : **** **** **** 1234 */

        String isim = "meryem";
        String soyısım = "AKAY";
        String kKno = "1234567890123456";

        String yenıısım = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\S", "*");


        String yenısoyısım = soyısım.substring(0, 1).toUpperCase() +
                soyısım.substring(1).replaceAll("\\S", "*");

        String yenıkkno = "**** **** **** " + kKno.substring(12);

        System.out.println("ısım soyısım :" + yenıısım +" " + yenısoyısım+
                "\nkart no: " + yenıkkno);
    }

}
