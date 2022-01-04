package numbers.number;

import java.math.BigInteger;
import java.util.Calendar;

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

    public boolean isGapful(BigInteger number) {
        String numberS = String.valueOf(number);
        if(numberS.length()<3){
            return false;
        }
        String divS = numberS.charAt(0)+numberS.substring(numberS.length()-1);
        return (number.mod(new BigInteger(divS))).equals(new BigInteger("0"));
    }

    public boolean isSpy(BigInteger number){
        String numS = number.toString();
        BigInteger numAdd = new BigInteger("0");
        BigInteger numMul = new BigInteger("1");
        for (int i = 0; i < numS.length(); i++) {
            String temp = numS.substring(i,i+1);
            numAdd = numAdd.add(new BigInteger(temp));
        }
        for (int i = 0; i < numS.length(); i++) {
            String temp = numS.substring(i,i+1);
            numMul = numMul.multiply(new BigInteger(temp));
        }
        return numAdd.compareTo(numMul)==0;
    }

    public boolean isSquare(BigInteger number){
        BigInteger temp = number.sqrt();
        return number.compareTo(temp.multiply(temp))==0;
    }

    public boolean isSunny(BigInteger number){
        number = number.add(new BigInteger(("1")));
        BigInteger temp = number.sqrt();
        return  number.compareTo(temp.multiply(temp))==0;
    }

    public boolean isJumping(BigInteger number){
        String temp = number.toString();
        char[] digitsTemp = temp.toCharArray();
        int[] digits = new int[digitsTemp.length];
        for(int i =0; i< digitsTemp.length; i++){
            digits[i]= (int) digitsTemp[i];
        }
        if(digits.length>1){
            if(Math.abs(digits[0]-digits[1])!=1){
                return false;
            }
            if(Math.abs(digits[digits.length-1]-digits[digits.length-2])!=1){
                return false;
            }
            for(int i=1; i< digits.length-1; i++){
                if(Math.abs(digits[i]-digits[i+1])!=1){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isHappy(BigInteger number){
        while(number.compareTo(new BigInteger("1")) != 0 && number.compareTo(new BigInteger("4")) != 0){
            number = isHappyNumber(number);
        }

        return number.compareTo(new BigInteger("1")) == 0;

//        String numberS = String.valueOf(number);
//        while(number.compareTo(new BigInteger("1"))==0||number.compareTo(new BigInteger("4"))==0){
//            int temp = 0;
//            char[] digitsTemp = numberS.toCharArray();
//            int[] digits = new int[digitsTemp.length];
//            for(int i =0; i< digitsTemp.length; i++){
//                digits[i]= Character.getNumericValue(digitsTemp[i]);
//            }
//            for(int i =0; i< digits.length; i++){
//                temp += digits[i]*digits[i];
//            }
//            number = BigInteger.valueOf(temp);
//            numberS = Integer.toString(temp);
//        }
//        return number.compareTo(new BigInteger("1"))==0;
    }

    public static BigInteger isHappyNumber(BigInteger num){
        BigInteger rem = new BigInteger("0");
        BigInteger sum = new BigInteger("0");
        while(num.compareTo(new BigInteger("0")) > 0){
            rem = num.mod(new BigInteger("10"));
            sum = sum.add(rem.multiply(rem));
            num = num.divide(new BigInteger("10"));
        }
        return sum;
    }
}
