package util;

import numbers.request.Input;
import numbers.request.InputAnalyzer;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class InputAnalyzerTest {
    @Test
    public void isNumeric_OkTest(){
        //given
        InputAnalyzer inputAnalyzer = new InputAnalyzer();
        String input = "1000";
        //when
        boolean result = inputAnalyzer.isNumeric(input);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isNumeric_OkTest2(){
        //given
        InputAnalyzer inputAnalyzer = new InputAnalyzer();
        String input = "3434 4";
        //when
        boolean result = inputAnalyzer.isNumeric(input);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isNumeric_NokTest(){
        //given
        InputAnalyzer inputAnalyzer = new InputAnalyzer();
        String input = "ABCabc";
        //when
        boolean result = inputAnalyzer.isNumeric(input);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void isNumeric_NokTest2(){
        //given
        InputAnalyzer inputAnalyzer = new InputAnalyzer();
        String input = "3434   4  ";
        //when
        boolean result = inputAnalyzer.isNumeric(input);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void getInput_OkTest(){
        //given
        InputAnalyzer inputAnalyzer = new InputAnalyzer();
        String input = "34";
        Input excepted = new Input(new BigInteger("34"),1);
        //when
        Input result = inputAnalyzer.getInput(input);
        //then
        Assert.assertEquals(excepted, result);
    }
    @Test
    public void getInput_OkTes2t(){
        //given
        InputAnalyzer inputAnalyzer = new InputAnalyzer();
        String input = "135 6";
        Input excepted = new Input(new BigInteger("135"),6);
        //when
        Input result = inputAnalyzer.getInput(input);
        //then
        Assert.assertEquals(excepted, result);
    }
}
