package com.hpu.maven;

import org.junit.Test;
import static junit.framework.Assert.*;

public class TestHello {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String str = hello.sayHello("zyn");
        System.out.println(str);
        //断言 判断结果和你预想的结果是否相同
        assertEquals("Hello zyn!",str);
    }
}
