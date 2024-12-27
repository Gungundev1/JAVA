package Oops.Polymorphism;
class Calculate{
    float radius;
    int  length;
    int width;
   int base;
    float height;
    public void calculateArea(float radius){


        System.out.println("Area of circle is: "+radius*radius);
    }
    public void calculateArea(int length,int width){

        System.out.println("Area of Rectangle is: "+length*width);
    }
    public void calculateArea(int base,float height){

        System.out.println("Area of Triangle is: "+(base*height)/2);
    }
}
public class CompileTime {
    public static void main(String[] args) {
        Calculate c=new Calculate();
        c.calculateArea(3.5F);
        c.calculateArea(4,6);
        c.calculateArea(5,7F);
    }
}
