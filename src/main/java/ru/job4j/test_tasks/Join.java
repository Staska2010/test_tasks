package ru.job4j.test_tasks;

public class Join {
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while ((i < left.length) && (j < right.length)) {
            result[index++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) {
            result[index++] = left[i++];
        }
        while (j < right.length) {
            result[index++] = right[j++];
        }
        return result;
    }
}