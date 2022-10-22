package com.nico.junit5.training;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Nico Michael
 */
public class FootballSearchEngineTest {
    
    @Test
    void searchForBuffaloBillsTest(){
        String expectedValue="Buffalo Bills";
        String result = FootballSearchEngine.search("BUF");
        Assert.assertNotNull(result);
        System.out.println("Found "+result);
        Assert.assertEquals( expectedValue, result);
    }
    
    @Test
    void searchNegativeTest(){
        String expectedValue="Search for XXXX returned no values";
        String result = FootballSearchEngine.search("XXXX");
        Assert.assertNotNull(result);
        System.out.println("Found "+result);
        Assert.assertEquals( expectedValue, result);
    }
}
