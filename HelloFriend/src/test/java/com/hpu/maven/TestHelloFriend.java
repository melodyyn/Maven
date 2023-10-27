package com.hpu.maven;

import org.junit.Test;
import static junit.framework.Assert.*;

public class TestHelloFriend {
    @Test
    public void test(){
        HelloFriend helloFriend = new HelloFriend();
        String s = helloFriend.sayHelloToFriend("zyn");
        System.out.println(s);
        assertEquals("Hello zyn! I am Idea",s);

    }
}
