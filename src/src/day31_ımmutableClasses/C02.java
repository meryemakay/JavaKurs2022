package src.day31_ımmutableClasses;

public class C02 {
    public static void main(String[] args) {


        String a = "";
        a += 2;
        a += 'c'; //"2c"
        a += false ; //"2cfalse"

        if (a == "2cfalse") {
            System.out.println("==");
        }
            if (a.equals(("2cfalse"))) {
                System.out.println("equals");
        }

            String b="2cfalse";

        if (b == "2cfalse") {
            System.out.println("==");
        }
        if (b.equals(("2cfalse"))) {
            System.out.println("equals");
        }
    }
}