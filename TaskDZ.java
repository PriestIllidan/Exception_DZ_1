public class TaskDZ {
    /*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0};
        int[] arr2 = {2, 2, 1, 2};
        int[] arr3 = {1, 2};
        int[] arr4 = {0, 0, 0, 0};
        // printArray(arrayDeg(arr1, arr2));
        // printArray(arrayDeg(arr1, arr3));
        printArray(arrayDeg(arr1, arr4));
    }

    public static int[] arrayDeg(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("На 0 делить нельзя");
            }
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины входящих массивов не равны");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                res[i] = arr1[i] / arr2[i];
            }
        }
        return res;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

