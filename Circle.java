class Circle 
{

java.util.Scanner s =new java.util.Scanner(System.in)
double radius;

void area()
{
radius =s.nextDouble();
System.out.println("The area of the circle"+Math.PI*radius*radius);

}

void perimeter()
{
radius=s.nextDouble();
System.out.println("The perimeter of the circle is" + 2*Math.PI*radius);

}

}
