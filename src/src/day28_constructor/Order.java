package src.day28_constructor;

public class Order {


        String value = "a";


        Order() {

            value = value + "b";

        }

        Order(String c) {

            value = value + c;

        }

        public static void main(String[] args) {


//Order order = new Order("f");
           // System.out.println(order.value);


       //     Order order = new Order();
         //   System.out.println(order.value);


            Order order = new Order("r");
            System.out.println(order.value);


        }
    }

