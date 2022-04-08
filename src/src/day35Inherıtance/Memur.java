package src.day35Inherıtance;

public class Memur extends Personel{
    public static void main(String[] args) {

        Memur objmemur = new Memur();

        objmemur.isim="Tugba";
        objmemur.soyisim="Akdenız";
        objmemur.adres="İstanbul";
        System.out.println(objmemur.soyisim);

        System.out.println(objmemur.isim);
    }
}
