package Functions;

public class Greatest {
    public static int GreatestOfTwoNumbers(int a,int b){
        if(a>b){
            return a;
        } else
            return b;
    }

    public static void main(String[] args) {
        int a=100,b=25;
        System.out.println(GreatestOfTwoNumbers(a,b));
    }
}
