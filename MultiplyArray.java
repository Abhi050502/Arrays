public class MultiplyArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        System.out.println("Product = " + product);
    }
}