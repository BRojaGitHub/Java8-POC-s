interface A {
    void show();
}

public class LambdaDemo {
    public static void main(String args[]) {
        A obj = new A()         //Anonymous Class
        {
            public void show() {
                System.out.println("Lambda Demo Executed with Anonymous Class");
            }
        };
        obj.show();
    }
}

/*
Output : Lambda Demo Executed with Anonymous Class
*/