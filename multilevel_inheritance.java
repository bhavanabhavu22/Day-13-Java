
import java.util.*;
class a
{
    public void  pl(){
        System.out.println("hello students");
    }
} class b extends a {
    public void r() {
        System.out.println("hello teachers");
    }
}
class c extends b {
    public void r1()
    {
        System.out.println("hello proffesers");
    }
}

public class multilevel_inheritance
{
    public static void main(String args[])
    { 
        c f=new c();
        f.pl();
        f.r();
        f.r1();
    }


}

