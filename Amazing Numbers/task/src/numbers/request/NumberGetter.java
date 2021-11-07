package numbers.request;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGetter {

    public int getNumber() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a request: > ");
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("This number is not natural!");
            }
            scanner.nextLine();
            if (number == 0) {
                System.out.println("Goodbye!");
                System.exit(0);
            }else if(number<0){
                System.out.println("The first parameter should be a natural number or zero.");
            }
        } while (number < 1);

        return number;
    }


}
