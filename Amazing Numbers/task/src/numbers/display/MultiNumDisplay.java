package numbers.display;

import numbers.number.NumberAnalyzer;
import numbers.request.Input;

import java.math.BigInteger;

public class MultiNumDisplay {
    protected void numbersDisplay(Input request){
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        PropertiesFinder propertiesFinder = new PropertiesFinder();
        BigInteger number = new BigInteger(String.valueOf(request.getNumber()));
        if(request.getProperty().equals("all")){
            for (int i = 0; i < request.getNoOfNum(); i++) {
                System.out.print(number + " is ");
                System.out.println(propertiesFinder.findProperties(number));
                number = number.add(new BigInteger("1"));
            }
        }else {
            int temp=0;
            while(temp<request.getNoOfNum()){
                if(propertiesFinder.findProperties(number).contains(request.getProperty())){
                   System.out.print(number + " is ");
                   System.out.println(propertiesFinder.findProperties(number));
                   temp++;
                }
                number = number.add(new BigInteger("1"));
            }
        }
    }
}
