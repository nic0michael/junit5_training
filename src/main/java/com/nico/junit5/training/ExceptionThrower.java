
package com.nico.junit5.training;

/**
 *
 * @author Nico Michael
 */
public class ExceptionThrower {
    
    public static void aggumentValidator(String arg){
        if(arg==null){
            throw new IllegalArgumentException();
        }
    }
    
    public static int mathDivide(int x, int y){
        if(y==0){
            throw new IllegalArgumentException("You cant divide by zero");
        }
        return x/y;        
    }
    
    public static String throwCustomException(String text) throws MyCustomException{
        if(null!=text && "THROW".equalsIgnoreCase(text)){
            throw new MyCustomException("You chosse to throw this Exception");
        }
        return text;        
    }
}
