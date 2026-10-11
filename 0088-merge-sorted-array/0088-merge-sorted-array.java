class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArray = new int[m+n];
        int index1 = 0;
        int index2 = 0;
        int i = 0;
        while(index1 < m && index2 < n){
            // compare nums1 and nums2 val
            if(nums1[index1] <= nums2[index2]){
                newArray[i] = nums1[index1];
                index1++;
            }
            else{
                newArray[i] = nums2[index2];
                index2++;
            }
            i++;
        };
        while(index1 < m){
            newArray[i++] = nums1[index1++];
        }
        while(index2 < n){
            newArray[i++] = nums2[index2++];
        }
        for(int j = 0;j<newArray.length;j++){
            nums1[j] = newArray[j]; 
        }
    }
}