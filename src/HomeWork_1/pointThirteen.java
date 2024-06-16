package HomeWork_1;

public class pointThirteen {
    public static void main(String[] args) {
        int n = 5; // размер массива

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = 1; // заполняем элементы на диагонали единицами
        }

        // Вывод массива на экран
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    }

