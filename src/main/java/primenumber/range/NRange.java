package primenumber.range;

public class NRange implements Range{
    @Override
    public boolean compare(int i, int N) {
        return i < N;
    }
}
