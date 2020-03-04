package array;

import org.junit.Test;
import ru.job4j.array.SortSelected;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort34125() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort341() {
        int[] input = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort841026() {
        int[] input = new int[] {8, 4, 10, 2, 6};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 4, 6, 8, 10};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort34102581() {
        int[] input = new int[] {3, 4, 10, 2, 5, 8, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 8, 10};
        assertThat(result, is(expect));
    }
}