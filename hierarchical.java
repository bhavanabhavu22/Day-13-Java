
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
class c extends a {
    public void r1()
    {
        System.out.println("hello proffesers");
    }
}

public class hierarchical
{
    public static void main(String args[])
    { 
        b h=new b();
        c h1=new c();
        h.r();
        h.pl();
        h1.r1();
        h1.pl();
    }



}


