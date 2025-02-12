public class Main {
    public static void main(String[] args) {
        System.out.println("Homework array, part 2");

        System.out.println("\nTask 1");

        int[] salaryArr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i : salaryArr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");


        System.out.println("\nTask 2");

        int[] arrVariable = {60, 70, 80, 90, 100};
        int min = arrVariable[0];
        int max = arrVariable[0];
        for (int element : arrVariable) {
            if (element < min) {
                min = element;
            } else {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");

        System.out.println("\nTask 3");

        int[] expenses = {280, 360, 570, 690, 750};
        int totalExpenses = 0;
        for (int expense : expenses) {
            totalExpenses += expense;
        }
        int weekMonth = 4;
        double averageExpenses = (double) totalExpenses / weekMonth;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");

        System.out.println("\nTask 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int reverse = reverseFullName.length - 1; reverse >=0; reverse--) {
            System.out.print(reverseFullName[reverse]);
            }
        }
    }