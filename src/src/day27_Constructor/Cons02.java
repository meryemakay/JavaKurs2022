package src.day27_Constructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1 = new Cons01(); //default cont devrede


        //Cons1 clasında hıc constructor olusturmazsak Java default constructor ı kullandıgından
        //obj1 ı uretebılırız
        //ancak bız parametrelı veya parametresız bır constructor yazdıgımzda
        //java default constructor ı sıler


        //dolayısıyla bız herhangı bır constructor olusturdıgumzda
        //daha once baska claslar veya kullanıcıların
        //olusturmus olabılecegı objelerı kullanabılmelrı ıcın
        //default constructor ın ıslevını gerceklestırecek
        //parametresız bır constructor olusturmakta fayda var

        Cons01 obj2 = new Cons01("java");
    }
}
