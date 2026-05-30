package module1.programs;
class ConcreteClass {
    void concreteMethod1() {
        System.out.println("ConcreteClass: Method 1 (Concrete)");
    }
    void concreteMethod2() {
        System.out.println("ConcreteClass: Method 2 (Concrete)");
    }
}
abstract class AbstractClass extends ConcreteClass {
    void abstractClassConcreteMethod() {
        System.out.println("AbstractClass: Concrete Method");
    }
    abstract void mandatoryAbstractMethod();
}

class DerivedClass extends AbstractClass {
    void mandatoryAbstractMethod() {
        System.out.println("DerivedClass: Implemented the Abstract Method");
    }
}
public class MLI_Concrete_Abstract {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.concreteMethod1();
        obj.concreteMethod2();
        obj.abstractClassConcreteMethod();
        obj.mandatoryAbstractMethod();
    }
}
