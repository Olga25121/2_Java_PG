/*
Задание №1
1. Напишите метод, который заполнит массив из 1000 элементов случайными
цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с
помощью Set вычислите процент уникальных значений в данном массиве и
верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее
количество чисел в массиве.
*/
package sem_6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PercentOfUniqueNumbers {
    public static void main(String[] args) {
        int size = 1000;
        int maxNum = 500;
        int[] array = new int[size];
        fillUpArray(array, maxNum);

        System.out.println(getPercentUnicNums(array));
    }
    public static void fillUpArray(int[] arr, int max){
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(max);
        }
    }
    public static double getPercentUnicNums(int[] arr){
        Set<Integer> numsSet = new HashSet<>();
        for (Integer integer : arr) {
            numsSet.add(integer);
        }
        double percent = numsSet.size() * 100.0/arr.length;

        return percent;
    }
}