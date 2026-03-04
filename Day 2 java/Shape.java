class Shape{
public void area(int side){
int area=side*side;
System.out.println("Area of square: " + area);
}
public void area(int length,int width){
    int area=length*width;
    System.out.println("Area of rectangle: " + area);
}
public static void main(String[] args){
    Shape s1=new Shape();
    s1.area(4);
    s1.area(12,10);
}
}
