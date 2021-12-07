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
        ArrayList<String> props= new ArrayList<>();
        props.add("all");
        Input excepted = new Input(new BigInteger("34"),1,props);
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
        ArrayList<String> props= new ArrayList<>();
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
        String input = "345 6 sunny";
        ArrayList<String> props= new ArrayList<>();
        props.add("sunny");
        Input excepted = new Input(new BigInteger("345"),6,props);
        //when
        Input result = inputGetter.getInput(input);
        //then
        Assert.assertEquals(excepted, result);
    }
    @Test
    public void getInput_OkTest4(){
        //given
        InputGetter inputGetter = new InputGetter();
        String input = "8784 2 sunny even";
        ArrayList<String> props= new ArrayList<>();
        props.add("sunny");
        props.add("even");
        Input excepted = new Input(new BigInteger("8784"),2,props);
        //when
        Input result = inputGetter.getInput(input);
        //then
        Assert.assertEquals(excepted, result);
    }
}
