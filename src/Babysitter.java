import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Babysitter {

    public double getPay(LocalDateTime startTime, LocalDateTime endTime) {
        double payment = 0;
        for (LocalDateTime i = startTime; i.isBefore(endTime); i =  i.plus(15, ChronoUnit.MINUTES)) {
            if (i.isBefore(LocalDateTime.of(2000, 1, 1, 20, 59))) {
                payment += 2.5;
            } else if (i.isBefore(LocalDateTime.of(2000, 1, 1, 23, 59))) {
                payment += 3.75;
            } else {
                payment += 5;
            }
        }
        return payment;
    }
}
