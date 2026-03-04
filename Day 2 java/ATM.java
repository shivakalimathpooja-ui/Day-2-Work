import java.util.Scanner;
class ATM{
    private int balance=10000;
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            ATM atm=new ATM();
            System.out.println("Enter the Cash:");
            int cash=sc.nextInt();
            if(cash<=atm.balance){
                System.out.println("Sufficient for withdrawal");
            }else{
                System.out.println("Not Sufficient for withdrawal");
            }
        }
    }