package numbers.request;

import java.math.BigInteger;
import java.util.ArrayList;

public class InputGetter {
    public Input getInput(String input){
        int index = input.indexOf(" ");
        long count = input.codePoints().filter(ch -> ch == ' ').count();
        int noOfNum;
        BigInteger number;
        ArrayList<String> props = new ArrayList<>();

        if(count==0){
            number = new BigInteger(input);
            props.add("all");
            return new Input(number,1,props);
        }else if(count==1){
            number = new BigInteger(input.substring(0,index));
            String noS = input.substring(index+1);
            noOfNum = Integer.parseInt(noS);
            props.add("all");
            return new Input(number,noOfNum,props);
        }else{
            String[] result = input.split(" ");
            number = new BigInteger(result[0]);
            for (int i=2 ; i< result.length;i++){
                props.add(result[i]);
            }
            return new Input(number,Integer.parseInt(result[1]),props);
        }
    }
}
