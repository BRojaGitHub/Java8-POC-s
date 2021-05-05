interface IStat
{
    static void show()
    {
        System.out.println("Static Interface Demo");
    }
}

public class StaticInterfaceEg implements IStat
{
    public static void main(String[] args)
    {
        IStat.show();
    }
}


/*
Output : Static Interface Demo
*/