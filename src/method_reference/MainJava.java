package method_reference;
// IN JAVA 8
public class MainJava {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        int sum = calculator.calculate(9, 5, new Operator() {
//            @Override
//            public int invoke(int x, int y) {
//                return x + y;
//            }
//        });

//        int sum = calculator.calculate(9, 5, Integer::sum);
        int sum = calculator.calculate(9, 5, Calculator::sum);

//        int mul = calculator.calculate(9, 5, new Operator() {
//            @Override
//            public int invoke(int x, int y) {
//                return x * y;
//            }
//        });

//        int mul = calculator.calculate(9, 5, (x, y) -> x * y);
        int mul = calculator.calculate(9, 5, Calculator::mul);

//        int sub = calculator.calculate(9, 5, new Operator() {
//            @Override
//            public int invoke(int x, int y) {
//                return x - y;
//            }
//        });

//        int sub = calculator.calculate(9, 5, (x, y) -> x - y);
        int sub = calculator.calculate(9, 5, Calculator::sub);

//        int div = calculator.calculate(9, 5, new Operator() {
//            @Override
//            public int invoke(int x, int y) {
//                return x / y;
//            }
//        });

//        int div = calculator.calculate(9, 5, (x, y) -> x / y);
        int div = calculator.calculate(9, 5, Calculator::div);

        System.out.println(sum);
        System.out.println(mul);
        System.out.println(sub);
        System.out.println(div);
    }
}
