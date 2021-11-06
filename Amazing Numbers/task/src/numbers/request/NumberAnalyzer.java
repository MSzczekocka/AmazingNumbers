package numbers.request;

public class NumberAnalyzer {

    public String checkBuzzNumber(int number) {
        if (isDivisible(number)&&endWith7(number)){
            return number + " is divisible by 7 and ends with 7";
        }else if (isDivisible(number)){
            return number + " is divisible by 7";
        }else if (endWith7(number)){
            return number + " ends with 7";
        }else{
            return number + " is neither divisible by 7 nor does it end with 7";
        }
    }

    private static boolean isDivisible(int number){
        return number%7==0;
    }
    private static boolean endWith7(int number){
        String numS = String.valueOf(number);
        return numS.charAt(numS.length()-1)=='7';
    }

    public String checkParityNumber(int number) {
        if(number%2==0){
            return "This number is Even.";
        }
        return "This number is Odd.";
    }
}
