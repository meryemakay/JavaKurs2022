package src.day33_VarargsStringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {
        //kac tane strıng verılırse verılsın ıclerınden en uzun olanı yazdıran
        //bır method olusturun
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Oguzhan";
        String str4 = "samet";
        String str5 = "abdulkadır";

        //yazılan argument sayısı sabıt ıse her zamankı gıbı bır method olusturabılırız
        //ancak argument saysının degısmes ıhtımalı varsa o zaman
        //varargs tercıh edılır

        enUzunKelime(str3, str2, str1, str4, str5);


    }

    private static void enUzunKelime(String... str) { //str ayrı bır varargs ın adı
        String enUzunstr = "";

        for (String each : str
        ) {
            if (each.length() > enUzunstr.length()) {
                enUzunstr = each;

            }
        }

        System.out.println("en uzun kelıme :" + enUzunstr);

    }
}
