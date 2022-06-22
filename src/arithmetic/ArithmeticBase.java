/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
 
    double calculate(double x, double y) 
        {

   
        enum Operations{PLUS,MINUS,DIVIDE, MULTIPLY};
   
            double r = 0;
           for(Operations o: Operations.values() )
  
        {
          
        switch (o) 
        {
            case PLUS:
                r= x + y;
            case MINUS:
                r = x - y;
            case MULTIPLY:
                r = x * y;
            case DIVIDE:
                r = x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
        return r;
   
}
        }