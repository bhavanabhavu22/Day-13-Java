import java.util.*;
public class throws
{
    public static void main(String args[])
    {
      //try-catch
      try{
        throw new Exception("Error");
      }
      catch(Exception e)
      {
        System.out.println(e.getMessage());
      }
    }
}