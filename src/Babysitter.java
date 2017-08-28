import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Babysitter {

    public double getPay(LocalDateTime startTime, LocalDateTime endTime) {
        BigDecimal pay = new BigDecimal(0);
        for (LocalDateTime i = startTime; i.isBefore(endTime); i =  i.plus(Consts.MINUTE, ChronoUnit.MINUTES)) {
            if (i.isBefore(Consts.NINE_OCLOCK_PM)) {
                pay = pay.add(new BigDecimal(Consts.EARLY_PAY / 60));
            } else if (i.isBefore(Consts.MIDNIGHT)) {
                pay = pay.add(new BigDecimal(Consts.MIDDLE_PAY / 60));
            } else {
                pay = pay.add(new BigDecimal(Consts.LATE_PAY / 60));
            }
        }
        return pay.doubleValue();
    }
}
