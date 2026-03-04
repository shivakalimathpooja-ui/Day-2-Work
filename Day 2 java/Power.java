class Power{
    public static long power(int base,int exponent){
        if(exponent < 0){
            System.out.println("Exponent must be non-negative");
        }
        long result=1;
        for(int i = 0; i < exponent; i++){
           result *= base;
        }
        return result;
    }
        public static void main(String[] args){
            int base = 2;
            int exponent = 3;
            long result = power(base, exponent);
        
        System.out.println(base + " to the power of " + exponent + " is: " + result);
    }
}
