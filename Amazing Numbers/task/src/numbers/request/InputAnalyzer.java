package numbers.request;

import java.math.BigInteger;
import java.util.ArrayList;
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

    public String okProperties(ArrayList<String> input){
        String[] ok = {"even","odd","buzz","duck","palindromic","gapful","spy"};
        String result = "";
        for(String prop:input){
            if(!Arrays.asList(ok).contains(prop)){
                result = result + prop + ", ";
            }
        }
        return result.equals("")? "ok": result.substring(0,result.length()-2);
    }

    public ArrayList<String> isMutuallyExcl(ArrayList<String> input){
        ArrayList<String> result = new ArrayList<>();
        if(input.contains("even")&&input.contains("odd")){
            result.add("EVEN, ODD");
        }else if(input.contains("duck")&&input.contains("spy")){
            result.add("DUCK, SPY");
        }else if(input.contains("sunny")&&input.contains("square")){
            result.add("SUNNY, SQUARE");
        }
        return result;
    }

    public void isZero(String input){
        if(input.equals("0")){
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }
}
