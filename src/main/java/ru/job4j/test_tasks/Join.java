package ru.job4j.test_tasks;

public class Join {
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        System.arraycopy(left, 0, result, 0, left.length);
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length + i; j++) {
                if (right[i] <= result[j]) {
                    System.arraycopy(result, j, result, j + 1, left.length + i - j);
                    result[j] = right[i];
                    break;
                } else if (j == (left.length + i - 1)) {
                    result[j + 1] = right[i];
                }
            }
        }
        return result;
    }
}
