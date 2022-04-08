package src.day16_Method_Creation;

public class C04_ForLoop {

    public static void main(String[] args) {

        //verılen strıngı tersten yazdıran bır kod yazdrın
        String str = "Valla bu Java cok zevklı";

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.substring(i,i+1));

        }
    }
}