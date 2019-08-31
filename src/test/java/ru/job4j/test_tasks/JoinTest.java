package ru.job4j.test_tasks;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JoinTest {
    @Test
    public void whenEquivalentLength() {
        Join join = new Join();
        int[] array1 = {7, 9, 11, 13};
        int[] array2 = {2, 3, 7, 11};
        int[] expected = {2, 3, 7, 7, 9, 11, 11, 13};
        int[] output = join.merge(array1, array2);
        assertThat(output, is(expected));
    }

    @Test
    public void whenEquivalentLengthV2() {
        Join join = new Join();
        int[] array1 = {1, 7, 8, 13, 14, 15};
        int[] array2 = {2, 3, 4, 5, 6, 11};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 11, 13, 14, 15};
        int[] output = join.merge(array1, array2);
        assertThat(output, is(expected));
    }

    @Test
    public void whenEquivalentLengthV3() {
        Join join = new Join();
        int[] array1 = {15, 18, 21};
        int[] array2 = {2, 3, 4};
        int[] expected = {2, 3, 4, 15, 18, 21};
        int[] output = join.merge(array1, array2);
        assertThat(output, is(expected));
    }

    @Test
    public void whenEquivalentLengthV4() {
        Join join = new Join();
        int[] array1 = {2, 3, 4};
        int[] array2 = {10, 11, 13};
        int[] expected = {2, 3, 4, 10, 11, 13};
        int[] output = join.merge(array1, array2);
        assertThat(output, is(expected));
    }

    @Test
    public void testFromTask() {
        Join join = new Join();
        int[] array1 = {1, 3};
        int[] array2 = {2, 4};
        int[] expected = {1, 2, 3, 4};
        int[] output = join.merge(array1, array2);
        assertThat(output, is(expected));
    }

    @Test
    public void whenFirstArrayGreater() {
        Join join = new Join();
        int[] array1 = {2, 4, 8, 11, 15, 17, 21};
        int[] array2 = {2, 6, 7};
        int[] expected = {2, 2, 4, 6, 7, 8, 11, 15, 17, 21};
        int[] output = join.merge(array1, array2);
        assertThat(output, is(expected));
    }

    @Test
    public void whenSecondArrayGreater() {
        Join join = new Join();
        int[] array1 = {2, 6, 7};
        int[] array2 = {2, 4, 8, 11, 15, 17, 21};
        int[] expected = {2, 2, 4, 6, 7, 8, 11, 15, 17, 21};
        int[] output = join.merge(array1, array2);
        assertThat(output, is(expected));
    }
}
