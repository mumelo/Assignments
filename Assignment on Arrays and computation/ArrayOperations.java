import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        // create an array to store 15 integer values
        int[] arr = new int[15];

        try (// read input values from user and store them in the array
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter 15 integer values:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            // print the values stored in the array
            System.out.println("Values stored in the array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            // check if a number entered by user is present in the array
            System.out.println("Enter a number to search in the array:");
            int num = scanner.nextInt();
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                System.out.println("The number found at index " + index);
            } else {
                System.out.println("Number not found in this array");
            }
        }
        // create another array with values in reverse order
        int[] reverseArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[arr.length - 1 - i];
        }

        // print the values in the new array
        System.out.println("Values in the new array (reversed order):");
        for (int i = 0; i < reverseArr.length; i++) {
            System.out.print(reverseArr[i] + " ");
        }
        System.out.println();

        // compute the sum and product of the values in the array
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            product *= arr[i];
        }

        // print the sum and product of the values in the array
        System.out.println("Sum of the values in the array: " + sum);
        System.out.println("Product of the values in the array: " + product);
    }
}

    

