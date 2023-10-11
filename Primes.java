public class Primes {
    public static void main(String[] args) {
        // Define the maximum value to search for prime numbers
        int nValues = 50;

        // Label for the outer loop, used with 'continue' to skip to the next iteration
        outerloop:
        for (int i = 2; i <= nValues; i++) {
            // Loop to check for factors from 2 up to the square root of i
            for (int j = 2; j * j <= i; j++) {
                // If i is divisible by j, it's not prime, so continue to the next number
                if (i % j == 0) {
                    continue outerloop;
                }
            }
            // If no divisors are found, print the prime number
            System.out.println(i);
        }
    }
}






