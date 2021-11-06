package numbers.request;

public class NumberAnalyzer {

    public void checkBuzzNumber(int number) {
        if (isDivisible(number)&&endWith7(number)){
            System.out.println("It is a Buzz number");
            System.out.println("Explanation:");
            System.out.println(number + " is divisible by 7 and ends with 7");
        }else if (isDivisible(number)){
            System.out.println("It is a Buzz number");
            System.out.println("Explanation:");
            System.out.println(number + " is divisible by 7");
        }else if (endWith7(number)){
            System.out.println("It is a Buzz number");
            System.out.println("Explanation:");
            System.out.println(number + " ends with 7");
        }else{
            System.out.println("It is not a Buzz number.");
            System.out.println("Explanation:");
            System.out.println(number + " is neither divisible by 7 nor does it end with 7");
        }
    }

    private static boolean isDivisible(int number){
        return number%7==0;
    }
    private static boolean endWith7(int number){
        String numS = String.valueOf(number);
        return numS.charAt(numS.length()-1)=='7';
    }

    public void checkParityNumber(int number) {
        if(number%2==0){
            System.out.println("This number is Even.");
        }else{
            System.out.println("This number is Odd.");
        }
    }
}
