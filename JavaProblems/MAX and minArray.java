// Arrays/MaxMinElement.java
public class MaxMinElement {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 22, 7};
        int max = arr[0], min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
