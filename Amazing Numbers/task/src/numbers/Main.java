package numbers;

import numbers.display.PropertiesDisplay;
import numbers.request.Input;
import numbers.request.NumberGetter;

public class Main {
    public static void main(String[] args) {
        NumberGetter numberGetter = new NumberGetter();
        PropertiesDisplay propertiesDisplay = new PropertiesDisplay();
        Input request;
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("");
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;");
        System.out.println("  * the second parameters show how many consecutive numbers are to be processed;");
        System.out.println("- two natural numbers and two properties to search for;");
        System.out.println("- a property preceded by minus must not be present in numbers;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.");
        System.out.println("");

        for (; ; ) {
            request = numberGetter.getNumber();
            propertiesDisplay.displayProperties(request);
        }
    }
}
