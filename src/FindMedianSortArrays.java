import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMedianSortArrays {
    public static void main(String[] args) {
        int[] n1 = {1,3};
        int[] n2={2};
        double c = findMedianSortedArrays(n1,n2);
        System.out.println(c);
    }
    //小白算法
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num3 = new int[nums1.length+ nums2.length];
        for(int i = 0;i<nums1.length;i++){
            num3[i] = nums1[i];
        }
        int count = 0;
        for(int i = nums1.length;i<num3.length;i++){
            num3[i] = nums2[count++];
        }
        Arrays.sort(num3);
        if(num3.length%2==0) {
            return 1.0 * (num3[num3.length / 2] + num3[num3.length / 2 - 1]) / 2.0;
        }
        return 1.0*num3[num3.length/2];
    }
}
