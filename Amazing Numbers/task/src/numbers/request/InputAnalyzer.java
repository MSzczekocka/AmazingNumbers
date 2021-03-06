package numbers.request;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        String[] ok = {"even","odd","buzz","duck","palindromic","gapful","spy", "sunny", "square","jumping", "happy", "sad",
                        "-even","-odd","-buzz","-duck","-palindromic","-gapful","-spy", "-sunny", "-square","-jumping", "-happy", "-sad"};
        String result = "";
        for(String prop:input){
            if(!Arrays.asList(ok).contains(prop.toLowerCase())){
                result = result + prop + ", ";
            }
        }
        return result.equals("")? "ok": result.substring(0,result.length()-2);
    }

    public ArrayList<String> isMutuallyExcl(ArrayList<String> input){
        ArrayList<String> result = new ArrayList<>();
        input.addAll(toLowerLetters(input));
        if(input.contains("even")&&input.contains("odd")){
            result.add("EVEN, ODD");
        }
        if(input.contains("-even")&&input.contains("-odd")){
            result.add("-EVEN, -ODD");
        }
        if(input.contains("duck")&&input.contains("spy")){
            result.add("DUCK, SPY");
        }
        if(input.contains("-duck")&&input.contains("-spy")){
            result.add("-DUCK, -SPY");
        }
        if(input.contains("sunny")&&input.contains("square")){
            result.add("SUNNY, SQUARE");
        }
        if(input.contains("-sunny")&&input.contains("-square")){
            result.add("-SUNNY, -SQUARE");
        }
        if(input.contains("happy")&&input.contains("sad")){
            result.add("HAPPY, SAD");
        }
        if(input.contains("-happy")&&input.contains("-sad")){
            result.add("-HAPPY, -SAD");
        }
        ArrayList<String> result2 = theSame(input);
        if(result2.size()>0){
            result.addAll(result2);
        }
        return result;
    }

    public static ArrayList<String> theSame(ArrayList<String> input){
        String[] props = {"even","odd","buzz","duck","palindromic","gapful","spy", "sunny", "square","jumping", "happy", "sad"};
        ArrayList<String> result = new ArrayList<>();
        for(String prop : props){
            if(input.contains(prop)&&input.contains("-"+prop)){
                result.add(prop.toUpperCase()+", "+"-"+prop.toUpperCase());
            }
        }
        return result;
    }

    public void isZero(String input){
        if(input.equals("0")){
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    public static List<String> toLowerLetters(List<String> input){
        return input.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }
}
