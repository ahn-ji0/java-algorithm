package minMax;

//코드업 2081
public class MinMaxValPoly {
    private int getMinOrMax(int[] arr, Compare compare){
        int val = arr[0];
        int idx = 0;

        for(int i=0;i<arr.length;i++){
            boolean yes = compare.compare(arr[i],val);
            if(yes){
                val = arr[i];
                idx = i;
            }
        }
        return val;
    }

    public int getMax(int[] arr){
        return getMinOrMax(arr, new Compare() {
            @Override
            public boolean compare(int num1, int num2) {
                return num1 > num2;
            }
        });
    }

    public int getMin(int[] arr){
        return getMinOrMax(arr, new Compare() {
            @Override
            public boolean compare(int num1, int num2) {
                return num1 < num2;
            }
        });
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3, 23, 85, 34, 17, 74, 25, 52, 65};
        MinMaxValPoly minMaxValPoly = new MinMaxValPoly();
        int max = minMaxValPoly.getMax(arr);
        int min = minMaxValPoly.getMin(arr);
        System.out.println(min+" "+max);

    }
}
