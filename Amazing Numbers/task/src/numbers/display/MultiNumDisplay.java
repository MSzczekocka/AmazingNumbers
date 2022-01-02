package numbers.display;

import numbers.request.Input;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiNumDisplay {
    protected void numbersDisplay(Input request){
        PropertiesFinder propertiesFinder = new PropertiesFinder();
        BigInteger number = new BigInteger(String.valueOf(request.getNumber()));
        if(request.getProperty().contains("all")){
            for (int i = 0; i < request.getNoOfNum(); i++) {
                System.out.print(number + " is ");
                System.out.println(propertiesFinder.findProperties(number));
                number = number.add(new BigInteger("1"));
            }
        }else {
            int temp=0;
            List<String> props = new ArrayList<>();
            props = Arrays.asList(propertiesFinder.findProperties(number).split(", "));
            while(temp<request.getNoOfNum()){
                if(props.containsAll(request.getProperty())){
                   System.out.print(number + " is ");
                   System.out.println(propertiesFinder.findProperties(number));
                   temp++;
                }
                number = number.add(new BigInteger("1"));
                props = Arrays.asList(propertiesFinder.findProperties(number).split(", "));
            }
        }
    }
}
