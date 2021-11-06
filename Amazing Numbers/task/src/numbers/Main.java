package numbers;

import numbers.request.NumberAnalyzer;
import numbers.request.NumberGetter;

public class Main {
    public static void main(String[] args) {
        NumberGetter numberGetter = new NumberGetter();
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        int number = numberGetter.getNumber();
        numberAnalyzer.checkBuzzNumber(number);
        numberAnalyzer.checkParityNumber(number);
    }
}
