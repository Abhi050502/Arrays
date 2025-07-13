public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int key = 15;
        boolean found = false;
        for (int i : arr) {
            if (i == key) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Found" : "Not Found");
    }
}