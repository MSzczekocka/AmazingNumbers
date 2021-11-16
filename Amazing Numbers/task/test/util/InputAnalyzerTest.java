package util;

import numbers.request.ErrorMsg;
import numbers.request.InputAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class InputAnalyzerTest {

    @Test
    public void isNegative_OkTest(){
        //given
        InputAnalyzer inputAnalyzer = new InputAnalyzer();
        String input = "-6547";
        //when
        boolean result = inputAnalyzer.isNegative(input);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isNegative_OkTest2(){
        //given
        InputAnalyzer inputAnalyzer = new InputAnalyzer();
        String input = "-4788 1";
        //when
        boolean result = inputAnalyzer.isNegative(input);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isNegative_OkTest4(){
        //given
        InputAnalyzer inputAnalyzer = new InputAnalyzer();
        String input = "-985 -4";
        //when
        boolean result = inputAnalyzer.isNegative(input);
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void isNumeric_NokTest5(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        String input = "sdg dhdg";
        //when
        boolean result = analyzer.isNumeric(input);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void okProperties_OkTest(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        String input = "Spy";
        //when
        boolean result = analyzer.okProperties(input);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void okProperties_Ok2Test(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        String input = "EvEn";
        //when
        boolean result = analyzer.okProperties(input);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void okProperties_NokTest(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        String input = "fhjsshvgsfk";
        //when
        boolean result = analyzer.okProperties(input);
        //then
        Assert.assertFalse(result);
    }
}
