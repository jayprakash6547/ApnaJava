package Functions;

public class FindAvg {
    public  static int FindAverage(int a,int b,int c){
        int ans=(a+b+c)/3;
        return ans;
    }
    public static void main(String[] args) {
//        int a=10,b=10,c=19;
        System.out.println(FindAverage(10,10,10));
    }
}
