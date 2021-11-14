package numbers.display;

import numbers.number.NumberAnalyzer;
import numbers.request.Input;

import java.math.BigInteger;

public class SingleNumDisplay {
    protected void numberDisplay(Input request){
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger(String.valueOf(request.getNumber()));
        System.out.println("Properties of " + number);
        System.out.println("        buzz: " + numberAnalyzer.checkBuzzNumber(number));
        System.out.println("        duck: " + numberAnalyzer.isDuck(number));
        System.out.println(" palindromic: " + numberAnalyzer.isPalindromic(number));
        System.out.println("      gapful: " + numberAnalyzer.isGapful(number));
        System.out.println("        even: " + numberAnalyzer.isEven(number));
        System.out.println("         odd: " + !numberAnalyzer.isEven(number));
    }
}
