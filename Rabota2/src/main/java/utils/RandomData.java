package utils;

import java.util.Arrays;
import java.util.Random;
public class RandomData {

    public static int[] generateArray() {
        Random ran = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(100);

        }
//        System.out.println(array.length);
        return array;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateArray()));

    }

}
