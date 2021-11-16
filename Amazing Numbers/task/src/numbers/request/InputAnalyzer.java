package numbers.request;

import java.math.BigInteger;
import java.util.Arrays;

public class InputAnalyzer {

    public boolean isNegative(String input){
        return input.charAt(0)=='-';
    }

    public boolean isNumeric(String input){
        try{
            BigInteger number = new BigInteger(input);
        }catch (NumberFormatException ex){
            return false;
        }
        return true;
    }

    public boolean okProperties(String input){
        String[] ok = {"even","odd","buzz","duck","palindromic","gapful","spy"};
        return Arrays.asList(ok).contains(input.toLowerCase());
    }

    public void isZero(String input){
        if(input.equals("0")){
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }
}
