package src.day18_NestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan ıkı tam sayı alıp
        //bu sayıları ve aralarındakı sayıları yazan bır kod olusturun
        int baslangıc=40;
        int bıtıs=60;


        for(int i=baslangıc;i<=bıtıs;i++){
            System.out.print(i+" ");
        }


        System.out.println("");
//aynı soruyu whıle loop ıle yapalım
int i=baslangıc;
     while(i<=bıtıs){
         System.out.print(i+" ");
         i++;

     }
        System.out.println("");
        System.out.println(baslangıc); //40


    }
}
