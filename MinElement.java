public class MinElement {
    public static void main(String[] args) {
        int[] arr = {5, 25, 10, 15};
        int min = arr[0];
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        System.out.println("Minimum = " + min);
    }
}