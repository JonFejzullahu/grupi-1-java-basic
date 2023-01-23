package methods;

public class TestMyClass {
    public static void main(String[] args) {
        MyClass.myMethod();
        MyClass.myMethod();

        System.out.println(MyClass.name);

        MyClass myClass = new MyClass();
        myClass.myMethod2();
        System.out.println(myClass.name2);
    }
}
