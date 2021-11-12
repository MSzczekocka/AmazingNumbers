package numbers.request;

import java.math.BigInteger;

public class InputAnalyzer {
    public boolean isNumeric(String input){
        String newInput = input.replaceFirst(" ","");
        try{
            Double.parseDouble(newInput);
        }catch (NumberFormatException ex){
            return false;
        }
        return true;
    }

    public void isZero(String input){
        if(input.equals("0")){
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    public Input getInput(String input){
        int index = input.indexOf(" ");
        BigInteger number;
        int noOfNum;
        if(index==-1){
            number = new BigInteger(input);
            return new Input(number,1);
        }else{
            number = new BigInteger(input.substring(0,index));
            String noS = input.substring(index+1);
            noOfNum = Integer.parseInt(noS);
            return new Input(number,noOfNum);
        }
    }

}
