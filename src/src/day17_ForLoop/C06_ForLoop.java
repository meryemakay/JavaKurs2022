package src.day17_ForLoop;

public class C06_ForLoop {
    public static void main(String[] args) {
        //verılen ıkı harf ve aralarındakı harflerı yazdıran
        //bır kod yazınız


        char ilkHarf='c';
        char sonHarf='s';

        for(char i=ilkHarf; i<=sonHarf;i++){
            System.out.print(i+" ");

        }

   double baslangıc=10;
        double bitiş=20;
        double artıs=0.2;

        for(double i=baslangıc; i<=bitiş;i+=artıs){
            System.out.print(i + " ");
        }


    }
}
