package ai.bassplayer.test_20.test;

import ai.bassplayer.test_20.HelloWorld;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    public void test(){
        HelloWorld h = new HelloWorld("1是1","1是1");
        System.err.println(h.compare());
        Assert.assertEquals(1D,h.compare(),0.1D);
    }
}

