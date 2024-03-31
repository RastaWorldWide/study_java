import java.util.*;

public class Comparison {
    public static void main(String[] args) {
        int collectionSize = 11000000;
        int elementsToGet = 1100000000;

        // Создаем коллекции
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Заполняем коллекции
        Random random = new Random();
        for (int i = 0; i < collectionSize; i++) {
            int value = random.nextInt();
            arrayDeque.add(value);
            sortedMap.put(value, "" + value);
            arrayList.add(value);
        }

        // Запускаем эксперименты
        runAdditionTests(arrayDeque, sortedMap, arrayList);
        runRemovalTests(arrayDeque, sortedMap, arrayList);
        runGetElementTests(arrayDeque, sortedMap, arrayList, elementsToGet);
    }

    // Метод для запуска экспериментов по операции добавления
    public static void runAdditionTests(ArrayDeque<Integer> arrayDeque, SortedMap<Integer, String> sortedMap, ArrayList<Integer> arrayList) {
        long startTime, endTime;

        // Добавление элементов в начало коллекции
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayDeque.addFirst(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в начало ArrayDeque: " + (endTime - startTime) + " мс");

        // Добавление элементов в середину коллекции (ArrayDeque не поддерживает добавление в середину)

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            sortedMap.put(11000000 + i, "" + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в середину SortedMap: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.add(11000000 + i, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в середину ArrayList: " + (endTime - startTime) + " мс");

        // Добавление элементов в конец коллекции
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayDeque.addLast(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в конец ArrayDeque: " + (endTime - startTime) + " мс");
    }

    // Метод для запуска экспериментов по операции удаления
    public static void runRemovalTests(ArrayDeque<Integer> arrayDeque, SortedMap<Integer, String> sortedMap, ArrayList<Integer> arrayList) {
        long startTime, endTime;

        // Удаление элементов в начале коллекции
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayDeque.removeFirst();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления в начале ArrayDeque: " + (endTime - startTime) + " мс");

        // Удаление элементов в середине коллекции
        // ArrayDeque не поддерживает удаление в середине

        startTime = System.currentTimeMillis();
        for (int i = 11000000; i < 11050000; i++) {
            sortedMap.remove(11000000);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления в середине SortedMap: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 11000000; i < 11050000; i++) {
            arrayList.remove(11000000);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления в середине ArrayList: " + (endTime - startTime) + " мс");

        // Удаление элементов в конце коллекции
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayDeque.removeLast();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления в конце ArrayDeque: " + (endTime - startTime) + " мс");
    }

    // Метод для запуска экспериментов по операции получения элемента по индексу
    public static void runGetElementTests(ArrayDeque<Integer> arrayDeque, SortedMap<Integer, String> sortedMap, ArrayList<Integer> arrayList, int elementsToGet) {
        long startTime, endTime;

        // Получение элементов по индексу для ArrayDeque (не поддерживается)
        System.out.println("Получение элементов по индексу для ArrayDeque: Не поддерживается");

        // Получение элементов по индексу для SortedMap
        startTime = System.currentTimeMillis();
        for (int i = 0; i < elementsToGet; i++) {
            sortedMap.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время получения элементов по индексу для SortedMap: " + (endTime - startTime) + " мс");

        // Получение элементов по индексу для ArrayList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < elementsToGet; i++) {
            arrayList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время получения элементов по индексу для ArrayList: " + (endTime - startTime) + " мс");
    }
}
