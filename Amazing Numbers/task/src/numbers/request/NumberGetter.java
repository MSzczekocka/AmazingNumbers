package numbers.request;

import java.util.Scanner;

public class NumberGetter {

    public int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int number = scanner.nextInt();

        if (number<1){
            System.out.println("This number is not natural!");
        }
        return number;
    }
}
