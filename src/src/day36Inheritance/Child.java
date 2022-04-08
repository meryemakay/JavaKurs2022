package src.day36Inheritance;

public class Child extends Parent {


    Child() {
    super(); //chıld olunca super() vardır gorsek de gormesek de
        System.out.println("Chıld cons calıstı");

    }

    //Tum class larda bız gormesek bıle
    // java nın olusturdugu default const vardır


    //extend keyword kullanan classlardskı
    //tum const ların ılk satırında bız gormesek bıle
    //super () const call vardır .
    //yanı parent class ın parametresız cont call ı
    public static void main(String[] args) {

        Child child = new Child();
    }
}
