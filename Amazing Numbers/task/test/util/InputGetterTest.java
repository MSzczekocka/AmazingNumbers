package util;

import numbers.request.Input;
import numbers.request.InputGetter;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;

public class InputGetterTest {
    @Test
    public void getInput_OkTest(){
        //given
        InputGetter inputGetter = new InputGetter();
        String input = "34";
        ArrayList<String> props = new ArrayList<>();
        props.add("all");
        Input excepted = new Input(new BigInteger("34"),0,props);
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
        ArrayList<String> props = new ArrayList<>();
        props.add("all");
        Input excepted = new Input(new BigInteger("135"),6,props);
        //when
        Input result = inputGetter.getInput(input);
        //then
        Assert.assertEquals(excepted, result);
    }
    @Test
    public void getInput_OkTest3(){
        //given
        InputGetter inputGetter = new InputGetter();
        String input = "135 6 sunny odd";
        ArrayList<String> props = new ArrayList<>();
        props.add("sunny");
        props.add("odd");
        Input excepted = new Input(new BigInteger("135"),6,props);
        //when
        Input result = inputGetter.getInput(input);
        //then
        Assert.assertEquals(excepted, result);
    }
}
