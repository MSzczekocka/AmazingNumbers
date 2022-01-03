package util;

import numbers.request.InputAnalyzer;
import org.junit.Assert;
import org.junit.Test;


public class InputAnalyzerTest {
    @Test
    public void isNegative_okTest(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        String request = "-45";
        //when
        boolean result = analyzer.isNegative(request);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isNegative_nokTest(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        String request = "436";
        //when
        boolean result = analyzer.isNegative(request);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void isNumeric_okTest(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        String request = "7993";
        //when
        boolean result = analyzer.isNumeric(request);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isNumeric_nokTest(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        String request = "xyz";
        //when
        boolean result = analyzer.isNumeric(request);
        //then
        Assert.assertFalse(result);
    }
//    @Test
//    public void okProperties_okTest(){
//        //given
//        InputAnalyzer analyzer = new InputAnalyzer();
//        String request = "spy";
//        //when
//        boolean result = analyzer.okProperties(request);
//        //then
//        Assert.assertTrue(result);
//    }
//    @Test
//    public void okProperties_nokTest(){
//        //given
//        InputAnalyzer analyzer = new InputAnalyzer();
//        String request = "abc";
//        //when
//        boolean result = analyzer.okProperties(request);
//        //then
//        Assert.assertFalse(result);
//    }
}
