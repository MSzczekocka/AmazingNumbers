package numbers.display;

import numbers.number.NumberAnalyzer;
import numbers.request.Input;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MultiNumDisplay {
    protected void numbersDisplay(Input request){
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger(String.valueOf(request.getNumber()));
        for (int i = 0; i < request.getNoOfNum(); i++) {
            System.out.print(number + " is ");
            List<String> properties = new ArrayList<>();
            if (numberAnalyzer.checkBuzzNumber(number)){
                properties.add("buzz");
            }
            if (numberAnalyzer.isDuck(number)){
                properties.add("duck");
            }
            if (numberAnalyzer.isPalindromic(number)){
                properties.add("palindromic");
            }
            if(numberAnalyzer.isGapful(number)){
                properties.add("gapful");
            }
            if(numberAnalyzer.isSpy(number)){
                properties.add("spy");
            }
            if(numberAnalyzer.isEven(number)){
                properties.add("even");
            }else{
                properties.add("odd");
            }
            System.out.println(String.join(", ", properties));
            number = number.add(new BigInteger("1"));
        }
    }
}
