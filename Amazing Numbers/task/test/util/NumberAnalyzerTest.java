package util;

import numbers.request.NumberAnalyzer;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class NumberAnalyzerTest {
   @Test
    public void checkNumber_DivEnd7Test(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("77");
        boolean result = numberAnalyzer.checkBuzzNumber(number);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void checkNumber_Div7Test(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("21");
        //when
        boolean result = numberAnalyzer.checkBuzzNumber(number);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void checkNumber_End7Test(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("37");
        //when
        boolean result = numberAnalyzer.checkBuzzNumber(number);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void checkNumber_NokTest(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("50");
        //when
        boolean result = numberAnalyzer.checkBuzzNumber(number);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void checkParityNumber_OddTest(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("3");
        //when
        boolean result = numberAnalyzer.isEven(number);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void checkParityNumber_EvenTest(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("10");
        //when
        boolean result = numberAnalyzer.isEven(number);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isDuck_OkTest(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("10507");
        //when
        boolean result = numberAnalyzer.isDuck(number);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isDuck_NokTest(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("5889");
        //when
        boolean result = numberAnalyzer.isDuck(number);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void isPalindromic_OkTest(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("12588521");
        //when
        boolean result = numberAnalyzer.isPalindromic(number);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isPalindromic_OkTest2(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("1158511");
        //when
        boolean result = numberAnalyzer.isPalindromic(number);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isPalindromic_NokTest(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("14536");
        //when
        boolean result = numberAnalyzer.isPalindromic(number);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void isGapful_OkTest(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("7881");
        //when
        boolean result = numberAnalyzer.isGapful(number);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isGapful_NokTest(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("12");
        //when
        boolean result = numberAnalyzer.isGapful(number);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void isGapful_NokTest2(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        BigInteger number = new BigInteger("3753735");
        //when
        boolean result = numberAnalyzer.isGapful(number);
        //then
        Assert.assertFalse(result);
    }
}
