// Задание №2.1
// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.
// Задание состоит из двух блоков

// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

package sem_3;

import java.util.ArrayList;
import java.util.Collections;

public class CountOfPlanet {
    public static void main(String[] args) {
        ArrayList<String> planets = getPlanets();
        System.out.println(planets);
        showCountOfPlanet(planets);
        deleteDuplicates(planets);
        System.out.println(planets);

    }

    private static ArrayList<String> getPlanets() {
        ArrayList<String> planets = new ArrayList<String>();
        planets.add("Юпитер");
        planets.add("Нептун");
        planets.add("Юпитер");
        planets.add("Меркурий");
        planets.add("Земля");
        planets.add("Венера");
        planets.add("Венера");
        planets.add("Уран");
        planets.add("Марс");
        planets.add("Сатурн");
        planets.add("Земля");
        planets.add("Юпитер");
        return planets;
    }

    private static void showCountOfPlanet(ArrayList<String> planets) {
        ArrayList<String> sortedPlanets = new ArrayList<>(planets);
        Collections.sort(sortedPlanets);

        int countOfPlanet = 1;

        for (int i = 1; i < sortedPlanets.size(); i++) {
            if (sortedPlanets.get(i) != sortedPlanets.get(i - 1)) {
                System.out.println(sortedPlanets.get(i - 1) + " > " + countOfPlanet);
                countOfPlanet = 1;
            } else {
                countOfPlanet++;
            }
        }
        System.out.println(sortedPlanets.get(sortedPlanets.size() - 1) + " > " + countOfPlanet);
    }

    private static void deleteDuplicates(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = array.size() - 1; j > i; j--) {
                if (array.get(i).equals(array.get(j))) {
                    array.remove(j);
                }
            }
        }
    }    
}