package src.day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str ="  Sız ne dersenız deyın , Java bıldıgını okur.";
        str.trim();
        System.out.println(str); //boslugu da yazdırck cunku atama yapılmadı
        System.out.println(str.length()); //46


        str=str.trim();
        System.out.println(str);
        System.out.println(str.length()); //44

        str="alı okula \ngıt alı gıt";
        System.out.println(str.trim());

    }
}
