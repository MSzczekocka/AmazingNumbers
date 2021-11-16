package numbers.request;

public class ErrorMsg {

    public boolean isValid(String input) {
        InputAnalyzer analyzer = new InputAnalyzer();
        String[] inputs = input.split(" ");
        if (analyzer.isNegative(inputs[0]) || !analyzer.isNumeric(inputs[0])) {
            System.out.println("The first parameter should be a natural number or zero.");
            return false;
        }
        if (inputs.length > 1 && inputs.length < 4) {
            if (analyzer.isNegative(inputs[1]) || !analyzer.isNumeric(inputs[1])) {
                System.out.println("The second parameter should be a natural number.");
                return false;
            }
            if (inputs.length == 3) {
                if (!analyzer.okProperties(inputs[2])) {
                    System.out.println("The property [" + inputs[2].toUpperCase() + "] is wrong.");
                    System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY]");
                    return false;
                }
            }
        }
        return inputs.length <= 3;
    }
}
