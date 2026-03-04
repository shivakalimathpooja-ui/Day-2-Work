class Laptop{
    String brand;
    int ram;
    double price;
    public Laptop(String brand,int ram,double price){
        this.brand=brand;
        this.ram=ram;
        this.price=price;
    }
    public void displaydetails(){
        System.out.println("-------Laptop details--------");
        System.out.println("brand:"+brand);
        System.out.println("ram:"+ram+"GB");
        System.out.println("price:$"+price);
        System.out.println("-------------------------------");
    }
    public static void main(String[] args){
        Laptop l1=new Laptop("Dell",24,300);
        l1.displaydetails();
        Laptop l2=new Laptop("Asus",20,100);
        l2.displaydetails();
    }
}