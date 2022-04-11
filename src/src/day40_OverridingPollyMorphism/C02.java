package src.day40_OverridingPollyMorphism;

public class C02 extends C01 {

    @Override
    public void method2() {
        System.out.println("chıld method2");
    }

    public static void main(String[] args) {

        C02 obj = new C02(); //hem data turu hem const ıcınde bulundugumuz class ıle aynı

        obj.method1(); //once bu classa bakack sonra aprent e bakacak. parent de method1 calısacak
        obj.method2(); //child method2

        C01 obj2 = new C02();
        obj2.method1();
        obj2.method2();
    }
}
