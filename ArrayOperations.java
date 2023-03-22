import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 15 integer values
        int[] arr = new int[15];

        // Take input from user and store in the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Print the values stored in the array
        System.out.println("\nValues stored in the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Ask user to enter a number and check if it's present in the array
        System.out.print("\nEnter a number to search in the array: ");
        int num = scanner.nextInt();
        boolean found = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }

        // Create a new array with the values in reverse order
        int[] reverseArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[arr.length - 1 - i];
        }

        // Print the values in the new array
        System.out.println("\nValues in the new array (in reverse order):");
        for (int i = 0; i < reverseArr.length; i++) {
            System.out.print(reverseArr[i] + " ");
        }

        // Calculate the sum and product of all elements in the array
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}

    

