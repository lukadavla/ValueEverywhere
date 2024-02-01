public class ValueEverywhere {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 1, 3};
        System.out.println(isEverywhere(array1, 1)); 

        int[] array2 = {1, 2, 1, 3};
        System.out.println(isEverywhere(array2, 2));
    }

    public static boolean isEverywhere(int[] nums, int value) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != value && nums[i + 1] != value) {
                return false;
            }
        }
        return true;
    }
}

