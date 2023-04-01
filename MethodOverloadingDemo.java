// overloading program provide by Ankit kumar gupta
class MethodOverloadingDemo {
    void sum(int a, int b) {
        System.out.println("Sum of two integers: "+(a+b));
    }
    void sum(int a, int b, int c) {
        System.out.println("Sum of three integers: "+(a+b+c));
    }
    public static void main(String args[]) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        obj.sum(10, 20);
        obj.sum(10, 20, 30);
    }
}