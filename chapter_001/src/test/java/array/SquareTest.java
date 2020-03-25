package array;

import org.junit.Test;
import ru.job4j.array.Square;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4};
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound4Then0149() {
        int bound = 4;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9};
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound4Then014916() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9, 16};
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound4Then01491625() {
        int bound = 6;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9, 16, 25};
        assertThat(rst, is(expect));
    }
}
