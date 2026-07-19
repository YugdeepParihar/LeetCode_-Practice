class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int k = 0;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums3[k] = nums1[i];
                i++;
                k++;
            } else {
                nums3[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            nums3[k++] = nums1[i++];
        }
        while (j < n) {
            nums3[k++] = nums2[j++];
        }

        for (int a = 0; a < m + n; a++) {
            nums1[a] = nums3[a];
        }

    }
}