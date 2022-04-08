package src.day08_ifEleseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        //gırılen bır karaktrn harf olup olmdıgını bulalım

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir karakter gırınız");
        char karakter=scan.next().charAt(0);


        if ((karakter>='A' && karakter<='Z')  || (karakter>='a' && karakter<='z')){
            System.out.println("Girdiginiz karakter harf");
        } else {
            System.out.println("Girdiginiz karakter harf degil");


        }
    }
}







