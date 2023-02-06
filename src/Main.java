import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        // Задача 1 (сумма выплат за месяц)
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int monthlyExpenses = 0;
        for (int i : arr) {
            monthlyExpenses += i;
        }
        System.out.println("Сумма трат за месяц составила " + monthlyExpenses + " рублей.");
    }

    public static void task2() {
        // Задача 2 (минимальная и максимальная трата за день)
        int[] arr = generateRandomArray();

        int maxExpenses = -1;
        for (final int i : arr) {
            if (i > maxExpenses) {
                maxExpenses = i;
            }
        }

        int minExpenses = maxExpenses;
        for (final int i : arr) {
            if (i < minExpenses) {
                minExpenses = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей. " +
                "Максимальная сумма трат за день составила " + maxExpenses + " рублей.");
    }

    public static void task3() {
        // Задача 3 (средняя сумма трат за месяц)
        int[] arr = generateRandomArray();
        double monthlyExpenses2 = Arrays.stream(arr).sum();
        double averageSum = monthlyExpenses2 / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей. %n", averageSum);
    }

    public static void task4() {
        char[] reserseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reserseFullName.length - 1; i >= 0; i--) {
            System.out.print(reserseFullName[i]);
        }
    }
}