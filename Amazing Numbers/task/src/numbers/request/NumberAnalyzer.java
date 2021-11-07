package numbers.request;

import java.math.BigInteger;

public class NumberAnalyzer {

    public boolean checkBuzzNumber(BigInteger number) {
        return isDivisible(number) || endWith7(number);
    }

    private static boolean isDivisible(BigInteger number){
        return (number.mod(new BigInteger("7"))).equals(new BigInteger("0"));
    }
    private static boolean endWith7(BigInteger number){
        String numS = String.valueOf(number);
        return numS.charAt(numS.length()-1)=='7';
    }

    public boolean isEven(BigInteger number) {
        return (number.mod(new BigInteger("2"))).equals(new BigInteger("0"));
    }

    public boolean isDuck(BigInteger number) {
        String numS = String.valueOf(number);
        return numS.contains("0");
    }

    public boolean isPalindromic(BigInteger number){
        String numberS = String.valueOf(number);
        String numReverse = new StringBuffer(numberS).reverse().toString();
        return numberS.equals(numReverse);
    }
}
