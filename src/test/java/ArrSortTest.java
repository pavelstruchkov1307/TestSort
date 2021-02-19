import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrSortTest {

    @Test
    public void unsortedTest() {
        int[] i = {5, -1, 2, 0, 3, 6};
        ArrSort.sort(i);
        Assertions.assertArrayEquals(new int[]{-1, 0, 2, 3, 5, 6}, i);
    }

    @Test
    public void sortedTest() {
        int[] i = {1, 2, 3, 4, 5, 6};
        ArrSort.sort(i);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, i);
    }

    @Test
    public void revSortTest() {
        int[] i = {6, 5, 4, 3, 2, 1};
        ArrSort.sort(i);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, i);
    }

    @Test
    public void equalSortTest() {
        int[] i = {6, 6, 6, 6, 6, 6};
        ArrSort.sort(i);
        Assertions.assertArrayEquals(new int[]{6, 6, 6, 6, 6, 6}, i);
    }

    @Test
    public void zeroSortTest() {
        int[] i = {1, 5, -0, 0, 3, +0};
        ArrSort.sort(i);
        Assertions.assertArrayEquals(new int[]{-0, 0, +0, 1, 3, 5}, i);
    }

    @Test
    public void unitsSortTest() {
        int[] i = {1, -1, 1, -1, 1, -1};
        ArrSort.sort(i);
        Assertions.assertArrayEquals(new int[]{-1, -1, -1, 1, 1, 1}, i);
    }

    @Test
    public void emptySortTest() {
        int[] i = {};
        ArrSort.sort(i);
        Assertions.assertArrayEquals(new int[]{}, i);
    }

    @Test
    public void oneSortTest() {
        int[] i = {5};
        ArrSort.sort(i);
        Assertions.assertArrayEquals(new int[]{5}, i);
    }




}
