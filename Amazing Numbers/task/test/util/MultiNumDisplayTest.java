package util;

import numbers.display.MultiNumDisplay;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MultiNumDisplayTest {
    @Test
    public void removeMinus_Test(){
        //given
        List<String> props = new ArrayList<>();
        props.add("-even");
        props.add("sunny");
        //when
        props = MultiNumDisplay.removeMinus(props);
        //then
        Assert.assertFalse(props.contains("-even"));
        Assert.assertTrue(props.contains("sunny"));
    }
    @Test
    public void removeMinus_Test2(){
        //given
        List<String> props = new ArrayList<>();
        props.add("-odd");
        props.add("-sunny");
        props.add("-happy");
        props.add("even");
        //when
        props = MultiNumDisplay.removeMinus(props);
        //then
        Assert.assertFalse(props.contains("-odd"));
        Assert.assertFalse(props.contains("-sunny"));
        Assert.assertFalse(props.contains("-happy"));
        Assert.assertTrue(props.contains("even"));
    }
    @Test
    public void removeMinus_Test3(){
        //given
        List<String> props = new ArrayList<>();
        props.add("sunny");
        props.add("happy");
        props.add("even");
        //when
        props = MultiNumDisplay.removeMinus(props);
        //then
        Assert.assertTrue(props.contains("sunny"));
        Assert.assertTrue(props.contains("happy"));
        Assert.assertTrue(props.contains("even"));
    }
    @Test
    public void removeMinus_Test4(){
        //given
        List<String> props = new ArrayList<>();
        props.add("-duck");
        props.add("-square");
        //when
        props = MultiNumDisplay.removeMinus(props);
        //then
        Assert.assertEquals(0,props.size());
    }
}
