class A
{
    public A(){
        super();
        System.out.println(" this in A");
    }

    public A(int a){
        super();
        System.out.println(" this in A int " + a);
    }
}

class B extends A
{
    public B(){
        super();
        System.out.println(" this is B");
    }

    public B(int b){
        this(); // menjalankan constructor default pada class yg sama
        System.out.println(" this is B int");
    }
}
public class Hello 
{
    public static void main(String a[])
    {
        B obj = new B(5);
    }
}


