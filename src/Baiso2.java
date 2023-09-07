import java.io.PrintStream;
import java.util.stream.IntStream;

public class Baiso2 {
    public static void main(String[] args){
        int number = 2, i =1;
        while (i <= 10){
            System.out.printf("%d * %d = %d \n", number, i, number * i);
            i++;
        }
    }
}
