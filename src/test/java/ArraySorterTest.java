import com.michaltomczyk.ArrayBubbleSorter;
import com.michaltomczyk.ArraySelectionSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraySorterTest {
    @Test
    void shouldBubbleSortArrayAscending() {
        int[] data = { 5, 2, 3, 4, 1};
        int[] expected = {1, 2, 3, 4, 5};

        ArrayBubbleSorter arraySorter = new ArrayBubbleSorter();
        int[] result = arraySorter.sort(data, true);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void shouldBubbleSortArrayDescending() {
        int[] data = { 5, 2, 3, 4, 1};
        int[] expected = {5, 4, 3, 2, 1};

        ArrayBubbleSorter arraySorter = new ArrayBubbleSorter();
        int[] result = arraySorter.sort(data, false);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void shouldSelectionSortArrayAscending() {
        int[] data = { 5, 2, 3, 4, 1};
        int[] expected = {1, 2, 3, 4, 5};

        ArraySelectionSorter arraySorter = new ArraySelectionSorter();
        int[] result = arraySorter.sort(data, true);
        System.out.println(Arrays.toString(result));

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void shouldSelectionSortArrayDescending() {
        int[] data = { 5, 2, 3, 4, 1};
        int[] expected = {5, 4, 3, 2, 1};

        ArrayBubbleSorter arraySorter = new ArrayBubbleSorter();
        int[] result = arraySorter.sort(data, false);

        Assertions.assertArrayEquals(expected, result);
    }
}
