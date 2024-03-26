package sem_1;
import java.util.Arrays;

// Задание №3
// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

public class MoveToEndArray {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3, 3, 3, 2, 3, 4, 3, 3 };
        int val = 3;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            while (nums[right] == val && left < right) { // нашли правый элемент не равный 3
                right--;
            }

            if (nums[left] == val) {
                nums[left] = nums[right];
                nums[right] = val; // заменили элемент на 3
                right--;
            }
            left++;
        }
        for (int i = 0; i < nums.length; i++) {

        }
        System.out.println();
        System.out.println(Arrays.toString(nums));
        System.out.println();
    }

}