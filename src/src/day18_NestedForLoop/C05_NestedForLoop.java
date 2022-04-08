package src.day18_NestedForLoop;

public class C05_NestedForLoop {

    /*
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F
    seklınde yazdırınız 65=Anın ascıı degerıdır
     */

    public static void main(String[] args) {

        char input='L';

        for (char i='A'; i<=input;i++){
            for (char j='A'; j<=i;j++){
                System.out.print(j+" ");



            }

            System.out.println("");     //alt satıra gecmesı ıcın bunu yapmak lazım
        }


    }
}
