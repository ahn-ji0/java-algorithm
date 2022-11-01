package primenumber.range;

public class HalfNRange implements Range{
    @Override
    public int getRange(int N) {
        return (int) N/2;
    }
}
