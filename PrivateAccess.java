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
        MyClass obj = new MyClass();
        obj.setPrivateVar(10);
        System.out.println("The value of private Var is: " + obj.getPrivateVar());
    }
}
//Ankit Kumar Gupta
