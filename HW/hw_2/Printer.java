// // // 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации
// // // запишите в лог-файл.
// // Пример

// // arr = new int[]{9, 4, 8, 3, 1};
// // sort(arr)

// // // При чтении лог-файла получим:
// // 2023-05-19 07:53 [4, 8, 3, 1, 9]
// // 2023-05-19 07:53 [4, 3, 1, 8, 9]
// // 2023-05-19 07:53 [3, 1, 4, 8, 9]
// // 2023-05-19 07:53 [1, 3, 4, 8, 9]
// // 2023-05-19 07:53 [1, 3, 4, 8, 9]

// package HW.hw_2;
// // import java.io.IOException;
// // import java.util.Arrays;
// // import java.util.logging.FileHandler;
// // import java.util.logging.Logger;
// // import java.util.logging.SimpleFormatter;

// import java.io.File;
// import java.io.FileWriter;

// // import java.io.File;
// // import java.io.FileWriter;

// // class BubbleSort {
// //     // Создание логгера с нужным форматом вывода
// //     private static Logger logger = null;

// //     static {
// //         System.setProperty("java.util.logging.SimpleFormatter.format",
// //                 "%1$tF %1$tR %5$s %n");
// //         logger = Logger.getLogger(BubbleSort.class.getName());
// //     }

// //     public void sort(int[] mas) {

// //         configureLogger();
// //         bubbleSort(mas);
// //     }

// //     private int[] bubbleSort(int[] mas) {
// //         boolean isSorted = false;
// //         int buffer;

// //         while (!isSorted) {
// //             isSorted = true;
// //             for (int i = 0; i < mas.length - 1; i++) {
// //                 if (mas[i] > mas[i + 1]) {
// //                     isSorted = false;

// //                     buffer = mas[i];
// //                     mas[i] = mas[i + 1];
// //                     mas[i + 1] = buffer;
// //                 }
// //             }
// //             logger.info(Arrays.toString(mas));
// //         }
// //         return mas;
// //     }

// //     public void configureLogger() {
// //         try {
// //             FileHandler fileHandler = new FileHandler("log.txt");
// //             logger.addHandler(fileHandler);
// //             SimpleFormatter formatter = new SimpleFormatter();
// //             fileHandler.setFormatter(formatter);
// //         } catch (IOException ex) {
// //             ex.printStackTrace();
// //         }
// //     }
// // }

// // public class BubbleSorting {
// //     public static void main(String[] args) {
// //         int[] arr = {};

// //         if (args.length == 0) {
// //             arr = new int[] { 9, 4, 8, 3, 1 };
// //         } 
// //         else {
// //             arr = Arrays.stream(args[0].split(", "))
// //                     .mapToInt(Integer::parseInt)
// //                     .toArray();
// //         }

// //         BubbleSort ans = new BubbleSort();
// //         ans.sort(arr);
// //     }
// // }



// // 2

// // import java.io.IOException;
// // import java.util.Arrays;
// // import java.util.Random;
// // import java.util.logging.FileHandler;
// // import java.util.logging.Logger;
// // import java.util.logging.SimpleFormatter;

// // public class BubbleSorting {
    

// //     public static int[] randomArr() {
// //         Random rand = new Random();
// //         int arr[] = new int[10];
// //         for (int i = 0; i < arr.length; i++) {
// //             arr[i] = rand.nextInt(100);
// //             System.out.print(arr[i] + " ");
// //         }
// //         System.out.println("");
// //         return arr;
// //     }

// //     public static int[] babblSort(int arr[]) throws IOException {
// //         Logger loger = Logger.getLogger(BubbleSorting.class.getName());
// //         FileHandler fHandler = new FileHandler("hw_2.txt");
// //         SimpleFormatter sFormatter = new SimpleFormatter();
// //         fHandler.setFormatter(sFormatter);
// //         loger.addHandler(fHandler);

// //         int temp;
// //         for (int i = arr.length - 1; i >= 0; i--) {
// //             for (int j = 0; j < arr.length - 1; j++) {
// //                 if (arr[j] < arr[j + 1]) {
// //                     temp = arr[j];
// //                     arr[j] = arr[j + 1];
// //                     arr[j + 1] = temp;
// //                 }
// //             }

