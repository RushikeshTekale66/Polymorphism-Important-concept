public class Main {
	public static void main(String [] args) {
	Student o = new Student("Rushikesh", 10);
	int total = o.getMarks(50,50,50);
	int per = o.getMarks(total, 3);
	
	System.out.println("Total is : " + total + " & percentage is : "+ per);
	o.displayInfo();
	
	}
}


class Student {
	String name;
	int id;
	int total;
	int per;
	
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public int getMarks(int sub1, int sub2, int sub3) {
		total = sub1 + sub2 + sub3;
		return total;
	}
	public int getMarks(int totalMark, int totalSub ) {
		per = totalMark/totalSub;
		return per;
	}
	
	public void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(total);
		System.out.println(per);
	}
}
