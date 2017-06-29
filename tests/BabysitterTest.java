import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BabysitterTest {
    Babysitter sitter = new Babysitter();
    LocalDateTime time = LocalDateTime.of(2000, 1, 1, 0, 0);

    @Test
    public void whenBabySitterWorksFromFiveToSixTheyArePaidTenDollars() {
        assertEquals(10, sitter.getPay(time.plusHours(17), time.plusHours(18)));
    }

    @Test
    public void whenBabySitterWorksFromFiveToNineTheyArePaidFourtyDollars() {
        assertEquals(40.00, sitter.getPay(time.plusHours(17), time.plusHours(21)));
    }

    @Test
    public void whenBabySitterWorksFromNineToTenTheyArePaidFifTeenDollars() {
        assertEquals(15.00, sitter.getPay(time.plusHours(21), time.plusHours(22)));
    }

    @Test
    public void whenBabySitterWorksFromNineToTwelveTheyArePaidFourtyFiveDollars() {
        assertEquals(45.00, sitter.getPay(time.plusHours(21), time.plusHours(24)));
    }

    @Test
    public void whenBabySitterWorksFromTwelveToOneTheyArePaidTwentyDollars() {
        assertEquals(20.00, sitter.getPay(time.plusHours(24), time.plusHours(1+24)));
    }

    @Test
    public void whenBabySitterWorksFromTwelveToFourTheyArePaidEightyDollars() {
        assertEquals(80.00, sitter.getPay(time.plusHours(24), time.plusHours(4+24)));
    }

    @Test
    public void whenBabySitterWorksFromFiveToTwelveTheyArePaidEightyFiveDollars() {
        assertEquals(85.00, sitter.getPay(time.plusHours(17), time.plusHours(24)));
    }

    @Test
    public void whenBabySitterWorksFromFiveToFourTheyArePaidOneHundredSixtyFiveDollars() {
        assertEquals(165.00, sitter.getPay(time.plusHours(17), time.plus(28, ChronoUnit.HOURS)));
    }

    @Test
    public void whenBabySitterWorksFromFiveToFiveThirtyTheyArePaidFiveDollars() {
        assertEquals(5, sitter.getPay(time.plusHours(17), time.plus((60*17 + 30), ChronoUnit.MINUTES)));
    }

}
