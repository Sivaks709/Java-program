public class Leedcode_MG_Sort {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 }, nums2[] = { 5, 2, 6 }, m = 3, n = 3;
        Leedcode_MG_Sort ref = new Leedcode_MG_Sort();
        ref.merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) { 
            nums1[i] = nums2[j];
            i++;
        }
    }
}
