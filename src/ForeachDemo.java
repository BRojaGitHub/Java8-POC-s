import java.util.*;
 
public class ForeachDemo 
{
    public static void main(String[] argv) throws Exception
    {
 
        try 
        {
 
            Integer a[]= new Integer[] { 3, 4, 5, 6 };
 
            List<Integer> list = Arrays.asList(a);
 
            System.out.println("The list is: " + list);
            list.forEach(i -> System.out.println(i));
        }
 
        catch (NullPointerException e) 
        {
            System.out.println("Exception thrown : " + e);
        }
    }
}

/*
Output :
The list is: [3, 4, 5, 6]
3
4
5
6
*/