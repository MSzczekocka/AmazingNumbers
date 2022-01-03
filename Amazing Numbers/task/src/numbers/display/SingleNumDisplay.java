package numbers.display;

import numbers.number.NumberAnalyzer;
import numbers.request.Input;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumDisplay {
    protected void numberDisplay(Input request){
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        PropertiesFinder propertiesFinder = new PropertiesFinder();
        BigInteger number = new BigInteger(String.valueOf(request.getNumber()));

        if (!request.getProperty().contains("all")){
            List<String> props = new ArrayList<>();
            List<String> props2 =request.getProperty();
            for(int i=0; i<props2.size();i++){
                props2.set(i,props2.get(i).toLowerCase());
            }
            props = Arrays.asList(propertiesFinder.findProperties(number).split(", "));
            while (!props.containsAll(props2)){
                props = Arrays.asList(propertiesFinder.findProperties(number).split(", "));
                number = number.add(new BigInteger("1"));
            }
        }

        System.out.println("Properties of " + number);
        System.out.println("        buzz: " + numberAnalyzer.checkBuzzNumber(number));
        System.out.println("        duck: " + numberAnalyzer.isDuck(number));
        System.out.println(" palindromic: " + numberAnalyzer.isPalindromic(number));
        System.out.println("      gapful: " + numberAnalyzer.isGapful(number));
        System.out.println("         spy: " + numberAnalyzer.isSpy(number));
        System.out.println("      square: " + numberAnalyzer.isSquare(number));
        System.out.println("       sunny: " + numberAnalyzer.isSunny(number));
        System.out.println("     jumping: " + numberAnalyzer.isJumping(number));
        System.out.println("        even: " + numberAnalyzer.isEven(number));
        System.out.println("         odd: " + !numberAnalyzer.isEven(number));
        System.out.println("       happy: " + numberAnalyzer.isHappy(number));
        System.out.println("         sad: " + !numberAnalyzer.isHappy(number));
        System.out.println("");
    }
}
