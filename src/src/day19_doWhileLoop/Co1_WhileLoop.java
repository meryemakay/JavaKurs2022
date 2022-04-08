package src.day19_doWhileLoop;

public class Co1_WhileLoop {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin ve
        // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin


        int input=30;


        //for loop ıle de yapılabılır

        int bolen=1;
        int sayac=0;

        while (bolen<=input){

            if(input%bolen==0){
                System.out.print(bolen+" ");
                sayac++;

            }

        bolen++;

        }



        System.out.println("");
        System.out.println(input+"saysını bolen "+sayac+ "adet sayı vardır");

    }
}
