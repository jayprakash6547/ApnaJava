package Functions;

public class DoWhile {
    public static boolean InfiniteLoop(int n){
        do {
            System.out.println("This is a infinite loop");
        }while (true);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(InfiniteLoop(n));
    }
}
