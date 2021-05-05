interface AnonymousInter
{
    void show(int i);
}

public class LambdaDemoWOAnonymousClass
{
    public static void main(String[] args)
    {
        AnonymousInter obj;
        obj=i-> System.out.println("Lambda Demo Without Anonymous Executed with : " + i);
        obj.show(7);
    }
}

/*
Output :
Lambda Demo Without Anonymous Executed with : 7
*/