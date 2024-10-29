package Top150Interviews.Arrays.MergeSortedArray;
import java.util.Scanner;
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n;
        while (n != 0)
        {
            if (m == 0)
            {
                for (; i != 0; i--) {
                    nums1[i-1] = nums2[i-1];
                }
                break;
            }
            else {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[i - 1] = nums1[m - 1];
                    m--;
                    i--;

                } else {
                    nums1[i - 1] = nums2[n - 1];
                    n--;
                    i--;
                }
            }
        }
    }
}

