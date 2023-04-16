package tasks;

public class Divisible {
    public static void main(String[] args) {
        int number = 30;
        divisible(number);
    }

    private static void divisible(int number) {
        int sum = 0;

        for (int i = 3; i <= number; i += 3) {
            sum += i;
        }
        System.out.println("The sum of integers between 1 and 30 that are divisible by 3 is: " + sum);
    }
}
