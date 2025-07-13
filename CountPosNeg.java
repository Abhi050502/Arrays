public class CountPosNeg {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5};
        int pos = 0, neg = 0;
        for (int i : arr) {
            if (i >= 0) pos++;
            else neg++;
        }
        System.out.println("Positive = " + pos + ", Negative = " + neg);
    }
}