// //             loger.info(Arrays.toString(arr));
// //         }
// //         return arr;

// //     }

// //     public static void print(int[] arr) {
// //         for (int i = 0; i < arr.length; i++) {
// //             System.out.print(arr[i] + " ");
// //         }
// //     }

// //     public static void main(String[] args) throws IOException {

// //         print(babblSort(randomArr()));
// //     }

// // }



// import java.io.IOException;
// import java.text.SimpleDateFormat;
// import java.util.Arrays;
// import java.util.Date;
// import java.util.logging.FileHandler;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;

// // class BubbleSort {
// //     // Создание логгера с нужным форматом вывода
// //     private static Logger logger = null;

// //     static {
// //         System.setProperty("java.util.logging.SimpleFormatter.format",
// //                 "%1$tF %1$tR %5$s %n");
// //         logger = Logger.getLogger(BubbleSort.class.getName());
// //     }

// //     public void sort(int[] mas) {

// //         configureLogger();
// //         bubbleSort(mas);
// //     }

// //     private int[] bubbleSort(int[] mas) {
// //         boolean isSorted = false;
// //         int buffer;

// //         while (!isSorted) {
// //             isSorted = true;
// //             for (int i = 0; i < mas.length - 1; i++) {
// //                 if (mas[i] > mas[i + 1]) {
// //                     isSorted = false;

// //                     buffer = mas[i];
// //                     mas[i] = mas[i + 1];
// //                     mas[i + 1] = buffer;
// //                 }
// //             }
// //             logger.info(Arrays.toString(mas));
// //         }
// //         return mas;
// //     }

// //     public void configureLogger() {
// //         try {
// //             FileHandler fileHandler = new FileHandler("log.txt");
// //             logger.addHandler(fileHandler);
// //             SimpleFormatter formatter = new SimpleFormatter();
// //             fileHandler.setFormatter(formatter);
// //         } catch (IOException ex) {
// //             ex.printStackTrace();
// //         }
// //     }
// // }

//        /// 3
// class BubbleSort {
//     private static File log;
//     private static FileWriter fileWriter;
//     public static void sort(int[] mas) {
//        try {
//             log = new File("log.txt");
//             fileWriter = new FileWriter(log);
//             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");

//             for (int i = 0; i <= mas.length - 1; i++) {
//                 boolean swapped = false;
//                 for (int j = 0; j < mas.length - i - 1; j++) {
//                     if (mas[j] > mas[j + 1]) {
//                         int temp = mas[j];
//                         mas[j] = mas[j + 1];
//                         mas[j + 1] = temp;
//                         swapped = true;
//                     }
//                 }
//                 fileWriter.write(formatter.format(new Date()) + " " + Arrays.toString(mas) + "\n");
//                 if (!swapped) break; 
//             }
//             fileWriter.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//   }
// }
// public class Printer {
//     public static void main(String[] args) {
//         int[] arr = {};

//         if (args.length == 0) {
//             arr = new int[] { 9, 4, 8, 3, 1 };
//         } else {
//             arr = Arrays.stream(args[0].split(", "))
//                     .mapToInt(Integer::parseInt)
//                     .toArray();
//         }

//         new BubbleSort();
//         BubbleSort.sort(arr);
//     }
// }

// // import java.io.File;
// // import java.io.FileWriter;
// // import java.io.FileReader;
// // import java.io.BufferedReader;
// // import java.io.IOException;
// // import java.util.Arrays;
// // import java.text.SimpleDateFormat;
// // import java.util.Date;
// // import java.util.logging.FileHandler;
// // import java.util.logging.Logger;


// // class BubbleSort {
// //     private static File log;
// //     private static FileWriter fileWriter;
// //     private static Logger logger = Logger.getLogger("MyLog");
// //     private static FileHandler fh;

// //     public static void sort(int[] mas) {
// //        try {
// //             log = new File("log.txt");
// //             fileWriter = new FileWriter(log);
// //             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");

