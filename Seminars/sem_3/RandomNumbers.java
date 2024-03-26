// Задание №1
// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.

package sem_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomNumbers {
public static void main(String[] args) {
int num = 10;

List<Integer> arr = getRandomNumbers(num);

System.out.println(arr);

Collections.sort(arr);

System.out.println(arr);
}

private static List<Integer> getRandomNumbers(int num) {
List<Integer> arr = new ArrayList<>();
for (int i = 0; i < num; i++) {
int random = (int) (Math.random() * 100);
arr.add(random);
}
return arr;
}
}