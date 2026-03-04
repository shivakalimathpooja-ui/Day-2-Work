class Person{
    private int age;
    public void setage(int a){
        if(a>=0){
            this.age=a;
        }else{
            System.out.println("Age cannot be negative");
        }
    }
    public int getage(){
        return age;
    }
    public static void main(String[] args){
        Person p1=new Person();
        p1.setage(25);
        Person p2=new Person();
        p2.setage(-9);
        System.out.println("Age of p1 is:" + p1.getage());
        System.out.println("Age of p2 is:" + p2.getage());
    }
}
