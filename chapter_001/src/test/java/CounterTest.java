import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenNumbersFromTwoToTwentyThenHundredTen() {
        int rsl = Counter.sumByEven(2, 20);
        int expected = 110;
        assertThat(rsl, is(expected));
    }
}
