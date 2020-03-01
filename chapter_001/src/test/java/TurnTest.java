import org.junit.Test;
import ru.job4j.array.Turn;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithAmountOfElementsThenTurnedArray2614() {
        //тест, проверяющий переворот массива, например {4, 1, 6, 2}.
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithAmountOfElementsThenTurnedArray12345() {
        //тест, проверяющий переворот массива, например {1, 2, 3, 4, 5}.
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray12345() {
        //тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.backOdd(input);
        int[] expect = new int[] {5, 2, 3, 4, 1};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray12345() {
        /*
         * тест, проверяющий переворот массива с чётным числом элементов, например {1, 2, 3, 4, 5}.
         */
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.backEven(input);
        int[] expect = new int[] {1, 4, 3, 2, 5};
        assertThat(result, is(expect));
    }
}

