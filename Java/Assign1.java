
import java.util.StringTokenizer;
import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a line of integers (separated by spaces): ");
        String input = scanner.nextLine();

        
        StringTokenizer tokenizer = new StringTokenizer(input);
        int sum = 0;

        System.out.println("The integers are:");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int number = Integer.parseInt(token); 
            System.out.println(number); 
            sum += number; 
        }

      
        System.out.println("Sum of all integers: " + sum);
        scanner.close();
    }
}
    

