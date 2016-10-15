/**
 * Created by curri on 9/21/16.
 */
import java.io.PrintStream;
import java.util.Scanner;

public class Test {

    // reads numbet until user enters 0 and returns the sum
    int readAndAdd(Scanner in, PrintStream ps)
    {
        int sum=0;
        int number=1;
        while(number!=0) {
            ps.println("Give me a number (0 to stop)");
            number = in.nextInt();
            sum += number;
        }
        return sum;
    }
}
