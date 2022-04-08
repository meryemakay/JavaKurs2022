package src.day18_NestedForLoop;

import java.util.Random;

public class practice {
    public static void main(String[] args) {

        Random random = new Random();
        int sayac=1;
        while(true){
            int randomSayi = random.nextInt(122)+16;
            if(randomSayi == 16){
                System.out.println("Çalıştırılan program "+ sayac+" deneme gerçekleştirdikten sonra 16 değerine ulaştı.");
                break;
            }
            sayac++;
        }
    }

    }

