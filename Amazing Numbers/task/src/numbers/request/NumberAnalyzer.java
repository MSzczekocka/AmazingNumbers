package numbers.request;

public class NumberAnalyzer {

    public boolean checkBuzzNumber(int number) {
        return isDivisible(number) || endWith7(number);
    }

    private static boolean isDivisible(int number){
        return number%7==0;
    }
    private static boolean endWith7(int number){
        String numS = String.valueOf(number);
        return numS.charAt(numS.length()-1)=='7';
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
