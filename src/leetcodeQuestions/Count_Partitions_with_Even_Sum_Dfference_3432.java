package leetcodeQuestions;

public class Count_Partitions_with_Even_Sum_Dfference_3432 {

    public static void main(String[] args) {

        int[] nums= {10,10,3,7,6};

        System.out.println(countPartitions(nums));
    }
    public static int countPartitions(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int temp1 = 0;

        for (int i = 0; i < n; ++i) {
            int temp2 = n - i - 1;

            temp1 += nums[i];

            int sub = temp1 - temp2;

            if (sub % 2 == 0) {
                ans++;
            }
        }
            return ans;

    }
    //    public static int oddOrEven(int sub){
//
//        int ans =0;
//        if(sub %2 ==0){
//            ans++;
//        }
//        return ans;
//    }
}
