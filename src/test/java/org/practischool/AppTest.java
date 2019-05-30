package org.practischool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.practischool.App.xiaoXiong;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void xiaoXiongReturnValue() {
        assertEquals(xiaoXiong().toLowerCase(), "xiao xiong");
    }
}
