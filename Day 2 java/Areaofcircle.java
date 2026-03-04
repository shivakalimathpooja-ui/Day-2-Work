class Areaofcircle{
    public void area(float pi,int radius){
        float area=pi*radius*radius;
        System.out.println("Area of circle:"+area);
    }
    public void circumference(float pi,int radius){
        float circumference=2*pi*radius;
        System.out.println("Circumference of circle:"+circumference);
    }
    public static void main(String[] args){
        Areaofcircle a1=new Areaofcircle();
        a1.area(3.14f,4);
        a1.circumference(3.14f,4);
    }
}