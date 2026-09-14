import java.util.Scanner;

public class DataStructureTask {

    // Sort the array using Bubble Sort
    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 different numbers
        System.out.println("Enter 5 different numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sort the array
        sortArray(numbers);

        // Display sorted array
        System.out.println("Sorted array:");

        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Second lowest and second highest
        int secondLowest = numbers[1];
        int secondHighest = numbers[3];

        System.out.println("\nSecond Lowest: " + secondLowest);
        System.out.println("Second Highest: " + secondHighest);

        sc.close();
    }
}
