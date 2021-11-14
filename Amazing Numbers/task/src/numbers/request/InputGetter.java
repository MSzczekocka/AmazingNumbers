package numbers.request;

import java.math.BigInteger;

public class InputGetter {
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
