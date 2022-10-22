package com.nico.junit5.training;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Nico Michael
 */
public class OperationsPerformerTest {
    
    @Test
    void assertNotNullTest(){
        String result = OperationsPerformer.concat("The ","quick brown fox");
        Assert.assertNotNull(result);
    }
    
    @Test
    void assertNullTest(){
        String result = OperationsPerformer.returnNull();
        Assert.assertNull(result);
    }
    
    
    @Test
    void assertTrueTest(){
        int sum=OperationsPerformer.add(2,3);
        Assert.assertTrue(5 == sum);
    }
    
    @Test
    void assertFalseTest(){
        int sum=OperationsPerformer.add(2,3);
        Assert.assertFalse(6 == sum);
    }
    @Test
    void assertEqualsTest(){
        int sum=OperationsPerformer.add(2,3);
        int expectedResult=5;
        assertEquals(expectedResult,sum);
    }
    
    @Test
    void assertNotEqualsTest(){
        int sum=OperationsPerformer.add(2,3);
        Assert.assertNotEquals(6,sum);
    }
    
    
    /**
     * DO NOT WRITE COMPLICATED TESTS 
     * ITS RECOMENDED YOU DONT DO MORE THAN ONE LOGICAL TEST 
     * AND MORE THAN TWO ASSERTIONS
     */
    @Test
    void thisIsABadTest(){
        String result = null;
        
        result = OperationsPerformer.concat("The ","quick brown fox");
        Assert.assertNotNull(result);

        result = OperationsPerformer.returnNull();
        Assert.assertNull(result);

        int sum=OperationsPerformer.add(2,3);
        Assert.assertTrue(5 == sum);

        sum=OperationsPerformer.add(2,3);
        Assert.assertFalse(6 == sum);
 
        sum=OperationsPerformer.add(2,3);
        int expectedResult=5;
        assertEquals(expectedResult,sum);

        sum=OperationsPerformer.add(2,3);
        Assert.assertNotEquals(6,sum);
    }
    
}
