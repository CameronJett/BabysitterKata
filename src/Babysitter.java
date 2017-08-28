import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Babysitter {

    public double getPay(LocalDateTime startTime, LocalDateTime endTime) {
        BigDecimal payment = new BigDecimal(0);
        for (LocalDateTime i = startTime; i.isBefore(endTime); i =  i.plus(Consts.MINUTE, ChronoUnit.MINUTES)) {
            if (i.isBefore(Consts.NINE_OCLOCK_PM)) {
                payment = calculatePay(payment, Consts.EARLY_PAY, Consts.MINUTES_PER_HOUR);
            } else if (i.isBefore(Consts.MIDNIGHT)) {
                payment = calculatePay(payment, Consts.MIDDLE_PAY, Consts.MINUTES_PER_HOUR);
            } else {
                payment = calculatePay(payment, Consts.LATE_PAY, Consts.MINUTES_PER_HOUR);
            }
        }
        return payment.doubleValue();
    }

    private BigDecimal calculatePay(BigDecimal currentPayment, double ratePerHour, int time) {
        return currentPayment.add(new BigDecimal(ratePerHour / time));
    }


}
