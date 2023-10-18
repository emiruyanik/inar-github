package week_07.live_class;

public class Mod_Three {
    public static void main(String[] args) {
        int[] nums = {9, 7, 2, 9};
        boolean isModThree = modThree(nums);
        System.out.println(isModThree);
    }

    public static boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int numb = nums[i];
            int count = 0;
            boolean isEvenOrOdd = isEvenOrOdd(numb);
            if (isEvenOrOdd) {
                count++;
                for (int j = i + 1; j < nums.length; j++) {
                    if (isEvenOrOdd(nums[j])) {
                        count++;
                        if (count == 3) {
                            return true;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                count++;
                for (int j = i + 1; j < nums.length; j++) {
                    if (!isEvenOrOdd(nums[j])) {
                        count++;
                        if (count == 3) {
                            return true;
                        }
                    } else {
                        break;
                    }
                }

            }
        }
        return false;
    }

    public static boolean isEvenOrOdd(int numb) {
        return numb % 2 == 0;
    }
}
