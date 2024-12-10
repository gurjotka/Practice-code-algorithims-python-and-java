import java.util.Arrays;

public class Main {

    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (i>=0 && j>=0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i-=1;
            }
            else {
                nums1[k] = nums2[j];
                j-=1;
            }
            k-=1;
        }

        while (j>=0) {
            nums1[k] = nums2[j];
            j-=1;
            k-=1;
        }

        System.out.println(Arrays.toString(nums1));

    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        mergeSortedArray(nums1, 0, nums2, 1);

        nums1 = new int[] {1};
        nums2 = new int[] {};
        mergeSortedArray(nums1, 1, nums2, 0);

        nums1 = new int[] {1,2,3,0,0,0};
        nums2 = new int[] {2,5,6};
        mergeSortedArray(nums1, 3, nums2, 3);
    }
}


