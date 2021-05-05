import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface ConInterface
{
    static void show(List<Integer> listOfIntegers, Consumer<Integer> consumer)
    {
        for(Integer integer:listOfIntegers)
        {
            consumer.accept(integer);
        }
    }
}
class ConsumerFunctionExample implements ConInterface {
    public static void main(String args[]) {
        Consumer<Integer> consumer = i -> System.out.print(" " + i);
        System.out.println("Consumer Interface Example");
        List<Integer> integerList = Arrays.asList(1, 10, 200, 101, -10, 0);

        ConInterface.show(integerList, consumer);
    }
}


/*
Output :
Consumer Interface Example
 1 10 200 101 -10 0
 */