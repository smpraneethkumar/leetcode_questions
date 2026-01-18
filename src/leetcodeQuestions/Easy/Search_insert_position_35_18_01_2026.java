package leetcodeQuestions.Easy;

public class Search_insert_position_35_18_01_2026 {

    public static void main (String [] args){

//        int[] nums= {1,2,3,4,5,6,7,8,9};
//        int target = 7;
//        int r = nums.length-1;
//        int l =0;
//        int m = l + (r-l) /2 ;
//
//        System.out.println(nums[m]);
//        System.out.println(nums[l]);
//        System.out.println(nums[r]);
//
////        if()
//
//        int i = 0;
//        while (i<=r){
//            if(nums[i] ==  target){
//                System.out.println("mid"+i);
//            } else if (nums[m]<target) {
//                r = m;
//                m = (r-l) /2;
//
//            }
//        }

int nums[] = {1,3,5,6};
int target = 2;
        System.out.println(searchInsert(nums,target));
    }
    public  static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // left is the correct insert position
        return left;
    }
}
