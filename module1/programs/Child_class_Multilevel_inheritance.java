package module1.programs;
class GrandParent{                             // Grandparent class
	void GrandParent()
{
		System.out.println("GrandParent Class");
		}
}
class Parent_Class extends GrandParent{           // parent class multilevel Inheritance 
	void Parent() {
		System.out.println("Parent Class");
		
	}
}

public class Child_class_Multilevel_inheritance extends Parent_Class { // child class multilevel inheritance
	void Child() {
		System.out.println("Child Class");
		
	}

	public static void main(String[] args) {
		Child_class_Multilevel_inheritance p1=new Child_class_Multilevel_inheritance();
		p1.GrandParent();
		p1.Parent();
		p1.Child();

	}

}
