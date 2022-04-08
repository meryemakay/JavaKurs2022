package src.day27_Constructor;

public class Volvo {

//obje bu class da olusturuldu

    String marka="Volvo";//bu ıkı deegr her araba ıcın ortak
    String mensei="Isvec";

    String model;
    boolean elektrikliMi;//bu dort her araba ıcın degısır
    int yil;
    String yakit;

    boolean otomatikPilot=otomatikPilotSorgusu();
    int maxHiz=maxHizAta(); //bu ıkı ozllık de baska ozelılklere gore


    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektrikliMi=elk;
        yil=yl;
        yakit=ykt;
        maxHiz=maxHizAta();
        otomatikPilot=otomatikPilotSorgusu();
    }
    public Volvo(){  //parametresız constructor
                     //bunu olusturmaız lazım kı default a baz alıp
        //calısanlar caslısmaya devam etsın
    }

    public int maxHizAta() {
        int maxHiz=0;
        if (elektrikliMi){
            maxHiz=160;
        }else {
            maxHiz=240;
        }
        return maxHiz;
    }
    public boolean otomatikPilotSorgusu() {
        boolean sonuc=false;
        if(elektrikliMi){
            sonuc=true;
        }
        return sonuc;
    }
    public String toString(){
        String arabaOzellikleri= "Model : " + model +
                                " Yakit : " + yakit +
                                " Max Hiz : " +maxHiz;
        return arabaOzellikleri;
    }
}



