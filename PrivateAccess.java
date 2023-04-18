//Ankit Kumar Gupta 20/383
class MyClass {
    private int privateVar;

    public void setPrivateVar(int value) {
        privateVar = value;
    }

    public int getPrivateVar() {
        return privateVar;
    }
}

public class PrivateAccess {
    public static void main(String[] args) {
        // System.out.println("------------Made By Ankit KUmar Gupta 20/383---------");
        System.out.println("-------------Private Access Program--------------");
        MyClass obj = new MyClass();
        obj.setPrivateVar(10);
        System.out.println("The value of private Var is: " + obj.getPrivateVar());
    }
}
//Ankit Kumar Gupta