// //             for (int i = 0; i <= mas.length - 1; i++) {
// //                 boolean swapped = false;
// //                 for (int j = 0; j < mas.length - i - 1; j++) {
// //                     if (mas[j] > mas[j + 1]) {
// //                         int temp = mas[j];
// //                         mas[j] = mas[j + 1];
// //                         mas[j + 1] = temp;
// //                         swapped = true;
// //                     }
// //                 }
// //                 fileWriter.write(formatter.format(new Date()) + " " + Arrays.toString(mas) + "\n");
// //                 if (!swapped) break; // Если обменов не было, прерываем цикл
// //             }
// //             fileWriter.close();
// //         } catch (IOException e) {
// //             e.printStackTrace();
// //         }
// //   }
// // }

// // // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// // public class Printer{ 
// //     public static void main(String[] args) { 
// //       int[] arr = {};
      
// //       if (args.length == 0) {
// //         // При отправке кода на Выполнение, вы можете варьировать эти параметры
// //         arr = new int[]{9, 4, 8, 3, 1};
// //       }
// //       else{
// //         arr = Arrays.stream(args[0].split(", "))
// //                         .mapToInt(Integer::parseInt)
// //                         .toArray();
// //       }     
      
// //       new BubbleSort();      
// //       BubbleSort.sort(arr);

// //       try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
// //             String line;
// //             while ((line = br.readLine()) != null) {
// //                 System.out.println(line);
// //             }
// //         } catch (IOException e) {
// //             e.printStackTrace();
// //         }
// //     }
// // }

// // 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации
// // запишите в лог-файл.
// Пример

// arr = new int[]{9, 4, 8, 3, 1};
// sort(arr)

// // При чтении лог-файла получим:
// 2023-05-19 07:53 [4, 8, 3, 1, 9]
// 2023-05-19 07:53 [4, 3, 1, 8, 9]
// 2023-05-19 07:53 [3, 1, 4, 8, 9]
// 2023-05-19 07:53 [1, 3, 4, 8, 9]
// 2023-05-19 07:53 [1, 3, 4, 8, 9]


// import java.io.IOException;
// import java.util.Arrays;
// import java.util.logging.FileHandler;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;

// import java.io.File;
// import java.io.FileWriter;

// import java.io.File;
// import java.io.FileWriter;

// class BubbleSort {
//     // Создание логгера с нужным форматом вывода
//     private static Logger logger = null;

//     static {
//         System.setProperty("java.util.logging.SimpleFormatter.format",
//                 "%1$tF %1$tR %5$s %n");
//         logger = Logger.getLogger(BubbleSort.class.getName());
//     }

//     public void sort(int[] mas) {

//         configureLogger();
//         bubbleSort(mas);
//     }

//     private int[] bubbleSort(int[] mas) {
//         boolean isSorted = false;
//         int buffer;

//         while (!isSorted) {
//             isSorted = true;
//             for (int i = 0; i < mas.length - 1; i++) {
//                 if (mas[i] > mas[i + 1]) {
//                     isSorted = false;

//                     buffer = mas[i];
//                     mas[i] = mas[i + 1];
//                     mas[i + 1] = buffer;
//                 }
//             }
//             logger.info(Arrays.toString(mas));
//         }
//         return mas;
//     }

//     public void configureLogger() {
//         try {
//             FileHandler fileHandler = new FileHandler("log.txt");
//             logger.addHandler(fileHandler);
//             SimpleFormatter formatter = new SimpleFormatter();
//             fileHandler.setFormatter(formatter);
//         } catch (IOException ex) {
//             ex.printStackTrace();
//         }
//     }
// }

// public class BubbleSorting {
//     public static void main(String[] args) {
//         int[] arr = {};

//         if (args.length == 0) {
//             arr = new int[] { 9, 4, 8, 3, 1 };
//         } 
//         else {
//             arr = Arrays.stream(args[0].split(", "))
//                     .mapToInt(Integer::parseInt)
//                     .toArray();
//         }

//         BubbleSort ans = new BubbleSort();
//         ans.sort(arr);
//     }
// }



// 2

// import java.io.IOException;
// import java.util.Arrays;
// import java.util.Random;
// import java.util.logging.FileHandler;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;

// public class BubbleSorting {
    

//     public static int[] randomArr() {
//         Random rand = new Random();
//         int arr[] = new int[10];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = rand.nextInt(100);
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println("");
//         return arr;
//     }

