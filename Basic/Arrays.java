package Basic;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = { 15, 12, 20, 02 };

        System.out.println("First element in numbers" + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        numbers[3] = 100;

        System.out.println("Modified third element: " + numbers[3]);

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

    }
}
