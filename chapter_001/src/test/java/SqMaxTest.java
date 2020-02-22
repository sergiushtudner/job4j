import org.junit.Test;
import ru.job4j.condition.SqMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenSqMax6475() {
        int expected = 7;
        int s = SqMax.max( 6, 4, 7, 5);
        assertThat(s, is(expected));
    }
    @Test
    public void whenSqMax7465() {
        int expected = 7;
        int s = SqMax.max(7, 4, 6, 5);
        assertThat(s, is(expected));
    }
    @Test
    public void whenSqMax6745() {
        int expected = 7;
        int s = SqMax.max( 6, 7, 4, 5);
        assertThat(s, is(expected));
    }
    @Test
    public void whenSqMax6457() {
        int expected = 7;
        int s = SqMax.max( 6, 4, 5, 7);
        assertThat(s, is(expected));
    }
}
