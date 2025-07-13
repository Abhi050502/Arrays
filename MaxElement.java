public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {5, 25, 10, 15};
        int max = arr[0];
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        System.out.println("Maximum = " + max);
    }
}