class Product{
    private String name;
    private double price;
    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setprice(double price){
        if(price>=0){
            this.price=price;
        }else{
            System.out.println("No price will be negative");
        }
    }
}
class Products{
    public static void main(String[] args){
        Product p1=new Product("Choclate",2);
        System.out.println("Products of p1:" +p1.getName());
        System.out.println("Products of p1:"+p1.getPrice());
    }
}