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
public class single_inheritance
{
    public static void main(String args[])
    {
        a h=new a();
        h.pl();
        b y=new b();
        y.r();
    }
}

    