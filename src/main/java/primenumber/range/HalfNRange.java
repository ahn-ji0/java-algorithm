package primenumber.range;

public class HalfNRange implements Range{
    @Override
    public boolean compare(int i, int N) {
        return i <= N/2;
    }
}
