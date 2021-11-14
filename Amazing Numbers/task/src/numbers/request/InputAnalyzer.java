package numbers.request;

import java.math.BigInteger;

public class InputAnalyzer {
    public boolean isValid(String input){
        BigInteger number;
        String newInput = input.replaceFirst(" ","");
        if(isNegative1(input)){
            System.out.println("The first parameter should be a natural number or zero.");
            return false;
        }
        if(isNegative2(input)){
            System.out.println("The second parameter should be a natural number.");
            return false;
        }
        try{
            number = new BigInteger(newInput);
        }catch (NumberFormatException ex){
            System.out.println("The first parameter should be a natural number or zero.");
            return false;
        }
        return true;
    }

    public boolean isNegative1(String input){
        return input.charAt(0)=='-';
    }

    public boolean isNegative2(String input){
        return input.contains("-");
    }

    public void isZero(String input){
        if(input.equals("0")){
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }
}
