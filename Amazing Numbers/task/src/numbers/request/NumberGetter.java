package numbers.request;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

public class NumberGetter {

    public int getNumber() {
        int number=0;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter a natural number:");
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("This number is not natural!");
            }
            scanner.nextLine();
            if (number < 1){
                System.out.println("This number is not natural!");
                System.exit(0);
            }
        } while (number < 1);

        return number;
    }


}
