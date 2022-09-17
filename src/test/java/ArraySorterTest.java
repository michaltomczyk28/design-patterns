import com.michaltomczyk.ArraySorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySorterTest {
    @Test
    void shouldSortArrayAscending() {
        int[] data = { 5, 2, 3, 4, 1};
        int[] expected = {1, 2, 3, 4, 5};

        ArraySorter arraySorter = new ArraySorter();
        int[] result = arraySorter.sort(data, true);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void shouldSortArrayDescending() {
        int[] data = { 5, 2, 3, 4, 1};
        int[] expected = {5, 4, 3, 2, 1};

        ArraySorter arraySorter = new ArraySorter();
        int[] result = arraySorter.sort(data, false);

        Assertions.assertArrayEquals(expected, result);
    }
}
