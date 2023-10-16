public class slip14b{
    public static void main(String[]args)
    {
        int base=2;
        int exponents=5;
        long result=power(base, exponents);
        System.out.println(base+"raised to power"+exponents+"is:"+result);

    }
    public static long power(int base,int exponents){
        if(exponents ==0 )
        return 1;
        else if(exponents == 1)
        return base;
        else{
            return base*power(base,exponents -1);
        }
    }
}