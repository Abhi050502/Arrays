public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 6};
        int even = 0, odd = 0;
        for (int i : arr) {
            if (i % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even = " + even + ", Odd = " + odd);
    }
}