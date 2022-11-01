package primenumber.range;

public class RootNRange implements Range{
    @Override
    public int getRange(int N) {
        return (int) Math.sqrt(N);
    }
}
