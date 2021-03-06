package util;

import numbers.request.ErrorMsg;
import org.junit.Assert;
import org.junit.Test;

public class ErrorMsgTest {
    @Test
    public void isNumeric_OkTest(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = "1000";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isNumeric_OkTest2(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = "3434 4";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isNumeric_NokTest(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = "ABCabc";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void isNumeric_NokTest2(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = "3434   4  ";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void isNegative_NokTest5(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = "5835 -8283";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void isValid_NokTest6(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = "35 83 125";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void isValid_OkTest7(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = "5835 3 spy";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isValid_NokTest8(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = "77 12 even 124";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertFalse(result);
    }
}
