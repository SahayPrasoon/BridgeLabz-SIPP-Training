public class BinarySearchFirstLastOccurrence {
    public static int[] findFirstAndLast(int[] arr, int target) {
        int first = findBound(arr, target, true);
        int last = findBound(arr, target, false);
        return new int[]{first, last};
    }

    private static int findBound(int[] arr, int target, boolean isFirst) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (isFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int[] result = findFirstAndLast(arr, 2);
        System.out.println("First: " + result[0] + ", Last: " + result[1]);
    }
}
