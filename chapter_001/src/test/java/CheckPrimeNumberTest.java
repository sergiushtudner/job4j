
import org.junit.Test;
import ru.job4j.loop.CheckPrimeNumber;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when69() {
        boolean rsl = CheckPrimeNumber.check(69);
        assertThat(rsl, is(false));
    }
    @Test
    public void when42() {
        boolean rsl = CheckPrimeNumber.check(42);
        assertThat(rsl, is(false));
    }
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }
    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }
    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }
}