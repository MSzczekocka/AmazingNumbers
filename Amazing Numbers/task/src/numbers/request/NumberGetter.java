package numbers.request;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberGetter {

    public Input getNumber() {
        InputAnalyzer analyzer = new InputAnalyzer();
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter a request: > ");
            input = scanner.nextLine();
        }while (!analyzer.isNumeric(input));

        analyzer.isZero(input);




//        do {
//            System.out.print("Enter a request: > ");
//            try {
//                number = scanner.nextBigInteger();
//            } catch (InputMismatchException e) {
//                System.out.println("This number is not natural!");
//            }
//            scanner.nextLine();
//            if (number.equals(new BigInteger("0"))) {
//                System.out.println("Goodbye!");
//                System.exit(0);
//            }else if(number.compareTo(new BigInteger("0")) < 0){
//                System.out.println("The first parameter should be a natural number or zero.");
//            }
//        } while (number.compareTo(new BigInteger("1")) < 0);
//        return number;
        return new Input(new BigInteger("0"),0);
    }


}
