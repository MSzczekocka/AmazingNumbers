package numbers.display;

import numbers.number.NumberAnalyzer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PropertiesFinder {
    public String findProperties(BigInteger number){
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
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
        if(numberAnalyzer.isSquare(number)){
            properties.add("square");
        }
        if(numberAnalyzer.isSunny(number)){
            properties.add("sunny");
        }
        if(numberAnalyzer.isJumping(number)){
            properties.add("jumping");
        }
        if(numberAnalyzer.isEven(number)){
            properties.add("even");
        }else{
            properties.add("odd");
        }
        return String.join(", ", properties);
    }
}
