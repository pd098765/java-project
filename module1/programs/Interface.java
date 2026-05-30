package module1.programs;

interface A {
    void method1(); // Abstract method (implicitly public)
}
public class Interface implements A {
    
    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.method1();
    }
    public void method1() {
        System.out.println("Original Logic");
    }
}
