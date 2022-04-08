package src.day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {

        String str = "Java gun gectıkce guzellesıyor";
        String kelımler[] = str.split(" ");

        System.out.println(Arrays.toString(kelımler)); //
       System.out.println(kelımler[1]);

        String gectıkce[]=str.split("gectıkce");
      System.out.println(Arrays.toString(gectıkce));


        String harfler[] = str.split("");
        System.out.println(Arrays.toString(harfler));

    }
}
