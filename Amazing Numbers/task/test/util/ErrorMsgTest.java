package util;

import numbers.request.ErrorMsg;
import org.junit.Assert;
import org.junit.Test;

public class ErrorMsgTest {
    @Test
    public void startWithSpace_OkTest(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = " 653";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertFalse(result);
    }
    @Test
    public void have2Spaces_OkTest(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = "33  sunny";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertFalse(result);
    }
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
    @Test
    public void isValid_multiOkTest(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = "35 2 even duck";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isValid_multiNokTest(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = "12 4 even spy";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void isValid_multiNokTest2(){
        //given
        ErrorMsg errorMsg = new ErrorMsg();
        String input = "78 3 even odd spy duck";
        //when
        boolean result = errorMsg.isValid(input);
        //then
        Assert.assertFalse(result);
    }
}
