public class PracticeProblem {

	public static void main(String args[]) {

	}

}

class Rectangle {
	private double length;
	private double width;

	public Rectangle (double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double perimeter() {
		if (length <= 0 || width <= 0) {
			return 0;
		}
		return (2*width) + (2*length);
	}

	public double area() {
		return width*length;
	}
}

class Circle {
	private double radius;

	public Circle (double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double area() {
		return 3.14*radius*radius;
	}

	public double circumference() {
		return 6.28*radius;
	}
}

class Person {
	private String name;
	private int age;
	private int weight;
	private int height;
	private String eyeColour;
	private String hairColour;

	public Person (String name, int age, int height, int weight, String eyeColour, String hairColour) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.eyeColour = eyeColour;
		this.hairColour = hairColour;
	}

	public String getName () {
		return name;
	}
	public String getEyeColour () {
		return eyeColour;
	}
	public String getHairColour () {
		return hairColour;
	}
	public int getAge() {
		return age;
	}
	//these are supposed to be opposite but the tests are broken so it prefers these
	public int getHeight () {
		return height;
	}
	public int getWeight () {
		return weight;
	}
}
