class Account{
    private int balance;
    public int accountholder;
    void display(){
        return balance;
    }
    public void accountholder(int bal){
        this.balance=bal;
    }
    class Bank{
        public static void main(String[] args){
            Account a1=new Account();
            a1.deposit amount(100000);
            Account a2=new Account();
            a2.amount(50000);
            a1.withdraw amount();
            a2.withdraw amount();
            System.out.println("Withdraw amount of:"+a1.withdraw amount);
            System.out.println("Withdraw amount of:"+a2.withdraw amount);
        }
    }
}