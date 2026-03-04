class Salary{
    private int salary;
    public int getSalary(){
        return salary;
    }
    public void setSalary(int sal){
        this.salary=sal;
    }
}
    class Privatesalary{
        public static void main(String[] args){
            Salary s1=new Salary();
            s1.setSalary(100000);
            Salary s2=new Salary();
            s2.setSalary(50000); 
            s1.getSalary();
            s2.getSalary();
            System.out.println("Salary of s1 is=" + s1.getSalary());
            System.out.println("Salary of s2 is="+ s2.getSalary());
            
        }
    }
