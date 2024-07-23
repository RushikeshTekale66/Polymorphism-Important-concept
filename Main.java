class Main{
	public static void main(String [] args){
		Shape s = new Shape();
		s.area(10);
		s.area(10, 10);
		s.area(10.0, 10.0);
		s.area(10.5);		
	}
}

class Shape{
	public void area(int s){
		int area = s*s;
		System.out.println("Area of Square " + area);
	}
	public void area(int b, int h){
		int area = b*h;
		System.out.println("Area of reactangle " +area);
	}
	public void area(double b, double h){
		double area =( b*h)*(0.5);
		System.out.println("Area of Triangle " + area);
	}
	public void area(double r){
		double area = r * r * 3.14;
		System.out.println("Area of circle " + area);
	}
}

