package src.day18_NestedForLoop;

public class nestedforpratıce {
    public static void main(String[] args) {

        char input=90;
        for (char i=65; i<=input; i++) {
            for (char j=65; j<=i ; j++){
                System.out.print(j + " ");

            }
            System.out.println("");

        }

    }
}
