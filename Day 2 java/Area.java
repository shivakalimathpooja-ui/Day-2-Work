class Rectangle{
    int length;
    int width;
    void display(){
        int area=length*width;
        System.out.println("Length:"+length + ",width:" + width);
        System.out.println("Area:"+area);
    }
}
    class Area{
        public static void main(String[] args){
            Rectangle r1=new Rectangle();
            r1.length=4;
            r1.width=3;
            r1.display();
        }
    }
