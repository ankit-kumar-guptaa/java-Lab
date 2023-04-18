// overloading program provide by Ankit kumar gupta 20/383
class MethodOverloadingDemo {
    void sum(int a, int b) {
        System.out.println("Sum of two integers: "+(a+b));
    }
    void sum(int a, int b, int c) {
        System.out.println("Sum of three integers: "+(a+b+c));
    }
    public static void main(String args[]) {
        System.out.println("------------Made By Navneet Kumar 20/1362---------");
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        obj.sum(10, 20);
        obj.sum(10, 20, 30);
    }
}