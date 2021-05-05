import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpleAnnanyomousClass
{
    public static void main(String[] args)
        {
            System.out.println("Consumer Implementation with AnonymousClass");

            List<Integer> values=Arrays.asList(7,5,6,2);
            System.out.println("Consumer Type 1");
            Consumer<Integer> c= new Consumer<Integer>()
            {
                public void accept(Integer i)
                {
                    System.out.println("Array Values : "+i);
                }
            };
            values.forEach(c);

            System.out.println("Consumer Type 2");
            Consumer<Integer> c1=(Integer i1) ->
            {
                System.out.println(i1);
            };
            values.forEach(c1);

            System.out.println("Consumer Type 3");
            Consumer<Integer> c2=(Integer i2) -> System.out.println(i2);
            values.forEach(c2);

            System.out.println("Consumer Type 4");
            Consumer<Integer> c3=i3-> System.out.println(i3);
            values.forEach(c3);

        }
}
/*
Output :

Consumer Implementation with AnonymousClass
Consumer Type 1
Array Values : 7
Array Values : 5
Array Values : 6
Array Values : 2
Consumer Type 2
7
5
6
2
Consumer Type 3
7
5
6
2
Consumer Type 4
7
5
6
2


*/