import org.junit.Test;
import ru.job4j.condition.SqMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenSqMax6475() {
        int expected = 50;
        int s = SqMax.max(50, 50, 7, 10);
//          int s = SqMax.max( 6, 4, 7, 5);
        assertThat(s, is(expected));
    }
}
