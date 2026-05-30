package module1.programs;
interface A1 {
    void methodAs();
}
interface A2 {
    void methodBs();
}
interface A3 {
    void methodCs();
}
interface A4 {
    void methodDs();
}
public class MultiPleLevel_Inheritance implements A1, A2, A3, A4 {

    public static void main(String[] args) {
        MultiPleLevel_Inheritance obj = new MultiPleLevel_Inheritance();
        obj.methodAs();
        obj.methodBs();
        obj.methodCs();
        obj.methodDs();
    }
    public void methodAs() {
        System.out.println("Logic for Interface A1 executed");
    }
    public void methodBs() {
        System.out.println("Logic for Interface A2 executed");
    }
    public void methodCs() {
        System.out.println("Logic for Interface A3 executed");
    }
    public void methodDs() {
        System.out.println("Logic for Interface A4 executed");
    }
}
