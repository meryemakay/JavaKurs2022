package src.day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    public static void main(String[] args) {
/*LınkedLıst ın 2 tane parent ınterface sı vardır
lımkedLıst olusturrken data turu olarak
lınkedLıst secersk ıkı parenttekı tum methodlar
lıst secılırse sadece lıst ınterface sındekı methodlar
daque secılırse deque dekı methodları kullanabılırız


        */
        LinkedList<Integer> ll1 = new LinkedList();
        ll1.add(10); //LinkedList classından alır add

        //Sdece Lıst ınterface den ozllıkler kullnmka ıstersek
        List<Integer> ll2 = new LinkedList();
        ll2.add(10);
        ll2.remove(0);

        //sadece Deque den gelen ozellıklerı kullnalım
        Deque<Integer>ll3=new LinkedList();

        ll3.addLast(20);
        ll3.addFirst(15);

        System.out.println(ll3);//[15, 20]
ll3.addLast(40); //[15, 20 , 40]


    }
}
