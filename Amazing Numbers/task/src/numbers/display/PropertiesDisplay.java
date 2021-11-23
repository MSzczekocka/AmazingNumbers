package numbers.display;

import numbers.request.Input;

public class PropertiesDisplay {

    public void displayProperties(Input request) {
        SingleNumDisplay singleNumDisplay = new SingleNumDisplay();
        MultiNumDisplay multiNumDisplay = new MultiNumDisplay();
        if (request.getNoOfNum() == 1) {
            singleNumDisplay.numberDisplay(request);
        } else {
            multiNumDisplay.numbersDisplay(request);
        }
//        else{
//
//        }
    }
}
