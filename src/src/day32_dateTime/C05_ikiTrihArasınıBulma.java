package src.day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikiTrihArasınıBulma {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dogumgunu=LocalDate.of(1991,07,20);
        System.out.println(Period.between(dogumgunu,bugun));//P30Y8M11D

        System.out.println(Period.between(dogumgunu,bugun).getYears());//30

        //System.out.println(  // FIXME: 31.03.2022 );

    }
}
