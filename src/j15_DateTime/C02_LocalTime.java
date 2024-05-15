package j15_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        // LocalTime  -> sadece saat-dakika-saniye datatlarını tutar(stored)
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);

        System.out.println("now.getHour() = " + now.getHour());
        System.out.println("now.getMinute() = " + now.getMinute());
        System.out.println("now.getSecond() = " + now.getSecond());
        System.out.println("now.getNano() = " + now.getNano());
        System.out.println("now.toSecondOfDay() = " + now.toSecondOfDay());

        LocalTime hour1 = LocalTime.of(9,43,21,1907);
        LocalTime hour2 = LocalTime.of(9,43);
        LocalTime hour3 = LocalTime.of(19,10,21);

        System.out.println("now.plusMinutes(36).minusHours(12) = " + now.plusMinutes(36).minusHours(12));
        LocalTime loopStart = LocalTime.now();
        System.out.println("loopStart.getNano() = " + loopStart.getNano());
        int total = 0;
        for (int i = 0; i < 10000; i++) {
            total+=i;
        }
        LocalTime finishLoop= LocalTime.now();
        System.out.println("finishLoop.getNano() = " + finishLoop.getNano());
        System.out.println("Loop run hizi : "+ (finishLoop.getNano()-loopStart.getNano()));

    }
}
