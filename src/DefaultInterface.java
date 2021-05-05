// methods in java
interface DInterface
{
    // abstract method
    public void square(int a);
  
    // default method
    default void show()
    {
      System.out.println("Default Method Executed");
    }
}
  
public class DefaultInterface implements DInterface
{
    public void square(int a)
    {
        System.out.println(a*a);
    }
  
    public static void main(String args[])
    {
        DefaultInterface d = new DefaultInterface();
        d.square(4);
        d.show();
    }
}


/*

Output :
16
Default Method Executed

*/