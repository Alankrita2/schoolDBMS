package functional_programming;

interface Mathematics{
    public int calc(int a, int b);
}

public class DemoClass {

    public static void main(String[] args) {
        Mathematics obj = (a,b)->(a+b);
        Mathematics obj1 = (a,b)->(a-b);
        Mathematics obj2 = (a,b)->(a*b);
        System.out.println(obj1.calc(10, 20));
    }

    
}
