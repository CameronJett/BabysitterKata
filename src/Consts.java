import java.time.LocalDateTime;

public final class Consts {
    public static final int YEAR = 2000;
    public static final int MONTH = 1;
    public static final int DAY = 1;

    public static final int MINUTE = 1;
    public static final int MINUTES_PER_HOUR = 60;

    public static final LocalDateTime BASE_TIME = LocalDateTime.of(YEAR, MONTH, DAY, 0, 0);
    public static final LocalDateTime NINE_OCLOCK_PM = LocalDateTime.of(YEAR, MONTH, DAY, 21, 0);
    public static final LocalDateTime MIDNIGHT = LocalDateTime.of(YEAR, MONTH, DAY+1, 0, 0);

    public static final double EARLY_PAY = 10;
    public static final double MIDDLE_PAY = 15;
    public static final double LATE_PAY = 20;
}
