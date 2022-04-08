package src.day33_VarargsStringBuilder;

public class C04_stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Yasasın java");


        System.out.println( sb1.indexOf("Java")); //-1

        System.out.println(sb1.lastIndexOf("s"));//4

        System.out.println(sb1.indexOf("s"));//2

        System.out.println(sb1.replace(0,7, "ne guzel"));// ne guzel java

        System.out.println(sb1); // ne guzel java


        System.out.println(sb1.toString().toUpperCase());//NE GUZEL JAVA

        System.out.println(sb1); //ne guzel java ..cunku tostrıng ıle strıng e cevırdık
                               // o yuzden atama yapılmadıgı ıcın degısklık olmadı


        System.out.println(sb1.delete(0,3)); // guzel java

        System.out.println(sb1.deleteCharAt(5));//guzeljava





    }
}
