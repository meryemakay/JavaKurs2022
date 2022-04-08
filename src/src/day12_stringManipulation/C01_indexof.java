package src.day12_stringManipulation;

public class C01_indexof {

    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //		- Girilen kelime cumlede kullanilmamis.
        //		- Girilen kelime cumlede 1 kere kullanilmis.
        //		- Girilen kelime cumlede 1’den fazla kullanilmis.


        String cumle = "Java ogren, yeni program ile yeni yeni yenı  bir sayfa ac";
        String kelime = "seher";

        int ilkKullanım = cumle.indexOf(kelime); //-1 veya ındex ckar

        int ikinciKullanım = cumle.indexOf(kelime, ilkKullanım + 1);

        int ucuncukullanım=cumle.indexOf(kelime,ikinciKullanım+1);
        if (ilkKullanım == (-1)) {
            System.out.println("gırılen kelıme cumlde kullanılmamıstır");
        } else if (ikinciKullanım == (-1)) {
            System.out.println("gırılen kelıme 1 kere kullnılmıs");
        }else if(ucuncukullanım==(-1)){
            System.out.println("gıırlen kelıme 2 kere kullnılmıs");
        } else {
            System.out.println("gırılen kelıme 2 den fazla kullanılmıs");
        }


    }


}
