package util;

import numbers.request.Input;
import numbers.request.InputAnalyzer;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;

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
    @Test
    public void okProperties_okTest(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        ArrayList<String> request = new ArrayList<>();
        request.add("spy");
        //when
        String result = analyzer.okProperties(request);
        //then
        Assert.assertEquals("ok",result);
    }
    @Test
    public void okProperties_nokTest(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        ArrayList<String> request = new ArrayList<>();
        request.add("abc");
        //when
        String result = analyzer.okProperties(request);
        //then
        Assert.assertEquals("abc",result);
    }
    @Test
    public void okProperties_nokTest2(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        ArrayList<String> request = new ArrayList<>();
        request.add("xyz");
        request.add("zzz");
        //when
        String result = analyzer.okProperties(request);
        //then
        Assert.assertEquals("xyz, zzz",result);
    }
    @Test
    public void theSame_okTest(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        ArrayList<String> request = new ArrayList<>();
        request.add("-even");
        request.add("even");
        request.add("duck");
        request.add("palindromic");
        //when
        ArrayList<String> result = InputAnalyzer.theSame(request);
        ArrayList<String> result2 = new ArrayList<>();
        result2.add("EVEN, -EVEN");
        //then
        Assert.assertTrue(result2.containsAll(result));
        Assert.assertEquals(1, result.size());
    }



}
