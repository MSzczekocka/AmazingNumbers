package numbers.request;

import java.util.ArrayList;

public class ErrorMsg {

    public boolean isValid(String input) {
        InputAnalyzer analyzer = new InputAnalyzer();
        InputGetter getter = new InputGetter();
        String[] inputs = input.split(" ");
        Input request = getter.getInput(input);

        if (analyzer.isNegative(inputs[0]) || !analyzer.isNumeric(inputs[0])) {
            System.out.println("The first parameter should be a natural number or zero.");
            return false;
        }
        if (inputs.length > 1) {
            if (analyzer.isNegative(inputs[1]) || !analyzer.isNumeric(inputs[1])) {
                System.out.println("The second parameter should be a natural number.");
                return false;
            }
            if (inputs.length > 2) {
                String result = analyzer.okProperties(request.getProperty());
                ArrayList<String> result2 = analyzer.isMutuallyExcl(request.getProperty());
                StringBuilder temp = new StringBuilder();
                if (!result.equals("")) {
                    System.out.println("The property [" + result + "] is wrong.");
                    System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY]");
                    return false;
                }
                if(result2.size()>0){
                    for (String s : result2) {
                        temp.append(" [").append(s).append("] ");
                    }
                    System.out.println("The request contains mutually exclusive properties:" + temp);
                    System.out.println("There are no numbers with these properties.");
                    return false;
                }

            }
        }
        return true;
    }
}
