// Задание №2
// Дан массив двоичных чисел (байты), например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.
package sem_1;
public class MaxCountOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1};

        int max = getCountOnes(arr);
        System.out.println(max);

    }

    private static int getCountOnes(int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count ++;                
            }
            else {
                count = 0;
            }
            // if (count > max) {                                             // 1
            //     max = count;
            // }
            // max = count > max ? count: max; // тернарный оператор          // 2
            max = Math.max(max, count); // встроенная функция                 // 3
        }
        return max;
    }
}
// Рефакторинг
// Реализуем разработку с помощью методов (функций), используя возможности среды разработки
// 1. отделяем пробелом исходные данные
// 2. выделяем тело метода до вывода в консоль
// 3. нажимаем на лампочку -> extract to method
// 4. меняем названия 
