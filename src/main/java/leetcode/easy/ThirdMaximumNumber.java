package leetcode.easy;

public class ThirdMaximumNumber {
    final int DEFAULT = Integer.MIN_VALUE;
    int[] maxArray = new int[] {DEFAULT, DEFAULT, DEFAULT};
    public int thirdMax(int[] nums) {

        //maxArray[0] = nums[0];
        for(int num : nums) {
            if(num >= maxArray[0]) {
                setMaxArray(0, num);
            }
            else if(num >= maxArray[1] && num < maxArray [0]) {
               setMaxArray(1, num);
            }
            else if(num > maxArray[2]){
                setMaxArray(2, num);
            }

        }
        return maxArray[2];
    }

    private void setMaxArray(int position, int num){
        switch (position) {
            case 0 :
                if(maxArray[0]!= DEFAULT)
                    setMaxArray(position+1, maxArray[0]);
                maxArray[0] = num;
                break;
            case 1 :
                if(maxArray[1]!= DEFAULT)
                    setMaxArray(position+1, maxArray[1]);
                maxArray[1] = num;
            break;
            case 2 : maxArray[2] = num;
            break;
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {1,4,66,22,87};
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int output = thirdMaximumNumber.thirdMax(inputArray);
        System.out.println(output);
    }
}
