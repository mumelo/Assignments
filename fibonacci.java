public class  fibonacci {
    public static int sumOfEvenFibonacciNumbers(int max) {
        int sum = 0;
        int prev = 1;
        int curr = 2;

        while (curr <= max) {
            if (curr % 2 == 0) {
                sum += curr;
            }
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return sum;
    }

    public static void main(String[] args) {
        int max = 4000000;
        int sum = sumOfEvenFibonacciNumbers(max);
        System.out.println("Sum of even-valued Fibonacci terms not exceeding " + max + ": " + sum);
    }
}
    

