public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1, 4};
        int num = 1, count = 0;
        for (int i : arr) {
            if (i == num) count++;
        }
        System.out.println("Frequency = " + count);
    }
}