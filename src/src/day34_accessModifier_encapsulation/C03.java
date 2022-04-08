package src.day34_accessModifier_encapsulation;

public class C03 {

    //Encapsule edecgımız 2 varıable olsun

    private  int sayi;
    private String str;

    public int getSayi() {//okuyor sadece yazılmıyor
        return sayi;
    }

    public void setSayi(int sayi) { //deger ataması yapıyor
        this.sayi = sayi;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;



    }

    @Override
    public String toString() {
        return
                "sayi=" + sayi +
                " str=" + str ;

    }
}

