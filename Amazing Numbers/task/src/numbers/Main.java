package numbers;

import numbers.display.PropertiesDisplay;
import numbers.request.NumberAnalyzer;
import numbers.request.NumberGetter;

public class Main {
    public static void main(String[] args) {
        NumberGetter numberGetter = new NumberGetter();
        PropertiesDisplay propertiesDisplay = new PropertiesDisplay();
        int number = numberGetter.getNumber();
        propertiesDisplay.displayProperties(number);
    }
}
