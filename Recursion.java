public class Recursion{
    static int func(int n){
        int result;
        if(n<=1)
        return 1;
        result = func(n-3)+func(n-2);
        return result;
    }
    public static void main(String args[]){
        System.out.print(func(7));
    }
}