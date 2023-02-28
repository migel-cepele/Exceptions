package chapter11;
//demostrimi se si te menaxhojme arthimeticExceptions dhe
//InputMismatchExceptions
import java.util.InputMismatchException;
import java.util.Scanner;


public class DivideByZeroWithExceptionHandling {

    //paraqent si menaxhohet nje pjestim me 0
    public static int quotient(int numerator, int denominator) 
    throws ArithmeticException {
        return numerator / denominator; //mund te kryhet pjestim me 0
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; //percakton nese duhet me shume se nje input

        do{
            try { //lexon dy numra dhe llogarit heresin
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();
                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator,
                   denominator, result);

                continueLoop = false; // input successful; end looping
            }
            catch(InputMismatchException ime) {
                System.err.printf("%nException: %s%n",
                ime);
                scanner.nextLine(); // discard input so user can try again
                System.out.printf(
                "You must enter integers. Please try again.%n%n");
            }
            catch(ArithmeticException ae) {
                System.err.printf("%nException: %s%n", ae);
                System.out.printf("Zero nuk mund te jete emerues. Provo perseri. %n%n");
            }
        } while (continueLoop);

    }
    
}
