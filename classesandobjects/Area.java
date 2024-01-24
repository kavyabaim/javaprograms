package classesandobjects;

public class Area 
{
	double circle, square, rectangle, triangle;
	float radius, side, base, height, length, width;
	
	public Area() {
		radius = 3;
		side = 4;
		base = 2;
		height = 4;
		length = 3;
		width = 6;
	}
	public Area(float radius, float side, float base, float height, float length, float width) {
		this.radius = radius;
    	this.side = side;
    	this.base = base;
    	this.height = height;
    	this.length = length;
    	this.width = width;
	}
	public void circleArea() 
	{
		circle = 3.14*radius*radius;
		System.out.println("Circle Area: "+circle);
	}
	public void squareArea() 
	{
		square = side*side;
		System.out.println("Square Area: "+square);
	}
	public void rectangleArea() 
	{
		rectangle = length*width;
		System.out.println("Rectangle Area: "+rectangle);
	}
	public void triangleArea() 
	{
		triangle = 0.5*base*height;
		System.out.println("Triangle Area: "+triangle);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Area area1 = new Area();
		area1.circleArea();
        area1.squareArea();
        area1.rectangleArea();
        area1.triangleArea();
        
        Area area2 = new Area(10, 5, 4, 6, 12, 18);
		area2.circleArea();
        area2.squareArea();
        area2.rectangleArea();
        area2.triangleArea();
	}

}
