package numbers.display;

import numbers.request.Input;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
            List<String> props2 =request.getProperty();
            List<String> noProps2 = new ArrayList<>();
            for(int i=0; i<props2.size();i++){
                props2.set(i,props2.get(i).toLowerCase());
                if(props2.get(i).startsWith("-")){
                    noProps2.add(props2.get(i).substring(1));
                }
            }
            props2 = removeMinus(props2);
            props = Arrays.asList(propertiesFinder.findProperties(number).split(", "));
            while(temp<request.getNoOfNum()){
                if(props.containsAll(props2)&!props.containsAll(noProps2)){
                   System.out.print(number + " is ");
                   System.out.println(propertiesFinder.findProperties(number));
                   temp++;
                }
                number = number.add(new BigInteger("1"));
                props = Arrays.asList(propertiesFinder.findProperties(number).split(", "));
            }
        }
    }

    public static List<String> removeMinus(List<String> list) {
        return list.stream()
                .filter(e -> !e.startsWith("-"))
                .collect(Collectors.toList());
    }
}
