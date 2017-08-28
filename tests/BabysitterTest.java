import org.junit.Test;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static junit.framework.TestCase.assertEquals;

public class BabysitterTest {
    Babysitter sitter = new Babysitter();
    LocalDateTime time = Consts.BASE_TIME;

    @Test
    public void whenBabySitterWorksFromFiveToSixTheyArePaidTenDollars() {
        assertEquals(Consts.EARLY_PAY, sitter.getPay(time.plusHours(17), time.plusHours(18)));
    }

    @Test
    public void whenBabySitterWorksFromFiveToNineTheyArePaidFourtyDollars() {
        assertEquals(Consts.EARLY_PAY * 4, sitter.getPay(time.plusHours(17), time.plusHours(21)));
    }

    @Test
    public void whenBabySitterWorksFromNineToTenTheyArePaidFifTeenDollars() {
        assertEquals(Consts.MIDDLE_PAY, sitter.getPay(time.plusHours(21), time.plusHours(22)));
    }

    @Test
    public void whenBabySitterWorksFromNineToTwelveTheyArePaidFourtyFiveDollars() {
        assertEquals(Consts.MIDDLE_PAY * 3, sitter.getPay(time.plusHours(21), time.plusHours(24)));
    }

    @Test
    public void whenBabySitterWorksFromTwelveToOneTheyArePaidTwentyDollars() {
        assertEquals(Consts.LATE_PAY, sitter.getPay(time.plusHours(24), time.plusHours(1+24)));
    }

    @Test
    public void whenBabySitterWorksFromTwelveToFourTheyArePaidEightyDollars() {
        assertEquals(Consts.LATE_PAY * 4, sitter.getPay(time.plusHours(24), time.plusHours(4+24)));
    }

    @Test
    public void whenBabySitterWorksFromFiveToTwelveTheyArePaidEightyFiveDollars() {
        assertEquals((Consts.EARLY_PAY * 4 + Consts.MIDDLE_PAY * 3),
                sitter.getPay(time.plusHours(17), time.plusHours(24)));
    }

    @Test
    public void whenBabySitterWorksFromFiveToFourTheyArePaidOneHundredSixtyFiveDollars() {
        assertEquals((Consts.EARLY_PAY * 4 + Consts.MIDDLE_PAY * 3 + Consts.LATE_PAY * 4),
                sitter.getPay(time.plusHours(17), time.plus(28, ChronoUnit.HOURS)));
    }

    @Test
    public void whenBabySitterWorksFromFiveToFiveThirtyTheyArePaidFiveDollars() {
        assertEquals(Consts.EARLY_PAY / 2, sitter.getPay(time.plusHours(17), time.plus((60*17 + 30), ChronoUnit.MINUTES)));
    }
}
