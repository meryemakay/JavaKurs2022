package src.day17_ForLoop;

public class C04_ForLoop {
    public static void main(String[] args) {
        for (int i = 10; i <= 30; i++) {
            if (i < 30) {
                System.out.print(i + " , ");

            } else System.out.print(i);

        }

     int baslangıc=15;
        int bıtıs=20;
        for (int i = baslangıc; i <=bıtıs;i++){

        if(i<bıtıs){
                System.out.print(i + " ,");
            }else
            System.out.print(i);

        }
    }
}