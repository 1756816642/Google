/**
 * Created by sofia on 5/18/16.
 */
public class FizzBuzz {
    public static void main(String[] args) {
    // Fizz(3); Buzz(5); FizzBuzz(3 & 5)
        for (int i = 0; i<=50; i++) {
            if(i%15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
