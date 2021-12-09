import java.util.Scanner;
class Rectangle extends Shape 



{
Scanner s=new Scanner(System.in);

void area()
{
 
System.out.println("Enter the length of the rectangle");

length=s.nextInt();

System.out.println("Enter the breadth of the rectangle");

breadth=s.nextInt();



System.out.println("The area of t he rectangle is "+length*breadth);

}



void perimeter()
{

System.out.println(2*(length+breadth));
}

}