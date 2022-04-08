package src.day18_NestedForLoop;

public class C03_NestedForLoop {

    public static void main(String[] args) {
      /* Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        *
        * *
        * * *
        * * * *  */


        int input=5;

        for (int i=1; i<=input; i++) {


            for (int j=1; j<=i;j++){   //j<=input olursa dıkdortgn formtı olur

                System.out.print("* ");
            }

            System.out.println("");
        }



    }
}

