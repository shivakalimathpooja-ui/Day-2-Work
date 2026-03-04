class Methodoverloading{
    String title;
    String author;
    double price;
public Methodoverloading(String title,String author,double price){
    this.title=title;
    this.author=author;
    this.price=price;
}
public void displaydetails(){
    System.out.println("title:"+title);
    System.out.println("author:"+author);
    System.out.println("price:"+price);
}
public static void main(String[] args){
    Methodoverloading b1=new Methodoverloading("you can win","shiv khera",132);
    Methodoverloading b2=new Methodoverloading("you can","George marthew",100);
    System.out.println("b1 details:");
    b1.displaydetails();
    System.out.println("b2 details:");
    b2.displaydetails();
    }
}

