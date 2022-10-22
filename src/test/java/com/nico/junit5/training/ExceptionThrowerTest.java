package com.nico.junit5.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Nico Michael
 */
public class ExceptionThrowerTest {
    
    /**
     * Here we use a Lambda to wrap the call to the mathDivide method 
     * in the Assertion
     */
    
    void divideByZeroTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ExceptionThrower.mathDivide(5, 0);
	});  
    }
    
    /**
     * Here we use a Lambda to wrap the call to the aggumentValidator method 
     * in the Assertion
     */
    @Test
    void assertThrowsIllegalArgumentExceptionTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ExceptionThrower.aggumentValidator(null);
	});  
    }
    
    
    /**
     * Here we use a Lambda to wrap the call to the aggumentValidator method 
     * in the Assertion
     */
    @Test
    void assertThrowsMyCustomExceptionTest(){
        Assertions.assertThrows(MyCustomException.class, () -> {
            ExceptionThrower.throwCustomException("thROW");
	});  
    }
}

// ArrayIndexOutOfBoundsException 