package com.cuo.helloTest;
import static org.junit.Assert.assertEquals;

import com.cuo.helloWorld.HelloWorld;
import org.junit.Test;
/**
 * Created by cuo on 3/31/15.
 */
public class HelloWorldTest {
    @Test
    public void testSayHello(){
        HelloWorld helloWorld =new HelloWorld();
        String result =helloWorld.sayHello();
        assertEquals("Hello Maven\n",result);
    }

}
