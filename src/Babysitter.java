import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Babysitter {

    public double getPay(LocalDateTime startTime, LocalDateTime endTime) {
        double payment = 0;
        for (LocalDateTime i = startTime; i.isBefore(endTime); i =  i.plus(Consts.QUARTER_HOUR, ChronoUnit.MINUTES)) {
            if (i.isBefore(Consts.NINE_OCLOCK_PM)) {
                payment += Consts.EARLY_PAY / 4;
            } else if (i.isBefore(Consts.MIDNIGHT)) {
                payment += Consts.MIDDLE_PAY / 4;
            } else {
                payment += Consts.LATE_PAY / 4;
            }
        }
        return payment;
    }
}
