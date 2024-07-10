package freak_coding.curious_freaks;

public class ThirdMaxInArr {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3 };
        System.out.println(findThirdMaxInArr(arr));
    }

    public static int findThirdMaxInArr(int[] arr) {
        if (arr == null || arr.length < 3)
            return -1;
        int max1 = 0, max2 = 0, max3 = 0;
        for (int val : arr) {
            if (val > max1) {
                max3 = max2;
                max2 = max1;
                max1 = val;
            } else if (val > max2) {
                max3 = max2;
                max2 = val;
            } else if (val > max3) {
                max3 = val;
            }
        }
        return max3;
    }
}
