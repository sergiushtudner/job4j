package array;

import org.junit.Test;
import ru.job4j.array.Check;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
    @Test
    public void whenDataMonoOddByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.monoOdd(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenDataNotMonoOddByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.monoOdd(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenDataMonoEvenByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.monoEven(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenDataNotMonoEvenByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.monoEven(input);
        assertThat(result, is(false));
    }
}