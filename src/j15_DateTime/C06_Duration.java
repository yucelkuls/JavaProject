package j15_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {
        LocalTime night = LocalTime.of(00,00);
        LocalTime day = LocalTime.of(12,30);
        Duration dff1=Duration.between(night,day);
        Duration dff2=Duration.between(day,night);
        System.out.println("dff1 = " + dff1); //  PT12H30M
        System.out.println("dff2 = " + dff2); // PT-12H-30M
        System.out.println("dff2.getSeconds() = " + dff2.getSeconds()); // -45000

    }
}
