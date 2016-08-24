package java;

import java.util.Arrays;


/**
 * Переписать алгоритм сортировки выборками:
 public class SelectionSorter {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
     }
 }

 1. Убрать обмен элементами arr[barrier] c arr[index] каждый раз, когда находится очередной меньший элемент. Найти наименьший элемент во всем массиве - и обменять с ним.
 2. Убрать обращение во внутреннем цикле к элементу массива arr[barrier]. Вычитать значение ячейки массива в локальную переменную (за пределами внутреннего цикла) и использовать ее (во внутреннем цикле).
 В моих экспериментах пункт #1 ускорил сортировку в 2 раза. Пункт #2 ускорил сортировку еще на 10%-20%.
 */

public class SelectionSorter {


    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int tmpIndex = barrier;
            int tmp = arr[tmpIndex];

            for (int index = barrier + 1; index < arr.length; index++) {

                if (arr[index] < tmp) {
                    tmpIndex = index;
                    tmp = arr[index];
                }

            }

            arr[tmpIndex] = arr[barrier];
            arr[barrier] = tmp;


        }

    }

}
