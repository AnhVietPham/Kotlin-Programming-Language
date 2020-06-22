package method_reference;

public class Calculator {

    public int calculate(int x, int y, Operator operator) {
        return operator.invoke(x, y);
    }

    public static int sum(int x, int y){
        return x + y;
    }

    public static int sub(int x, int y){
        return x - y;
    }

    public static int mul(int x, int y){
        return x * y;
    }

    public static int div(int x, int y){
        return x / y;
    }
}
