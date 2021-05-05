interface Parser
{
    String Parse(String str);
}

class StringParser
{
    public static String convert(String s)
    {
        if (s.length()<=3)
        {
            s = s.toUpperCase();
        } else
        {
            s = s.toLowerCase();
        }
        return s;
    }
}

class MyParser
{
    public void print(String str, Parser p)
    {
        str=p.Parse(str);
        System.out.println("After Conversion : "+str);
    }
}

public class MethodParserDiffEgs
{
    public static void main(String[] args)
    {
        System.out.println("Original String : Roja B");
        String str ="Roja B";
        MyParser m= new MyParser();

        m.print(str, new Parser()
                {
                    @Override
                    public String Parse(String str)
                    {
                        return StringParser.convert(str);
                    }
                });

        m.print(str,(String s)->StringParser.convert(s));
        m.print(str,(StringParser::convert));

    }
}


/*
Output :
Original String : Roja B
After Conversion : roja b
After Conversion : roja b
After Conversion : roja b

Process finished with exit code 0

*/

