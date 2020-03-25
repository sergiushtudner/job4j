
import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int expected = 120;
        int s = Factorial.calc(5);
        assertThat(s, is(expected));
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int s = Factorial.calc(0);
        assertThat(s, is(expected));
    }
}
