package utils;

import java.util.Arrays;
import java.util.Random;

public class Calculate {

    public static int getMax(int[] nums) {
        int maxNum = nums[0];
        for (int i : nums) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        return maxNum;
    }

    public static int getMin(int[] nums) {
        int minNum = nums[0];
        for (int i : nums) {
            if (i < minNum) {
                minNum = i;
            }
        }
        return minNum;
    }

    public static int getSumOfArrayElements(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum = sum + i;
        }
        return sum;
    }


    public static double getEverage(int[] nums) {

        double everage = (double)(getMax(nums) + getMin(nums) + getSumOfArrayElements(nums))/3;
        return everage;
    }

    public static void main(String[] args) {


        int[] nums = RandomData.generateArray();
        System.out.println("Массив: " + Arrays.toString(nums));
        System.out.println("Максимальное значение массива: " + getMax(nums));
        System.out.println("Минимальное значение массива: " + getMin(nums));
        System.out.println("Сумма элементов массива: " + getSumOfArrayElements(nums));
        System.out.println("Среднее значение min, max и sum массива: " + getEverage(nums));





    }
}
