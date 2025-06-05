import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SnakeAndLadder {
    public int snakesAndLadders(int[][] board) {
    return Stream.of(
            IntStream.range(0,board.length* board.length).boxed().reduce(new int[board.length* board.length],
                    (a,i)->(
                            (i/ board.length)%2==0
                            )?())
    )
    }
}
