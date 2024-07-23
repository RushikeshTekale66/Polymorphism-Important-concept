class Main{
	public static void main(String [] args){
		Person p = new Person("Rushikesh", 23, 5.5);

		//1
		p.displayInfo();

		//2
		p.displayInfo(1, 10000);
	
		//3
		boolean result = p.displayInfo(true);
		System.out.println(result);
	}
}

class Person{
	String name;
	int age;
	double height;

	Person(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}

	//1
	public void displayInfo(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}

	//2
	protected void displayInfo(int eid, int salary){
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(eid);
		System.out.println(salary);
	}

	//3
	boolean displayInfo(boolean result){
		return result;
	}
}