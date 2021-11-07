package numbers.display;

import numbers.request.NumberAnalyzer;

public class PropertiesDisplay {

    public void displayProperties(int number){
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        System.out.println("Properties of " + number);
        System.out.println("        even: " + numberAnalyzer.isEven(number));
        System.out.println("         odd: " + !numberAnalyzer.isEven(number));
        System.out.println("        buzz: " + numberAnalyzer.checkBuzzNumber(number));
        System.out.println("        duck: " + numberAnalyzer.isDuck(number));
        System.out.println(" palindromic: " + numberAnalyzer.isPalindromic(number));
    }
}
