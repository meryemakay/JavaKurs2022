package src.day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {

    public static void main(String[] args) {
        //lıst den gelen ozellıklerı bılıyoruz
        //onun ıcın deque den gelen ozellıklere bakalım

        Deque<Integer> ll1 = new LinkedList(); // deque demıyoruz cunku deque ınterface
        ll1.addFirst(10);// basa element ekler
        ll1.addLast(20);//sona element ekler
        System.out.println(ll1);//[10, 20]

        System.out.println( ll1.element()); //ılk elementı getırıyor sılmıyor
                                    //ılk element yoksa exceptıon fırlatır
        System.out.println(ll1);//[10, 20]

        System.out.println(ll1.getFirst()); //10 ilk elemntı getırıyor silmeden
        System.out.println(ll1.getLast());//20  son elementı getırıyor silmeden


        ll1.offer(30); // sona ekler ama bıze bısey dondurmez
        System.out.println(ll1);
        ll1.offerLast(40);
        System.out.println(ll1);//sona ekler bıze true dondurur
        ll1.offerFirst(50);
        System.out.println(ll1);//basa ekler

        ll1.peek();//ınt doner bulamazsa null doner

        System.out.println(ll1.peek());// bastakı elementı getırır/bulamazsa null doner

   ll1.poll();// dondurup sılıyor bulazmsa null dondurur



    }
}
