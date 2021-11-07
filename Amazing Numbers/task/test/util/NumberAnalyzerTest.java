package util;

import numbers.request.NumberAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class NumberAnalyzerTest {
    @Test
    public void checkNumber_DivEnd7Test(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        int number = 77;
        //when
        boolean result = numberAnalyzer.checkBuzzNumber(number);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void checkNumber_Div7Test(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        int number = 21;
        //when
        boolean result = numberAnalyzer.checkBuzzNumber(number);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void checkNumber_End7Test(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        int number = 37;
        //when
        boolean result = numberAnalyzer.checkBuzzNumber(number);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void checkNumber_NokTest(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        int number = 50;
        //when
        boolean result = numberAnalyzer.checkBuzzNumber(number);
        //then
        Assert.assertFalse(result);
    }

    @Test
    public void checkParityNumber_OddTest(){
        //given
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        int number = 3;
        //when
        boolean result = numberAnalyzer.isEven(number);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void checkParityNumber_EvenTest(){
        //given
        NumberAnalyzer numberParityAnalyzer = new NumberAnalyzer();
        int number = 10;
        //when
        boolean result = numberParityAnalyzer.isEven(number);
        //then
        Assert.assertTrue(result);
    }
}
