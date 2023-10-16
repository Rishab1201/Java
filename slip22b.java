public class slip22b {
    public static void main(String[] args){
        int n=5;
        long factorial=fact(n);
        System.out.println("FACTORIAL IS:"+factorial);
    }

    public static long fact(int n){
        if(n==0|| n==1)
        {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