//     public static int[] babblSort(int arr[]) throws IOException {
//         Logger loger = Logger.getLogger(BubbleSorting.class.getName());
//         FileHandler fHandler = new FileHandler("hw_2.txt");
//         SimpleFormatter sFormatter = new SimpleFormatter();
//         fHandler.setFormatter(sFormatter);
//         loger.addHandler(fHandler);

//         int temp;
//         for (int i = arr.length - 1; i >= 0; i--) {
//             for (int j = 0; j < arr.length - 1; j++) {
//                 if (arr[j] < arr[j + 1]) {
//                     temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }

//             loger.info(Arrays.toString(arr));
//         }
//         return arr;

//     }

//     public static void print(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) throws IOException {

//         print(babblSort(randomArr()));
//     }

// }



// import java.io.IOException;
// import java.text.SimpleDateFormat;
// import java.util.Arrays;
// import java.util.Date;
// import java.util.logging.FileHandler;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;

// class BubbleSort {
//     // Создание логгера с нужным форматом вывода
//     private static Logger logger = null;

//     static {
//         System.setProperty("java.util.logging.SimpleFormatter.format",
//                 "%1$tF %1$tR %5$s %n");
//         logger = Logger.getLogger(BubbleSort.class.getName());
//     }

//     public void sort(int[] mas) {

//         configureLogger();
//         bubbleSort(mas);
//     }

//     private int[] bubbleSort(int[] mas) {
//         boolean isSorted = false;
//         int buffer;

//         while (!isSorted) {
//             isSorted = true;
//             for (int i = 0; i < mas.length - 1; i++) {
//                 if (mas[i] > mas[i + 1]) {
//                     isSorted = false;

//                     buffer = mas[i];
//                     mas[i] = mas[i + 1];
//                     mas[i + 1] = buffer;
//                 }
//             }
//             logger.info(Arrays.toString(mas));
//         }
//         return mas;
//     }

//     public void configureLogger() {
//         try {
//             FileHandler fileHandler = new FileHandler("log.txt");
//             logger.addHandler(fileHandler);
//             SimpleFormatter formatter = new SimpleFormatter();
//             fileHandler.setFormatter(formatter);
//         } catch (IOException ex) {
//             ex.printStackTrace();
//         }
//     }
// }

       /// 3
// class BubbleSort {
//     private static File log;
//     private static FileWriter fileWriter;
//     public static void sort(int[] mas) {
//        try {
//             log = new File("log.txt");
//             fileWriter = new FileWriter(log);
//             SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");

//             for (int i = 0; i <= mas.length - 1; i++) {
//                 boolean swapped = false;
//                 for (int j = 0; j < mas.length - i - 1; j++) {
//                     if (mas[j] > mas[j + 1]) {
//                         int temp = mas[j];
//                         mas[j] = mas[j + 1];
//                         mas[j + 1] = temp;
//                         swapped = true;
//                     }
//                 }
//                 fileWriter.write(formatter.format(new Date()) + " " + Arrays.toString(mas) + "\n");
//                 if (!swapped) break; 
//             }
//             fileWriter.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//   }
// }
// public class Printer {
//     public static void main(String[] args) {
//         int[] arr = {};

//         if (args.length == 0) {
//             arr = new int[] { 9, 4, 8, 3, 1 };
//         } else {
//             arr = Arrays.stream(args[0].split(", "))
//                     .mapToInt(Integer::parseInt)
//                     .toArray();
//         }

//         new BubbleSort();
//         BubbleSort.sort(arr);
//     }
// }
package HW.hw_2;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
// import java.util.logging.FileHandler;
// import java.util.logging.Logger;


class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;
    // private static Logger logger = Logger.getLogger("MyLog");
    // private static FileHandler fh;

    public static void sort(int[] mas) {
       try {
            log = new File("log.txt");
            fileWriter = new FileWriter(log);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");

            for (int i = 0; i <= mas.length - 1; i++) {
                boolean swapped = false;
                for (int j = 0; j < mas.length - i - 1; j++) {
                    if (mas[j] > mas[j + 1]) {
                        int temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;
                        swapped = true;
                    }
                }
                fileWriter.write(formatter.format(new Date()) + " " + Arrays.toString(mas) + "\n");
                if (!swapped) break; // Если обменов не было, прерываем цикл
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      int[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{9, 4, 8, 3, 1};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }     
      
      new BubbleSort();      
      BubbleSort.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}