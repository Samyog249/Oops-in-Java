public class SearchElements {

    public static void main(String[] args) {
        int[] numbers = {10, 23, 45, 70, 11, 15};
        int target = 70;
        int result = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                result = i;
                break; 
            }
        }

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}