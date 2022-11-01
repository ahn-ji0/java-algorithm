package primenumber.range;

public class RootNRange implements Range{
    @Override
    public boolean compare(int i, int N) {
        return i * i <= N;
    }
}
