package numbers.request;

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
        return analyzer.getInput(input);
    }


}
