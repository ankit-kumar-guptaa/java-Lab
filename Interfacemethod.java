// interface method code by ANkit kumar gupta
interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
}

class BasicCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}

public class Interfacemethod{
    public static void main(String[] args) {
        Calculator calc = new BasicCalculator();
        int result1 = calc.add(5, 3);
        int result2 = calc.sub(5, 3);
        System.out.println("Addition result: " + result1);
        System.out.println("Subtraction result: " + result2);
    }
}
