/*
Задание №4
Каталог товаров книжного магазина сохранен в виде двумерного
списка List<ArrayList<String>> так, что на 0й позиции каждого
внутреннего списка содержится название жанра, а на остальных
позициях - названия книг. Напишите метод для заполнения данной
структуры.
*/
package sem_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogBooks {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        getCatalogBooks(catalog);

        for (ArrayList<String> genre : catalog) {
            System.out.println(genre);
        }
    }

    private static void getCatalogBooks(List<ArrayList<String>> catalog) {
        ArrayList<String> genre1 = new ArrayList<>(Arrays.asList("Проза", "Книга1", "Книга2", "Книга3"));
        ArrayList<String> genre2 = new ArrayList<>(Arrays.asList("Фантастика", "Книга1", "Книга2", "Книга3"));
        ArrayList<String> genre3 = new ArrayList<>(Arrays.asList("Детектив", "Книга1", "Книга2", "Книга3"));
        catalog.add(genre1);
        catalog.add(genre2);
        catalog.add(genre3);
    }
}
/*
С другого семинара:
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//📌 Каталог товаров книжного магазина сохранен в виде двумерного
//списка List<ArrayList<String>> так, что на 0й позиции каждого
//внутреннего списка содержится название жанра, а на остальных
//позициях - названия книг. Напишите метод для заполнения данной
//структуры.
public class Catalog {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        ArrayList <String> genre1 = new ArrayList<>(Arrays.asList("жанр1", "книга1", "книга2", "книга3"));
        ArrayList <String> genre2 = new ArrayList<>(Arrays.asList("жанр2", "книга1", "книга2", "книга3"));
        ArrayList <String> genre3 = new ArrayList<>(Arrays.asList("жанр3", "книга1", "книга2", "книга3"));
//        catalog.add(genre1);
//        catalog.add(genre2);
//        catalog.add(genre3);
        catalog.addAll(Arrays.asList(genre1, genre2, genre3));
        for(ArrayList<String> genre: catalog){
            System.out.println(genre);
        }
    }
}
*/