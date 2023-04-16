package tasks;

public class SecondLargest {

    public int secondlargest(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers[numbers.length - 2];
    }
}
