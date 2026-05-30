package myCodes;
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

public class Multilevel_inheritance extends Parent_Class { // child class multilevel inheritance
	void Child() {
		System.out.println("Child Class");
		
	}

	public static void main(String[] args) {
		Multilevel_inheritance p1=new Multilevel_inheritance();
		p1.GrandParent();
		p1.Parent();
		p1.Child();

	}

}
