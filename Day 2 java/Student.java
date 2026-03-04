class Main{
    static int rollno;
    static String name;
    static int marks;
    void display(){
        System.out.println(rollno +  " " + name + " " + marks);
    }
}
    class Student{
    public static void main(String[] args){
        Main s1=new Main();
        s1.rollno=22;
        s1.name="pooja";
        s1.marks=86;
        s1.display();
    }
}
