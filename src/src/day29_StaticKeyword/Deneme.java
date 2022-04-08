package src.day29_StaticKeyword;

public class Deneme {

        int x;
        static int y;
        Deneme(int i) {
            x+=i;
            y+=i;
        }
        public static void main(String[] args) {
            new Deneme(2);// bir tur constructor call olabilr.
            // bu constructor calismis ama bir variable'a atanmamis
            //sonucu atayabilecegi bir obje olmadigindan havada kalir
            // x'i 2 artirir ama havada kalir cunku static degil
            // y'yi 2 artirir ama kalici olur cunku y static
            Deneme dnm=new Deneme(3);
            // objeye bagli olarak x 3 artar, y daha once 2 idi 3 artar 5 olur
            System.out.println(dnm.x+","+dnm.y);// 3,5 yazdirir
        }

}
