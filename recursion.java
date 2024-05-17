public class recursion {
    public static void printFibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFibo(b, c, n-1);

    }

    //factorial
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_n=n*fact(n-1);
        return fact_n;


    }
    //sum of n natural numbers
    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);


    }
    public static void main(String[] args) {
        int a=0 , b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printFibo(a,b,n-2);
        int ans =fact(n);
        System.out.println( "factorial of a num is " +  ans);
        printSum(1, 5, 0);
       // System.out.println("the sum of n natural num is " + d);
    }
    
}
