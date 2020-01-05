package com.code.Jenkinspipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
   
	@Test
    public void testApp()
    {
        assertEquals(30,App.operations(5, 6));
    }
}
