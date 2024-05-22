@FunctionalInterface
interface A
{
    int add(int i, int j) ;
}

public class Hello 
{
    public static void main(String a[])
    {
      A obj = (i, j)->  i+j; // i+j disini sama dengan return i+j
      obj.add(5, 8 );
    }
}