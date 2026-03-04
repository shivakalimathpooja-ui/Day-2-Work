class Prime{
    static void isPrime(int n){
        int i=2, sum=0;
        while(i<n){
            if(n%i==0){
                sum=sum+i;
            }
            i++;
        }
            if(sum>=1){
                System.out.println("false");
            }else{
                System.out.println("true");
            }
        }
        public static void main(String[] args){
            isPrime(9);
        }
    }



