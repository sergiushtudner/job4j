package array;

import org.junit.Test;
import ru.job4j.array.Min;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        assertThat(
                Min.findMin(
                        new int[] {0, 5, 10}
                ),
                is(0)
        );
    }
    @Test
    public void whenLastMin() {
        assertThat(
                Min.findMin(
                        new int[] {10, 5, 3}
                ),
                is(3)
        );
    }
    @Test
    public void whenMiddleMin() {
        assertThat(
                Min.findMin(
                        new int[] {10, 2, 5}
                ),
                is(2)
        );
    }
    @Test
    public void whenMin() {
        assertThat(
                Min.findMin(
                        new int[] {2,5,78,1,8,345,78,45,9}
                ),
                is(1)
        );
    }
}