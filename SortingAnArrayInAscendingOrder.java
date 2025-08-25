public class SortingAnArrayInAscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {34, 67, 23, 89, 12, 90, 45};

    
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Array sorted in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
