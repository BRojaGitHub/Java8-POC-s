import java.util.Arrays;
import java.util.List;

public class MethodRefernceEg
{
    public static void main(String[] args)
    {
        List<String> names= Arrays.asList("Roja","Ram","Sam","Shrav");
        names.forEach(System.out::println);

        String str ="Roja B";
        MethodToPass m= new MethodToPass();
        m.print(str);
    }
}

class MethodToPass {
    public void print(String str) {
        System.out.println("Creating method to pass : " + str);
    }
}



/*
Output :
Roja
Ram
Sam
Shrav
Creating method to pass : Roja B

Process finished with exit code 0

*/