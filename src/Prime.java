import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Prime {
    public static void main(String[] args) throws IOException {
        // LinkedList numbers = new LinkedList<>();
        File input = new File("C:\\Users\\mb039529\\Desktop\\input.txt");
        try {
            BufferedReader inputs = new BufferedReader(new FileReader(input));
            String line;
            //while ()
            int numLines = inputs.readLine();
            for (int m = 0; m <= numLines; m++) {
                int number = Integer.parseInt(line);
                if (isPrime(number))
                    System.out.println(number + " Not prime");
                else {
                    System.out.println(number + " is prime");
                }
            }
        }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}