package ua.com.juja.core;

/**
 * Задача LMS: Lab14 Сортировка пузырьком
 * Перепишите алгоритм на такой, при котором "тонет" самый маленький элемент. 
 * Порядок сортировки должен сохраниться - по возрастанию. Элементы должны перебираться справа - налево. 
 * Всплывал - вправо, тонет - влево. Цикл не доходил до правого конца, теперь - не доходит до левого. 
 */

public class BubbleSorterLeft {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier <= arr.length - 1; barrier++) {
            for (int index = arr.length-1; index > 0; index--) {
                if (arr[index] < arr[index - 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = tmp;
                }
            }
        }
    }
}
