package numbers.request;

import java.math.BigInteger;

public class InputGetter {
    public Input getInput(String input){
        int index = input.indexOf(" ");
        long count = input.codePoints().filter(ch -> ch == ' ').count();
        int noOfNum;
        BigInteger number;

        if(count==0){
            number = new BigInteger(input);
            return new Input(number,1,"all");
        }else if(count==1){
            number = new BigInteger(input.substring(0,index));
            String noS = input.substring(index+1);
            noOfNum = Integer.parseInt(noS);
            return new Input(number,noOfNum,"all");
        }else{
            String[] result = input.split(" ");
            number = new BigInteger(result[0]);
            String prop = "";
            for (int i=2 ; i< result.length;i++){
                prop = prop +" " + result[i];
            }
            prop = prop.substring(1);
            return new Input(number,Integer.parseInt(result[1]),prop.toLowerCase());
        }
    }
}
