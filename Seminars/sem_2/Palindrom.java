// Задание №3
// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

package sem_2;

public class Palindrom {
    public static void main(String[] args) {
        String word = "Привет привет мир";
        boolean result = isPalindrome(word);

        System.out.println(result ? "палиндром" : "не палиндром");// """

    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        for (left = 0; left < str.length() / 2; left++) //
        {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            right--;
        }
        return true;
    }
}
// то же через рекурсию:
//   public class Palindrom {
//     public static void main(String[] args) {
//         String input = "шабаш";
//         if (isPalindrome(input)){
//             System.out.println("палиндром");
//         } else {
//             System.out.println("не палиндром");
//         }
//     }

//     private static boolean isPalindrome(String input) {
//         if (input.length() <= 1) return true;
//         if (input.charAt(0) == input.charAt(input.length() - 1)) {
//             return isPalindrome(input.substring(1, input.length() - 1));
//         }
//         return false;
//     }
// }