package numbers.request;

import java.util.Scanner;

public class NumberGetter {

    public Input getNumber() {
        InputAnalyzer analyzer = new InputAnalyzer();
        InputGetter getter = new InputGetter();
        ErrorMsg errorMsg = new ErrorMsg();
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter a request: > ");
            input = scanner.nextLine();
        }while (!errorMsg.isValid(input));

        analyzer.isZero(input);
        return getter.getInput(input);
    }


}
