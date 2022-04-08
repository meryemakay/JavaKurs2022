package src.day17_ForLoop;

public class C08_Palindrome {

    public static void main(String[] args) {

        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini
        //kontrol eden bir method yazin.

        String input="Mada";

        palindromeKontrolEt(input);

    }

    private static void palindromeKontrolEt(String input) {
        String terstenİnput="";
        for(int i=input.length()-1; i>=0; i--){
            terstenİnput+=input.charAt(i);
        }
        System.out.println("gırdıgınız kelımenın tersten yazlısı:"+ terstenİnput);
   if(input.equalsIgnoreCase(terstenİnput)){
       System.out.println("gırdıgınız kelıme palındrome");
   }else{
       System.out.println("gırdıgınız kelıme palındrome degıl");
   }

    }
}
