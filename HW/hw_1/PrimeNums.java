// Задача 2. Вывести простые числа

// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.

// Пример
// 2
// 3
// 5
// 7
// 11
// ...

// 1 

package HW.hw_1;

// class PrimeNums {
//     public void printPrimeNums() {
//         boolean isPrime;
//         for (int i = 2; i < 1000; i++) {        // Проход начинается с 2, т.к. это число является наименьшим простым
//             isPrime = i == 1;
//             for (int j = 2; j < 1000; j++) {
//                 if (i >= j && i % j == 0) {
//                     if (j == i) {
//                         isPrime = true;
//                     }
//                     break;
//                 }
//             }
//             if (isPrime)
//                 System.out.println(i);
//         }
//     }
// }

// class Printer {
//     public static void main(String[] args) {
//         PrimeNums ans = new PrimeNums();
//         ans.printPrimeNums();
//     }
// }

// 2 Автотест

// class PrimeNums {
//     public void printPrimeNums() {
//         // Напишите свое решение ниже

//         // Проход начинается с 2, т.к. это число является наименьшим простым
//         for (int i = 2; i <= 1000; i++) {

//             boolean isPrime = true;

//             // Проверка, является ли число i простым
//             // Проход по циклу до корня числа,
//             // т.к. дальше нет смысла искать, делителей нет.
//             for (int j = 2; j <= Math.sqrt(i); j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             // Если число i простое, вывод его на экран
//             if (isPrime)
//                 System.out.println(i);
//         }
//     }
// }

// class Printer {
//     public static void main(String[] args) {

//         PrimeNums ans = new PrimeNums();
//         ans.printPrimeNums();
//     }
// }
