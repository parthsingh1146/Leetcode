class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        int indexI = 0;
        int indexJ = 0;
        int index = 0;

        while (indexI < m && indexJ < n) {
            if (arr[indexI] <= nums2[indexJ]) {
                nums1[index] = arr[indexI];
                indexI++;
            } else {
                nums1[index] = nums2[indexJ];
                indexJ++;
            }
            index++;
        }

        while (indexI < m) {
            nums1[index] = arr[indexI];
            indexI++;
            index++;
        }

        while (indexJ < n) {
            nums1[index] = nums2[indexJ];
            indexJ++;
            index++;
        }
    }
}