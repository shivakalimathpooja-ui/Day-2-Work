class Car{
    private int speed;
    public void setSpeed(int s){
        if(s>=0){
            this.speed=s;
        }else{
            System.out.println("speed cannot be negative");
        }
    }
        public int getSpeed(){
            return speed;
        }
    }
        class Privatespeed{
        public static void main(String[] args){
            Car c1=new Car();
            c1.setSpeed(20);
            Car c2=new Car();
            c2.setSpeed(40);
            System.out.println("Car of c1 is=" +c1.getSpeed());
            System.out.println("Car of c2 is=" +c2.getSpeed());
        }
}


