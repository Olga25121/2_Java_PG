// Задание №4
// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

package sem_2;


import java.io.FileWriter;
import java.io.IOException;


public class RepetitionsWord  {
    public static String repeatStr(String str, int count) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < count; i++) {
            newStr.append(str);
        }
        return newStr.toString();
    }

    public static void writerStr(String str) {
    
        try (FileWriter writer = new FileWriter("Txt1.txt", false)) 
        {
            writer.write(str);
            writer.flush();
        }
        catch(IOException ex){

        }

    }

    

    public static void main(String[] args) {
        writerStr(repeatStr("TEST ", 100));
    }
}