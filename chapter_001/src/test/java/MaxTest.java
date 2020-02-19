import org.junit.Test;
import ru.job4j.condition.Max;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax1() {
        int result = Max.max(10, 2);
        assertThat(result, is(10));
    }
    @Test
    public void whenMax2() {
        int result = Max.max(10, 45);
        assertThat(result, is(45));
    }

    @Test
    public void whenMax1Max2() {
        int result = Max.max(50, 50);
        assertThat(result, is(50));
    }
}
