package util;

import numbers.request.Input;
import numbers.request.InputGetter;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class InputGetterTest {
    @Test
    public void getInput_OkTest(){
        //given
        InputGetter inputGetter = new InputGetter();
        String input = "34";
        Input excepted = new Input(new BigInteger("34"),1,"all");
        //when
        Input result = inputGetter.getInput(input);
        //then
        Assert.assertEquals(excepted, result);
    }
    @Test
    public void getInput_OkTest2(){
        //given
        InputGetter inputGetter = new InputGetter();
        String input = "135 6";
        Input excepted = new Input(new BigInteger("135"),6,"all");
        //when
        Input result = inputGetter.getInput(input);
        //then
        Assert.assertEquals(excepted, result);
    }
}
