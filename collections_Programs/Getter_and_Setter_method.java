package collections_Programs;

class Getter_and_Setter_method {
	private int age=10;   //from 10 to 25
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age=age;
		
	}	
	public static void main(String[] args) {
		Getter_and_Setter_method s1= new Getter_and_Setter_method();
		s1.setAge(25);
		System.out.println(s1.getAge());

	}

}

