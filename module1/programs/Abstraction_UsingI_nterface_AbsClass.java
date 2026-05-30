package module1.programs;
interface S3 {
    void method6();
}
abstract class S2 implements S3 {
    abstract void method5();

    static void method7() {
        System.out.println("Exposing this logic (Static Method)");
    }
}
public class Abstraction_UsingI_nterface_AbsClass extends S2 {
    public static void main(String[] args) {
        Abstraction_UsingI_nterface_AbsClass obj = new Abstraction_UsingI_nterface_AbsClass();
        obj.method6();
        obj.method5();
        S2.method7(); 
    }
    @Override
    public void method6() {
        System.out.println("Logic for method6 (from Interface)");
    }
    @Override
    void method5() {
        System.out.println("Logic for method5 (from Abstract Class)");
    }
}
