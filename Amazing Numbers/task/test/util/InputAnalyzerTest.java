package util;

import numbers.request.InputAnalyzer;
import org.junit.Assert;
import org.junit.Test;

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
        request.add("Spy");
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
    public void okProperties_okTest2(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        ArrayList<String> request = new ArrayList<>();
        request.add("sunny");
        request.add("even");
        //when
        String result = analyzer.okProperties(request);
        //then
        Assert.assertEquals("ok",result);
    }
    @Test
    public void okProperties_nokTest2(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        ArrayList<String> request = new ArrayList<>();
        request.add("sunny");
        request.add("qwerty");
        //when
        String result = analyzer.okProperties(request);
        //then
        Assert.assertEquals("qwerty",result);
    }
    @Test
    public void isMutuallyExcl_okTest(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        ArrayList<String> request = new ArrayList<>();
        request.add("sunny");
        request.add("even");
        //when
        ArrayList<String> result = analyzer.isMutuallyExcl(request);
        //then
        Assert.assertEquals(0,result.size());
    }
    @Test
    public void isMutuallyExcl_nokTest(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        ArrayList<String> request = new ArrayList<>();
        request.add("odd");
        request.add("even");
        //when
        ArrayList<String> result = analyzer.isMutuallyExcl(request);
        //then
        Assert.assertEquals("EVEN, ODD",result.get(0));
    }
    @Test
    public void isMutuallyExcl_nokTest2(){
        //given
        InputAnalyzer analyzer = new InputAnalyzer();
        ArrayList<String> request = new ArrayList<>();
        request.add("odd");
        request.add("even");
        request.add("duck");
        request.add("spy");
        //when
        ArrayList<String> result = analyzer.isMutuallyExcl(request);
        //then
        Assert.assertEquals("EVEN, ODD",result.get(0));
        Assert.assertEquals("DUCK, SPY",result.get(2));
    }
}
