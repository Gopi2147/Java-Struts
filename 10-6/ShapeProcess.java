package com.Training;

abstract class Shape{
	 protected String name;
	  protected int side;
	  
	  Shape(){}
	  Shape(String name,int side)
	  {
		  this.name=name;
		  this.side=side;
	  }
	  
	  public void display(){
	    System.out.println("Name:"+name);
		System.out.println("side:"+side);
	  }
	  abstract public void area(); 
	  abstract public void perimeter();

	}

	class Rectangle extends Shape{
		private int length;
		private int breadth;
		
		Rectangle(){}
		Rectangle(String name, int length,int breadth){
			super(name,4);
			this.length=length;
			this.breadth=breadth;
		}
		
		public void display(){
			super.display();
			System.out.println("length:"+length);
			System.out.println("Breadth:"+breadth);
		}
		
		public void area(){
			System.out.println("Area:"+length*breadth);
		}
		
		public void perimeter(){
			System.out.println("Perimeter:"+2*(length+breadth));
		}
	}

	class Square extends Shape{
		private int side;
		
		Square(){}
		Square(String name, int side)
		{
			super(name,4);
			this.side=side;
		}
		public void display(){
			super.display();
			System.out.println("Side:"+side);
			
		}
		
		public void area(){
			System.out.println("Area:"+side*side);
		}
		
		public void perimeter(){
			System.out.println("Perimeter:"+4*side);
		}
	}



	class Triangle extends Shape{
		private int base;
		private int height;
		
		Triangle(){};
		Triangle(String name, int base,int height)
		{
			super(name,3);
			this.base=base;
			this.height=height;
		}
		public void display(){
			super.display();
			System.out.println("base:"+base);
			System.out.println("height:"+height);
			
		}
		
		public void area(){
			System.out.println("Area:"+base*height*0.5);
		}
		
		public void perimeter(){
			System.out.println("Perimeter: "+base+height);
		}
	}
	
	class Circle extends Shape{
		private int radius;
		Circle(String name, int radius){
			super(name, 0);
			this.radius= radius;
		}
			public void display() {
				super.display();
				System.out.println("Radius: "+ radius);
			}
			public void area() {
				System.out.println("Area: "+3.14*radius);
			}
			public void perimeter() {
				System.out.println("Perimeter: "+2*3.14*radius);
			}
		}
public class ShapeProcess {
	
 public static void process(Shape s) {
	s.display();
	s.area();
	s.perimeter();
	System.out.println();
 }
 public static void main(String[] args) {

	 
	 process(new Rectangle("rectangle", 4, 6));
	 process(new Square("square", 5));
	 process(new Triangle("triangle", 6, 8));
	 process(new Circle("circle", 7));
}
}
