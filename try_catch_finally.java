import java.util.*;
public class try_catch_finally {
    public static void main(String args[])
    {
        //try
        try{
            int d=90/0;
        }catch(ArithmeticException v)
        {
            System.out.println("bad request");
        }
        //catch &try
        try{
            int d=90/0;
        }catch(ArithmeticException v) {
            System.out.println("catch block is running");
        }
        //finally
        System.out.println("finally is running");
    }
}

