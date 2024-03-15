public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача 1");
        int[] money = {1570, 7654, 9986, 5670, 3802};
        int sum = 0;
        for (int index = 0; index < money.length; index++) {
            sum = sum + money[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();
        //task 2
        System.out.println("Задача 2");
        int[] money1 = {1570, 7654, 9986, 5670, 3802};
        int maxMony = -1;
        int minMony = 1000000;
        for (int index : money1)
            if (index > maxMony) {
                maxMony = index;
            }
        for (int index : money1)
            if (index < minMony) {
                minMony = index;
            }
        System.out.println("Минимальная сумма трат за неделю составила " + minMony + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxMony + " рублей.");
        System.out.println();
        //task 3
        System.out.println("Задача 3");
        int[] week1 = {1570, 7654, 9986, 5670, 3802};
        int[] week2 = {2570, 5654, 9741, 5682, 1302};
        int[] week3 = {2589, 4852, 9564, 7208, 10258};
        int[] week4 = {10589, 4582, 10354, 9875, 12458};
        int sumWeek1 = 0;
        int sumWeek2 = 0;
        int sumWeek3 = 0;
        int sumWeek4 = 0;
        for (int j : week1) {
            sumWeek1 = sumWeek1 + j;
        }
        for (int j : week2) {
            sumWeek2 = sumWeek2 + j;
        }
        for (int j : week3) {
            sumWeek3 = sumWeek3 + j;
        }
        for (int j : week4) {
            sumWeek4 = sumWeek4 + j;
        }
        double average = (sumWeek1 + sumWeek2 + sumWeek3 + sumWeek4)/4;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        System.out.println();
        //task 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0; i--) {
            if (i != -1) {
                System.out.print(reverseFullName[i]);
            }
        }

    }
}