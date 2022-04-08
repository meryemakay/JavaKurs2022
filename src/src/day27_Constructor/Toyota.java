package src.day27_Constructor;

public class Toyota {
    //objenın olusturulacagı class ta maın olusturmuyoruz
    String marka = "Toyota";
    String model;
    int tekerAdedi = 4;   //bunlar ınstance verıabledır objeye ozeldır.
    boolean motoruVarMı = true;
    String yakıt;
    int yil;

public void  maxHiz(){
    if(yakıt.equals("Benzin")){
        System.out.println("Benzinli araclar max 240 km yapar");

    }else if(yakıt.equals("Dizel")){
        System.out.println("Dizel araclar max 260 km hiz yapar");
    }
}

public void renkTercileri() {
    if(model.equals("Corolla")){
        System.out.println("Corolla renk seceneklerı kırmızı ve beyaz");
    }else if(model.equals("Yaris")){
        System.out.println("Yaris renk seceneklerı sarı ve lacıvert");
    }
}

}
