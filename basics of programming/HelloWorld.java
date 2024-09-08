import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        String name = null;
        int age = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("whats your name: ");
        name = scanner.nextLine();
        
        System.out.println("How old are you: ");
        try{
            age = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Only numbers are allowed try again!"+e);
        }
        System.out.println("Your name is: " + name+ "\n" +"your age is: "+ age);
    }
}